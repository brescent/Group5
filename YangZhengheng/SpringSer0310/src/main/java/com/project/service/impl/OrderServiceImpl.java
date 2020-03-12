package com.project.service.impl;

import com.project.entity.OrderEntity;
import com.project.mapper.IOrderMapper;
import com.project.service.IOrderService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


@Service
@Transactional
public class OrderServiceImpl implements IOrderService {

    @Resource
    private IOrderMapper mapper;
    @Override
    public void updateShopNum(int shopId, int soldNum) {
        mapper.updateShopNum(shopId,soldNum);
    }

    @Override
    public void addOrder(OrderEntity orderEntity) {
        mapper.addOrder(orderEntity);
    }
}
