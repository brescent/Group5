package com.project.service;

import com.project.entity.OrderEntity;
import org.apache.ibatis.annotations.Param;

public  interface IOrderService {
    public void updateShopNum(@Param("id") int shopId, @Param("soldNum") int soldNum);

    public void addOrder(OrderEntity orderEntity);
}
