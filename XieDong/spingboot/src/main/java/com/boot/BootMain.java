package com.boot;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


@MapperScan("com.boot.dao")
@SpringBootApplication
public class BootMain {

    public static void main(String[] args) {
        SpringApplication.run(BootMain.class);
    }
}
