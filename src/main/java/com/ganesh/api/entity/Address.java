package com.ganesh.api.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="address")
public class Address extends BaseObject {

    @Column(name="ADDRESS1", nullable = false)
    private String address1;

    @Column(name="ADDRESS2", nullable = false)
    private String address2;

    @Column(name="CITY", nullable = false)
    private String city;

    @Column(name="STATE", nullable = false)
    private String state;

    @Column(name="COUNTRY", nullable = false)
    private String country;

    @Column(name="LANDMARK", nullable = false)
    private String landmark;

    @Column(name="MOBILE", nullable = false)
    private String mobile;

    @JsonBackReference
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name="USER_ID")
    private User user;
}
