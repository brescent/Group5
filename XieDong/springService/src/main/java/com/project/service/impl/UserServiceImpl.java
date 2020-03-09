package com.project.service.impl;


import com.project.dao.IUserDao;
import com.project.entity.UserEntity;
import com.project.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private IUserDao userDao;
    public UserEntity getUserInfo(String name) {

        return userDao.getUserInfo(name);
    }

    @Override
    public void register(UserEntity user) {
        userDao.register(user);
    }
}
