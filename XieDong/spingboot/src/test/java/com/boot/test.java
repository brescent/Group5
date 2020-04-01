package com.boot;


import com.boot.entity.UserEntity;
import com.boot.service.IUserservice;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)

@SpringBootTest(classes =BootMain.class )
public class test {

    @Autowired
    private IUserservice service;

    @Test
    public void test(){

       List<UserEntity> list= service.findAll();

       for(UserEntity user:list){

           System.out.println(user.getName());
       }
    }
}
