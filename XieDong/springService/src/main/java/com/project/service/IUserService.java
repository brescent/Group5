package com.project.service;

import com.project.entity.UserEntity;
import com.project.entity.UserInfoEntity;

import java.util.List;

public interface IUserService {
    /**
     * 获得所有的用户
     * @return
     */
    public UserEntity getUserInfo(String name);


    public void register(UserEntity user);
public void addInfo( UserInfoEntity userInfo);

    public List<UserEntity> getAllUser();
}
