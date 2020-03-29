package com.project.controller;


import com.project.entity.PowerEntity;
import com.project.entity.UserEntity;

import com.project.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

//整个类的方法不会再做视图渲染，只返回数据
@RestController
public class UserController {

@Autowired
private UserServiceImpl service;

    @RequestMapping(value = "/login/{userName}/{password}", method = RequestMethod.GET)
    //@ResponseBody //不做视图渲染，只返回数据
    public ModelAndView getUserInfo(@PathVariable("userName")String userName, @PathVariable("password")String password, HttpServletRequest request){
        ModelAndView mv=new ModelAndView("main.jsp");
     UserEntity user= service.login(userName,password);


     if(user!=null){
      request.setAttribute("user",user);

      List<PowerEntity> list=service.getAllPower();

      mv.addObject("powerList",list);

     }

     return  mv;
    }






}
