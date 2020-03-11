package com.project.service;

import com.project.entity.InfoEntity;

/**
 * 用户信息业务接口
 */
public interface IInfoService {
    /**
     * 添加用户信息
     * @param info 用户信息实体
     */
    void add(InfoEntity info);
}
