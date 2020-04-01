package com.boot.controller;


import com.boot.entity.UserEntity;
import com.boot.service.IUserservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class UserController {


    @Autowired
    private IUserservice  service;
    @Autowired
    private UserEntity user;



@RequestMapping("register/{name}/{pwd}")
public void register(@PathVariable String name, @PathVariable String pwd, HttpServletRequest request){
    user=new UserEntity();

    user.setName(name);
    user.setPwd(pwd);

    System.out.println(user.getName()+":"+user.getPwd());
    service.register(user);
}
    @RequestMapping("login/{name}/{pwd}")
    public UserEntity login(@PathVariable String name, @PathVariable String pwd, HttpServletRequest request){
     UserEntity user=new UserEntity();

        user=service.login(name,pwd);


       if(user!=null){
           System.out.println(name);

           return user;
       }else{
           return null;
       }


    }

}
