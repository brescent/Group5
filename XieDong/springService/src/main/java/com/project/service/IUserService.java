package com.project.service;

import com.project.entity.UserEntity;

public interface IUserService {
    /**
     * 获得所有的用户
     * @return
     */
    public UserEntity getUserInfo(String name);
}
