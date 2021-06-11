package com.sample.jpa.demojpa.model.generation_type;

import org.hibernate.annotations.GeneratorType;

import javax.persistence.*;
import java.io.Serializable;

@Entity
class UserSequence implements Serializable {

    @Id @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "User_Identity_generator")
    @SequenceGenerator(name="User_Identity_generator", sequenceName = "User_Sequence_1", allocationSize=50,initialValue = 1)
    private Long id;


}
