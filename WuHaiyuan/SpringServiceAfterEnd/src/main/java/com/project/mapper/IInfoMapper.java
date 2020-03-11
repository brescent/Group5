package com.project.mapper;

import com.project.entity.InfoEntity;
import org.apache.ibatis.annotations.Insert;

public interface IInfoMapper {
    /**
     * 添加用户信息
     * @param info 用户信息实体
     */
    @Insert("insert into t_info values(null,#{job},#{money},#{changeDate},#{userId})")
    void add(InfoEntity info);
}
