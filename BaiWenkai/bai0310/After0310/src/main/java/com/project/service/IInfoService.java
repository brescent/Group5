package com.project.service;

import com.project.entity.InfoEntity;

import java.util.List;

public interface IInfoService {

    List<InfoEntity> findByUserId(int userId);
}
