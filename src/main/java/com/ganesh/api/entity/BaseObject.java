package com.ganesh.api.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;


@Data
@MappedSuperclass
public class BaseObject implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @JsonIgnore
    @Column(name="is_deleted")
    private boolean deleted;

    @JsonIgnore
    @Column(name="date_created")
    private Timestamp dateCreated = new Timestamp(System.currentTimeMillis());

    @JsonIgnore
    @Column(name="date_modified")
    private Timestamp dateModified;

}
