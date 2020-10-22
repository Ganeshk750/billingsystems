package com.ganesh.api.common;

import com.ganesh.api.common.enums.CodeType;
import com.ganesh.api.entity.AppEntityCode;
import com.ganesh.api.repository.AppEntityCodeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class CodeGenerator {

    private AppEntityCodeRepository appEntityCodeRepository;

    @Autowired
    public CodeGenerator(AppEntityCodeRepository appEntityCodeRepository) {
        this.appEntityCodeRepository = appEntityCodeRepository;
    }

    public String newCode(CodeType codeType){
        String code = "";
        AppEntityCode appEntityCode = null;
        do{
            String newCode = getCode();
            appEntityCode = appEntityCodeRepository.findByCode(newCode);
            if(appEntityCode == null){
                code = newCode;
            }
        }while(appEntityCode != null);
            appEntityCode = new AppEntityCode();
            appEntityCode.setCode(code);
            appEntityCode.setCodeType(codeType);
            appEntityCodeRepository.save(appEntityCode);
            return  appEntityCode.getCode();

    }

    private String getCode() {
        Random random = new Random(System.currentTimeMillis());
        int id = ((1 + random.nextInt(2)) * 1000 + random.nextInt(10000));
        return  String.valueOf(id);
    }
}
