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
            //랜덤이름, 랜덤숫자 비밀번호의 계정 생성
            PgRequestDTO dto = new PgRequestDTO(faker.name().fullName(),Integer.toString((int)(Math.random()*100000000)));

            pgRepository.save(dto.toEntity());
        }

    }

}
