package com.project.controller;

import com.project.entity.UserEntity;

import com.project.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private IUserService service;

    @RequestMapping(value = "find/{name}",method = RequestMethod.GET)
    public UserEntity findUser(@PathVariable("name") String name){

        return service.findUser(name);

    }

}
