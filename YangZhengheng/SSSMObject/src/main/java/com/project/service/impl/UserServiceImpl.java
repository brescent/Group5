package com.project.service.impl;

import com.project.dao.IUserDao;
import com.project.entity.PowerEntity;
import com.project.entity.UserEntity;
import com.project.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service(value = "IUserService")
public class UserServiceImpl implements IUserService {

    @Autowired
    IUserDao dao;

    @Override
    public UserEntity login(String userName, String pwd) {
        return dao.login(userName, pwd);
    }

    @Override
    public List<Object[]> getRoleByUserId(int userId) {
        return dao.getRoleByUserId(userId);
    }
}
