package com.project.service;

import com.project.entity.GradeEntity;

import java.util.List;

public interface IGradeService{
    /**
     * 查询所有权限
     * @return 权限实体集合
     */
    public List<GradeEntity> findAll();
}
