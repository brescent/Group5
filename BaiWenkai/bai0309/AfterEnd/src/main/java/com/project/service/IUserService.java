package com.project.service;

import com.project.entity.UserEntity;

public interface IUserService {
    /**
     * 查询用户
     * @param id
     * @return
     */
    UserEntity findUser(int id);

    /**
     * 注册用户
     * @param user
     */
    void addUser(UserEntity user);
}
