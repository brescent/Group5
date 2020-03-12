package com.project.mapper;

import com.project.entity.OrderEntity;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

public interface IOrderMapper {

    @Update("UPDATE t_shop SET f_num=f_num-#{soldNum} WHERE pk_id=#{id}")
    public void updateShopNum(@Param("id") int shopId, @Param("soldNum") int soldNum);


    @Insert("insert into t_new (fk_shopId,f_soldNum) values(#{shopId},#{soldNum})")
    public void addOrder(OrderEntity orderEntity);
}
