package com.project.service;

import com.project.entity.PowerEntity;
import com.project.entity.UserEntity;


import java.util.List;

public interface IUserService {

    public UserEntity login(String userName, String pwd);


    public List<Object[]> getRoleByUserId(int userId);
}
