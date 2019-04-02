package com.jysd.dphweb;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.jysd.dphweb.dao.ADDao")
public class DphwebApplication {

    public static void main(String[] args) {
        SpringApplication.run(DphwebApplication.class, args);
    }

}
