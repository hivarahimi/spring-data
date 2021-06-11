package com.sample.jpa.demojpa.model.generation_type;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.UUID;

@Entity
class UserUUId implements Serializable {

    @Id @GeneratedValue
    private UUID id;
}
