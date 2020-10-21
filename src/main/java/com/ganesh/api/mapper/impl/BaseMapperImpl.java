package com.ganesh.api.mapper.impl;

import com.ganesh.api.dto.BaseDto;
import com.ganesh.api.entity.BaseObject;
import com.ganesh.api.mapper.BaseMapper;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-10-21T16:45:26+0530",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_102 (Oracle Corporation)"
)
public class BaseMapperImpl implements BaseMapper {

    @Override
    public BaseDto baseObjectToDto(BaseObject baseObject) {
        if ( baseObject == null ) {
            return null;
        }

        BaseDto baseDto = new BaseDto();

        return baseDto;
    }

    @Override
    public BaseObject dtoToEmployee(BaseDto baseDto) {
        if ( baseDto == null ) {
            return null;
        }

        BaseObject baseObject = new BaseObject();

        return baseObject;
    }
}
