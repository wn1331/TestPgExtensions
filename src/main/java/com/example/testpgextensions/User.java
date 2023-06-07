package com.example.testpgextensions;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "users")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

//    @ColumnTransformer(forColumn = "name", read = "pgp_sym_decrypt(name, 'password')", write = "pgp_sym_encrypt(?, 'password')")
//    @Column(name = "name", columnDefinition = "bytea")
    private String name;

//    @ColumnTransformer(forColumn = "password", read = "pgp_sym_decrypt(password, 'password')", write = "pgp_sym_encrypt(?, 'password')")
//    @Column(name = "password", columnDefinition = "bytea")
    private String password;

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }



    public static User createUser(String name,String password){
        return new User(name,password);
    }
}
