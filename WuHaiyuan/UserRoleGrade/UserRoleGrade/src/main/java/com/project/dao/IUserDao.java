package com.project.dao;

import com.project.entity.GradeEntity;
import com.project.entity.UserEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * 用户持久接口
 */
public interface IUserDao extends CrudRepository<UserEntity,Integer> {

    /**
     * 根据用户名密码查询用户
     * @param userName 用户名
     * @param password 密码
     * @return 用户实体
     */
    @Query("from UserEntity where userName = ?1 and password = ?2  ")
    public UserEntity findByUserNameAndPassword(String userName,String password);


}
