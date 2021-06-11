package com.sample.jpa.demojpa.model.generation_type;

import javax.persistence.*;
import java.io.Serializable;

@Entity
class UserIdentity implements Serializable {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long id;
}
