package com.sample.jpa.demojpa.model.generation_type;

import javax.persistence.*;
import java.io.Serializable;

@Entity
class UserTable implements Serializable {

    @Id @GeneratedValue(strategy = GenerationType.TABLE,generator = "user_Table_Generator")
    @TableGenerator(name = "user_Table_Generator",table = "user_Id_Table")
    private Long id;
}
