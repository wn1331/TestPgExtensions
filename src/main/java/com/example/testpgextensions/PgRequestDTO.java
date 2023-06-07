package com.example.testpgextensions;

public record PgRequestDTO(String name, String password) {

    public Users toEntity(){
        return Users.createUser(name,password);
    }
}
