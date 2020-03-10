package com.project.controller;

import com.project.entity.UserEntity;
import com.project.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.IOException;

@RestController
@RequestMapping("user")
public class UserController {
    @Resource(name = "us")
    private IUserService service;

    @RequestMapping(value = "getUser/{id}",method = RequestMethod.GET)
    UserEntity findUser(@PathVariable("id") int id) throws IOException {
        return service.findUser(id);
    }

    @RequestMapping(value = "addUser",method = RequestMethod.POST)
    void addUser(UserEntity user){
        service.addUser(user);
    }
}
