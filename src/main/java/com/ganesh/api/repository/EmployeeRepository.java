package com.ganesh.api.repository;

import com.ganesh.api.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    Employee findByEmployeeCode(String employeeCode);

}
