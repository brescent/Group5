package com.project.mapper;

import org.apache.ibatis.annotations.Update;

public interface IStockMapper {
    @Update("update t_stock set f_num = f_num - 1 where pk_id =#{id}")
    void updNum(int id);
}
