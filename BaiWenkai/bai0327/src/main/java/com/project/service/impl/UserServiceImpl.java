package com.project.service.impl;

import com.project.dao.IUserDao;
import com.project.entity.LimitEntity;
import com.project.entity.UserEntity;
import com.project.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service(value = "userService")
public class UserServiceImpl implements IUserService {

    @Autowired
    IUserDao dao;

    @Override
    public UserEntity login(String userName, String password) {
        return dao.login(userName,password);
    }

    @Override
    public List<LimitEntity> getLimitByUserId(int id) {
        List<LimitEntity> list = new ArrayList<LimitEntity>();
        List<Object[]> objlist = dao.getLimitByUserId(id);
        for (Object[] objarr:objlist) {
            LimitEntity limit = new LimitEntity();
            limit.setId((Integer) objarr[0]);
            limit.setLimitName((String) objarr[1]);
            limit.setLimitURL((String) objarr[2]);
            limit.setLimitInfo((String) objarr[3]);
            list.add(limit);
        }
        return list;
    }
}
