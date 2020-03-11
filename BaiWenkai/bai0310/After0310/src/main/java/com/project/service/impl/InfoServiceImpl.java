package com.project.service.impl;

import com.project.dao.IInfoDao;
import com.project.entity.InfoEntity;
import com.project.service.IInfoService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class InfoServiceImpl implements IInfoService {

    @Autowired
    private IInfoDao dao;

    @Override
    public List<InfoEntity> findByUserId(int userId) {
        return dao.findByUserId(userId);
    }
}
