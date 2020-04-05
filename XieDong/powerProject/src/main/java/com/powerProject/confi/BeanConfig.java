package com.powerProject.confi;


import com.powerProject.entity.UserEntity;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 将实体类交给spring框架
 */
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
