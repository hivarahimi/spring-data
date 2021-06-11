package com.sample.jpa.demojpa.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Person implements Serializable {

    @Id @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    
    private String name;
    private String family;
    private String nationalCode;
    private String fatherName;

}
