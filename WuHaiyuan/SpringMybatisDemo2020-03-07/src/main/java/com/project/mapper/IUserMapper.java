package com.project.mapper;

import com.project.entity.UserEntity;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * 用户映射接口
 */
public interface IUserMapper {
    /**
     * 添加用户
     * @param user 用户实体
     */
    @Insert("insert into t_user values(null,#{name},#{pwd},#{birthday})")
    void addUser(UserEntity user);

    /**
     * 根据id删除用户
     * @param id 用户id
     */
    @Delete("delete from t_user where pk_id =#{id}")
    void delUser(int id);

    /**
     * 根据用户id修改用户名
     * @param id 用户id
     * @param newName 新用户名
     */
    @Update("update t_user set f_name = #{arg1} where pk_id = #{arg0}")
    void updUserName(int id, String newName);

    /**
     * 查询所有用户
     * @return 用户集合
     */
    @Select("select * from t_user")
    @ResultMap("userRM")
    List<UserEntity> findAll();
}
