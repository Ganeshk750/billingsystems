package com.ganesh.api.repository;

import com.ganesh.api.entity.AppEntityCode;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppEntityCodeRepository extends JpaRepository<AppEntityCode, Long> {

    AppEntityCode findByCode(String code);

}
