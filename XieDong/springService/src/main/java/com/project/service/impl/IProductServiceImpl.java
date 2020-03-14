package com.project.service.impl;

import com.project.dao.ProductDao;
import com.project.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class IProductServiceImpl implements IProductService {

    @Autowired
    private ProductDao dao;

    @Override
    public void add(int productId, int num) {
      dao.add(productId,num);
      dao.update(productId,num);
    }
}
