package com.project.controller;


import com.project.entity.UserEntity;
import com.project.entity.UserInfoEntity;
import com.project.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class UserController {
    /***/
    @Autowired
    private IUserService service;
    int id=0;
    @RequestMapping("addUser")
    public  String addUser(UserEntity user){

        service.addUser(user);
        id=user.getId();
         return "ok";
    }
    @RequestMapping("addUserInfo")
    public String addUserInfo(UserInfoEntity info){
        info.setUserId(id);
        service.addUserInfo(info);
        return "ok";
    }

    @RequestMapping("login")
    public UserEntity login(){

        UserEntity user=service.findUser(id);
        return user;
    }
}
