package com.project.controller;



import com.project.dao.IUserDao;
import com.project.entity.UserEntity;
import com.project.entity.UserInfoEntity;
import com.project.service.impl.UserServiceImpl;
import org.apache.http.HttpRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

//整个类的方法不会再做视图渲染，只返回数据
@RestController
public class UserController {

@Autowired
private UserServiceImpl service;

    @RequestMapping(value = "getUserInfo/{name}", method = RequestMethod.GET)
    //@ResponseBody //不做视图渲染，只返回数据
    public UserEntity getUserInfo(@PathVariable("name")String name, HttpServletRequest request){

     return service.getUserInfo(name);
    }

    @RequestMapping(value = "register", method = RequestMethod.POST)
    public void register(@PathVariable("user")UserEntity user){

        service.register(user);
    }

    @RequestMapping("getAllUser")
    public List<UserEntity> getAllUser(){

        return   service.getAllUser();

    }

    @RequestMapping("addInfo")
    public void addInfo( @PathVariable("userInfo")UserInfoEntity userInfo){

    }
}
