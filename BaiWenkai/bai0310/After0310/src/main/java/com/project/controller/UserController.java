package com.project.controller;

import com.project.entity.InfoEntity;
import com.project.entity.UserEntity;
import com.project.service.IInfoService;
import com.project.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController(value = "user")
public class UserController {

    @Autowired
    private IUserService service;

    @Autowired
    private IInfoService infoService;

    @RequestMapping("addUser")
    public void addUSer(UserEntity user) {
        service.addUSer(user);
    }

    @RequestMapping("findById/{id}")
    public UserEntity findById(@PathVariable("id") int id) {
        UserEntity user = service.findById(id);
        return user;
    }

    @RequestMapping("findByUserId/{userId}")
    public List<InfoEntity> findByUserId(@PathVariable("userId") int userId){
        return infoService.findByUserId(userId);
    }
}
