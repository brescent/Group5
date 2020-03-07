package com.project.test;

import com.project.service.IUserService;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class UserTest {
    @Resource
    private IUserService service;

    @Test
    public void test(){

      //  service.findAllUser();
       // service.addUser(new UserEntity("小明","666","1111"));
        //service.deleteUser(4);
        service.updateUser(3,"444");
    }
}
