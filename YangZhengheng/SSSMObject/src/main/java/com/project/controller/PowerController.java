package com.project.controller;

import com.project.entity.PowerEntity;
import com.project.entity.UserEntity;
import com.project.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

@RestController
public class PowerController {

    @Autowired
    IUserService service;

    @RequestMapping(value = "find")
    public  List<PowerEntity>  find(HttpServletRequest request, HttpServletResponse response){
        UserEntity user= (UserEntity) request.getSession().getAttribute("user");

        List<Object[]> ObjList = service.getRoleByUserId(user.getId());
        List<PowerEntity> powerList=new ArrayList<>();
        PowerEntity powerEntity=null;
        List<Object[]> powerEntityList = service.getRoleByUserId(1);
        for (Object[] obj:powerEntityList){
            int id= (int) obj[0];
            String powerName= (String) obj[1];
            String url= (String) obj[2];
            powerEntity=new PowerEntity();
            powerEntity.setId(id);
            powerEntity.setPowerName(powerName);
            powerEntity.setPowerUrl(url);
            powerList.add(powerEntity);

        }

        return powerList;
    }
}
