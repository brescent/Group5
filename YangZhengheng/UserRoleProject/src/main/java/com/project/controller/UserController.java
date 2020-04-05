package com.project.controller;

import com.project.entity.PowerEntity;
import com.project.entity.UserEntity;
import com.project.service.IUserService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

;import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {

    @Autowired
    IUserService service;

//    @RequestMapping("login")
//    public String  login(String userName, String pwd, HttpServletRequest request, HttpServletResponse response){
//
//        UserEntity user=service.login(userName,pwd);
//        if(user==null){
//            return "index";
//        }
//        HttpSession session=request.getSession();
//
//        session.setAttribute("user",user);
//        return "user";
//    }

//    @RequestMapping(value = "find")
//    public  List<PowerEntity>  find(HttpServletRequest request, HttpServletResponse response){
//        UserEntity user= (UserEntity) request.getSession().getAttribute("user");
//
//        List<Object[]> ObjList = service.getRoleByUserId(user.getId());
//        List<PowerEntity> powerList=new ArrayList<>();
//        PowerEntity powerEntity=null;
//        List<Object[]> powerEntityList = service.getRoleByUserId(1);
//        for (Object[] obj:powerEntityList){
//            int id= (int) obj[0];
//            String powerName= (String) obj[1];
//            String url= (String) obj[2];
//            powerEntity=new PowerEntity();
//            powerEntity.setId(id);
//            powerEntity.setPowerName(powerName);
//            powerEntity.setPowerUrl(url);
//            powerList.add(powerEntity);
//
//        }

//        return powerList;
//    }

    @RequestMapping(value = "GoTOLogin")
    public  String  GoTOLogin(){
        return "LoginPage";
    }

    @RequestMapping(value = "login")
    public ModelAndView login(String userName,String pwd, HttpServletRequest request, HttpServletResponse response){
        ModelAndView mv=new ModelAndView();
        UserEntity user=service.login(userName, pwd);
        if (user==null){
            RedirectView rv=new RedirectView("/GoTOLogin");
            mv.setView(rv);
        }
        HttpSession session=request.getSession();
        session.setAttribute("user",user);

        RedirectView rv=new RedirectView("/getUserPower");
        mv.setView(rv);
        return  mv;
    }



    @RequestMapping(value = "getUserPower")
    public ModelAndView getPower( HttpServletRequest request, HttpServletResponse response){
        ModelAndView mv=new ModelAndView("UserRolePage");
        UserEntity user= (UserEntity) request.getSession().getAttribute("user");

        List<Object[]> ObjList = service.getRoleByUserId(user.getId());
        List<PowerEntity> powerList=new ArrayList<>();
        PowerEntity powerEntity=null;

        for (Object[] obj:ObjList){
            int id= (int) obj[0];
            String powerName= (String) obj[1];
            String url= (String) obj[2];
            powerEntity=new PowerEntity();
            powerEntity.setId(id);
            powerEntity.setPowerName(powerName);
            powerEntity.setPowerUrl(url);
            powerList.add(powerEntity);
        }
        mv.addObject("powerList",powerList);
        HttpSession session=request.getSession();
        session.setAttribute("powerList",powerList);
        return mv;
    }
}
