package com.project.mapper;

import com.project.entity.UserEntity;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface IUserMapper {
    /**
     * 根据名字查询用户
     *
     * @param name 用户名
     */
    @Select("select * from t_user where f_name = #{name}")
    @ResultMap("userRM")
    UserEntity findByName(String name);

    /**
     * 添加用户
     *
     * @param user 用户实体
     */
    @Insert("insert into t_user values (null,#{name},#{pwd},#{age})")
    @Options(useGeneratedKeys = true,keyProperty = "id")
    void addUser(UserEntity user);

    /**
     * 查询所有用户
     *
     * @return 用户实体集合
     */
    @Select("select * from t_user")
    @ResultMap("userRM")
    List<UserEntity> findAll();
}
