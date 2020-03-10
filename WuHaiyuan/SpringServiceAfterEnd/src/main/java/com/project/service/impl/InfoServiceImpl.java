package com.project.service.impl;

import com.project.entity.InfoEntity;
import com.project.mapper.IInfoMapper;
import com.project.service.IInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InfoServiceImpl implements IInfoService {
    @Autowired
    private IInfoMapper infoMapper;
    @Override
    public void add(InfoEntity info) {
        infoMapper.add(info);
    }
}
