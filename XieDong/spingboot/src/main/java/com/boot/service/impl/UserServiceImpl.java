package com.boot.service.impl;

import com.boot.dao.UserDao;
import com.boot.entity.UserEntity;
import com.boot.service.IUserservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserServiceImpl implements IUserservice {


   @Autowired
   private UserDao userDao;

    @Override
    public void addUser(UserEntity user) {

    }

    @Override
    public UserEntity login(String name, String pwd) {
       return   userDao.login(name,pwd);
    }

    @Override
    public void register(UserEntity user) {

        userDao.register(user);
    }

    @Override
    public List<UserEntity> findAll() {
        return userDao.findAll();
    }
}
