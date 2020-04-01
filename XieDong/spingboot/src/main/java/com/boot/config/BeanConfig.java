package com.boot.config;


import com.boot.entity.UserEntity;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
public class BeanConfig{


    @Bean
    public UserEntity userEntity(){

        UserEntity user=new UserEntity();

        user.setName("战是干");
        return user;
    }
}
