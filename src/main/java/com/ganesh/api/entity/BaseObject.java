package com.ganesh.api.entity;

import java.io.Serializable;
import java.sql.Timestamp;

public class BaseObject implements Serializable {

    private Long id;
    private boolean deleted;
    private Timestamp dateCreated = new Timestamp(System.currentTimeMillis());
    private Timestamp dateModified;

}
