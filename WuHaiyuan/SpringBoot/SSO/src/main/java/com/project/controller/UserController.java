package com.project.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {

    @RequestMapping("hello")
    public String hello(){
        return "hello , boot !";
    }

    @RequestMapping("enroll")
    public String enroll(String userName,String password){
        String ret = "0";
        if(userName != null && password!=null){
            System.out.println("注册用户:"+userName+"/"+password);
            ret = "1";
        }
        return ret;
    }
    @RequestMapping("login")
    public String login(String userName,String password){
        String ret = "0";
        if("小白".equals(userName) && "123".equals(password) ){
            System.out.println("登录用户:"+userName+"/"+password);
            ret = "1";
        }
        return ret;
    }


}
