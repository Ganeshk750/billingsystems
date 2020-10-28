package com.ganesh.api.service;

import com.ganesh.api.common.CodeGenerator;
import com.ganesh.api.common.Utils;
import com.ganesh.api.common.enums.CodeType;
import com.ganesh.api.common.enums.UserType;
import com.ganesh.api.dto.*;
import com.ganesh.api.entity.*;
import com.ganesh.api.exception.InvalidInputException;
import com.ganesh.api.mapper.CustomerMapper;
import com.ganesh.api.mapper.EmployeeMapper;
import com.ganesh.api.mapper.UserMapper;
import com.ganesh.api.mapper.VendorMapper;
import com.ganesh.api.message.ResponseMessage;
import com.ganesh.api.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RegistrationService {

    private BillingBaseService billingBaseService;

    private RoleRepository roleRepository;

    private CodeGenerator codeGenerator;

    @Autowired
    public RegistrationService(BillingBaseService billingBaseService, RoleRepository roleRepository, CodeGenerator codeGenerator) {
        this.billingBaseService = billingBaseService;
        this.roleRepository = roleRepository;
        this.codeGenerator = codeGenerator;
    }

    @Value("${default.role}")
    private  String defaultRole;

    public ResponseMessage<BaseDto> doRegistration(UserDto userDto) throws Exception {

        ResponseMessage<BaseDto> responseMessage = null;
        String type = userDto.getType();

        try {
            UserType userType = UserType.valueOf(type.toUpperCase());
            User user = UserMapper.INSTANCE.userDTOtoUser(userDto);
            Role role = roleRepository.findByName(defaultRole).orElse(null);
            List<Role> roleList = new ArrayList<>();
            roleList.add(role);
            user.setRoles(roleList);
            if (type.equalsIgnoreCase(UserType.EMPLOYEE.name())) {
                Employee employee = new Employee();
                employee.setFullName(Utils.getFullName(user.getFirstName(), user.getMiddleName(),
                        user.getLastName()));
                employee.setEmployeeCode(codeGenerator.newCode(CodeType.EMPLOYEE_CODE));
                employee.setUser(user);
                user.getAddressList().get(0).setUser(user);

                BaseObject newObject = billingBaseService.save(employee); // Holds the reference of Employee
                EmployeeDto employeeDto = EmployeeMapper.INSTANCE.employeeToDto((Employee) newObject);
                responseMessage = ResponseMessage.withResponseData(employeeDto, "Employee Created SuccessFuly", "message");
            } else if (type.equalsIgnoreCase(UserType.CUSTOMER.name())) {
                Customer customer = new Customer();
                customer.setCustomerCode(codeGenerator.newCode(CodeType.CUSTOMER_CODE));
                customer.setFullName(Utils.getFullName(user.getFirstName(), user.getMiddleName(),
                        user.getLastName()));
                customer.setUser(user);
                user.getAddressList().get(0).setUser(user);
                BaseObject newObject = billingBaseService.save(customer);
                CustomerDto customerDto = CustomerMapper.INSTANCE.customerToDto((Customer) newObject);
                responseMessage = ResponseMessage.withResponseData(customerDto, "Customer Created Successfully", "message");
            } else if (type.equalsIgnoreCase(UserType.VENDOR.name())) {
                Vendor vendor = new Vendor();
                vendor.setFullName(Utils.getFullName(user.getFirstName(), user.getMiddleName(), user.getLastName()));
                vendor.setEmployeeCode(codeGenerator.newCode(CodeType.VENDOR_CODE));
                vendor.setUser(user);
                user.getAddressList().get(0).setUser(user);
                BaseObject newObject = billingBaseService.save(vendor);
                VendorDto vendorDto = VendorMapper.INSTANCE.vendorTOVendorDTO((Vendor) newObject);
                responseMessage = ResponseMessage.withResponseData(vendorDto, "Vendor Created Successfully", "message");
            }

        } catch (IllegalArgumentException e) {
            throw new InvalidInputException(String.format("Invalid user type %s ", type));
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
        return responseMessage;
    }
}
