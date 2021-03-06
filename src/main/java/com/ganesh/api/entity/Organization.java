package com.ganesh.api.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table(name="organization")
public class Organization extends BaseObject {

    @Column(name="org_code", nullable = false)
    private String orgCode;

    @Column(name="org_name", nullable = false)
    private String orgName;
}
