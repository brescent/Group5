package com.project.service;

import com.project.entity.UserEntity;

import java.util.List;

/**
 * 用户业务接口
 */
public interface IUserService {
    /**
     * 添加用户
     * @param user 用户实体
     */
    void addUser(UserEntity user);

    /**
     * 根据id删除用户
     * @param id 用户id
     */
    void delUser(int id);

    /**
     * 根据用户id修改用户名
     * @param id 用户id
     * @param newName 新用户名
     */
    void updUserName(int id, String newName);

    /**
     * 查询所有用户
     * @return 用户集合
     */
    List<UserEntity> findAll();
}
