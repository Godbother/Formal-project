package com.shop.mappers.generator;

import com.shop.pojo.generator.orders;

public interface ordersMapper {
    int deleteByPrimaryKey(Integer idOrders);

    int insert(orders record);

    int insertSelective(orders record);

    orders selectByPrimaryKey(Integer idOrders);

    int updateByPrimaryKeySelective(orders record);

    int updateByPrimaryKey(orders record);
}