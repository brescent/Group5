package com.project.controller;

import com.alibaba.fastjson.JSON;
import com.project.entity.UserEntity;
import com.project.service.IUserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;


//整个类的方法不会再做视图渲染，只返回数据
@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping("login")
    public String login(String userName, String password,
                        HttpServletRequest request) {


        UserEntity user = userService.login(userName, password);
        String userStr = null;
        if (user != null) {
            request.getSession().setAttribute("user", user);
            userStr = user.toString();
        }
        return userStr;
    }


    @RequestMapping("getUser")
    public String getUser( HttpServletRequest request){
        UserEntity user = (UserEntity) request.getSession().getAttribute("user");
        if (user != null) {
            return  JSON.toJSONString(user);
        }
        return null;
    }
}
