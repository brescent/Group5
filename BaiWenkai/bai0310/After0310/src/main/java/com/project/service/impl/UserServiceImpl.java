package com.project.service.impl;

import com.project.dao.IInfoDao;
import com.project.dao.IUserDao;
import com.project.entity.InfoEntity;
import com.project.entity.UserEntity;
import com.project.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private IUserDao dao;

    @Override
    public void addUSer(UserEntity user) {
        dao.addUser(user);
    }

    @Override
    public UserEntity findById(int id) {
        UserEntity user = dao.findById(id);
        return user;
    }
}
