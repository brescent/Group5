package com.project.config;

import com.project.entity.UserEntity;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//配置类
@Configuration
public class BeanConfig {
     @Bean(value = "userEntity")
    public UserEntity userEntity(){
        UserEntity user=new UserEntity();
        user.setUserName("赵云");
        return user;
    }
}
