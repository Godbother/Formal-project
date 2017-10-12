package com.shop.mappers.newone;

import com.shop.pojo.entity.Order;

import java.util.List;

public interface OrderMapper {
    public List<Order> findOrderByInfo(Order info);

    public Integer cancelOrder(Integer mid, Integer id);

    public Integer setUpOrder(Integer mid, Integer id);

    public void changeOrderInfo(Order info);
}
