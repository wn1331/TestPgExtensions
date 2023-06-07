package com.example.testpgextensions;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TestPgExtensionsApplicationTests {

    @Autowired
    private PgRepository pgRepository;

    @Test
    void createUser(){
        for(int i = 0;i<50;i++){

            //랜덤 이름 생성 라이브러리(Faker).
            Faker faker = new Faker();
            //랜덤 이름 생성
            String name = faker.name().fullName();
            //랜덤 비밀번호 생성
            String password = Integer.toString((int)(Math.random()*100000000));
            //계정 생성
            Users usr = new Users(name,password);

            pgRepository.save(usr);
        }

    }

}
