package com.project.service;

import com.project.entity.UserEntity;

/**
 * 用户业务接口
 */

public interface IUserService {
    /**
     * 根据名字查询用户
     * @param name 用户名
     */
    UserEntity findByName(String name);

    /**
     * 添加用户
     * @param user 用户实体
     */
    void addUser(UserEntity user);
}
