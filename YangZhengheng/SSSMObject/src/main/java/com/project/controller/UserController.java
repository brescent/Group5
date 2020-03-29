package com.project.controller;

import com.project.entity.PowerEntity;
import com.project.entity.UserEntity;
import com.project.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

 ;import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {

    @Autowired
    IUserService service;

    @RequestMapping("login")
    public String  login(String userName, String pwd, HttpServletRequest request, HttpServletResponse response){

        UserEntity user=service.login(userName,pwd);
        if(user==null){
            return "index";
        }
        HttpSession session=request.getSession();

        session.setAttribute("user",user);
        return "user";
    }


}
