package com.project.mapper;

import com.project.entity.OrderEntity;
import org.apache.ibatis.annotations.Insert;

public interface IOrderMapper {
    /**
     * 添加订单
     * @param order 订单实体
     */
    @Insert("insert into t_order values(null,#{price},#{stockId})")
    void add(OrderEntity order);
}
