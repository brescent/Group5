package com.project.dao;

import com.project.entity.UserEntity;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

public interface IUserDao {

//    @Select("select * from t_user where f_name=#{name}")
//    @ResultMap("userMap")

    public UserEntity getUserInfo( String name);
}
