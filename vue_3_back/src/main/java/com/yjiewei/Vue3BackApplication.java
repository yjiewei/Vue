package com.yjiewei;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.yjiewei.dao")
@SpringBootApplication
public class Vue3BackApplication {

    public static void main(String[] args) {
        SpringApplication.run(Vue3BackApplication.class, args);
    }

}
