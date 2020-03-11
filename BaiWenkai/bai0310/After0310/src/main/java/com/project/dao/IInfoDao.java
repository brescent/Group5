package com.project.dao;

import com.project.entity.InfoEntity;

import java.util.List;

public interface IInfoDao {
    List<InfoEntity> findByUserId(int userId);
}
