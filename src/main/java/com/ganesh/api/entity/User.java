package com.ganesh.api.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name="user")
public class User extends BaseObject {

    @Column(name="emailId", nullable = false)
    private String emailId;

    @Column(name="firstName", nullable = false)
    private String firstName;

    @Column(name="middleName", nullable = false)
    private String middleName;

    @Column(name="lastName", nullable = false)
    private String lastName;

    @Column(name="mobile_no", nullable = false)
    private String mobileNo;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Address> addressList;

    @ManyToMany(targetEntity = Role.class, cascade = {CascadeType.DETACH,
            CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    private List<Role> roles;

}
