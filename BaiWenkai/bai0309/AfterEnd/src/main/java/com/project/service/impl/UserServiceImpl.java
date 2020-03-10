package com.project.service.impl;

import com.project.dao.IUserDao;
import com.project.entity.UserEntity;
import com.project.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "us")
public class UserServiceImpl implements IUserService {

    @Autowired
    private IUserDao dao;

    @Override
    public UserEntity findUser(int id) {
        return dao.findUser(id);
    }

    @Override
    public void addUser(UserEntity user) {
        dao.addUser(user);
    }
}
