package com.project.controller;

import com.project.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserEntity user;

    @RequestMapping("hello")
    public UserEntity  hello(){
        return user;
    }

    @RequestMapping(value = "addUser/{name}/{pwd}",method = RequestMethod.GET)
    public void addUser(@PathVariable("name") String name, @PathVariable("pwd") String pwd){
        System.out.println("用户名："+name+"密码:"+pwd
        );
    }
}
