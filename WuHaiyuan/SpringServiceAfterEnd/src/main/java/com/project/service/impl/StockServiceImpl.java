package com.project.service.impl;

import com.project.entity.OrderEntity;
import com.project.entity.StockEntity;
import com.project.mapper.IOrderMapper;
import com.project.mapper.IStockMapper;
import com.project.service.IStockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StockServiceImpl implements IStockService {
    @Autowired
    private IStockMapper stockMapper;
    @Autowired
    private IOrderMapper orderMapper;
    @Override
    public void buy(StockEntity stock) {
        stockMapper.updNum(stock.getId());
       //int x = 9/0;
        orderMapper.add(new OrderEntity(500,stock.getId()));

    }
}
