package com.ffood;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.ffood.dao")
public class FfoodApplication {

    public static void main(String[] args) {
        SpringApplication.run(FfoodApplication.class, args);
    }

}
