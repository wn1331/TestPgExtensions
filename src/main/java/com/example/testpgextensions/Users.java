package com.example.testpgextensions;

import jakarta.persistence.*;
import org.hibernate.annotations.ColumnTransformer;

@Entity
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

//    @ColumnTransformer(forColumn = "name", read = "pgp_sym_decrypt(name, 'password')", write = "pgp_sym_encrypt(?, 'password')")
//    @Column(name = "name", columnDefinition = "bytea")
    private String name;

//    @ColumnTransformer(forColumn = "password", read = "pgp_sym_decrypt(password, 'password')", write = "pgp_sym_encrypt(?, 'password')")
//    @Column(name = "password", columnDefinition = "bytea")
    private String password;

    public Users() {

    }
    public Users(String name, String password) {
        this.name = name;
        this.password = password;
    }



    public static Users createUser(String name,String password){
        return new Users(name,password);
    }
}
