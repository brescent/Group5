package com.project.dao;

import com.project.entity.UserEntity;
import com.project.entity.UserInfoEntity;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface IUserDao {

//    @Select("select * from t_user where f_name=#{name}")
//    @ResultMap("userMap")

    public UserEntity getUserInfo( String name);

    public void register(@Param("user") UserEntity  user);
    public void addInfo(@Param("userInfo") UserInfoEntity userInfo);
        public void update(UserEntity  user);

    public List<UserEntity> getAllUser();
}
