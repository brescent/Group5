package com.project.controller;

import com.project.entity.UserEntity;
import com.project.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    @Autowired
    private IUserService userService;
    @RequestMapping(value = "findUserAfter/{name}", method = RequestMethod.GET)
    public UserEntity findByName(@PathVariable("name")String name){
        return  userService.findByName(name);
    }
    @RequestMapping(value = "addUserAfter" ,method = RequestMethod.POST)
    public void addUser(@RequestBody UserEntity user){
        userService.addUser(user);
    }
}
