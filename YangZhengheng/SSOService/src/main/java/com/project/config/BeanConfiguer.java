package com.project.config;

import com.project.entity.UserEntity;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguer {

    @Bean(value = "user")
    public UserEntity user(){
        UserEntity user=new UserEntity();
        user.setUserName("Will");
        user.setPwd("123");
        return user;
    }
}
