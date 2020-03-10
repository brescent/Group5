package com.project.service;

import com.project.entity.UserEntity;

import java.util.List;

/**
 * 用户业务接口
 */

public interface IUserService {
    /**
     * 根据名字查询用户
     *
     * @param name 用户名
     */
    UserEntity findByName(String name);

    /**
     * 添加用户
     *
     * @param user 用户实体
     */
    UserEntity addUser(UserEntity user);

    /**
     * 查询所有用户
     *
     * @return 用户实体集合
     */
    List<UserEntity> findAll();


}
