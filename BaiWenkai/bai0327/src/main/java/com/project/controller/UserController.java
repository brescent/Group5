package com.project.controller;

import com.alibaba.fastjson.JSON;
import com.project.entity.LimitEntity;
import com.project.entity.UserEntity;
import com.project.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    IUserService service;

    @RequestMapping("login")
    public String login(String userName, String password,HttpServletRequest request){
        UserEntity user = service.login(userName,password);
        if (user != null){
            request.getSession().setAttribute("loginUser",user);
            return "display";
        }

        return "index";
    }

    @RequestMapping("display")
    @ResponseBody
    public List<LimitEntity> getLimitByUserId(HttpServletRequest request){
        UserEntity user = null;
        user = (UserEntity) request.getSession().getAttribute("loginUser");

        int id = user.getId();
        List<LimitEntity> list = service.getLimitByUserId(id);
        return list;
    }
}
