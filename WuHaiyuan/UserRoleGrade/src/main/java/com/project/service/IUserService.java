package com.project.service;

import com.project.entity.UserEntity;

/**
 * 用户业务接口
 *
 */
public interface IUserService {
    /**
     * 用户登录
     * @param userName 用户名
     * @param password 密码
     * @return 用户实体
     */
    public UserEntity login(String userName, String password);
}
