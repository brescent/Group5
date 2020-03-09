package com.project.controller;



import com.project.dao.IUserDao;
import com.project.entity.UserEntity;
import com.project.service.impl.UserServiceImpl;
import org.apache.http.HttpRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

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
}
