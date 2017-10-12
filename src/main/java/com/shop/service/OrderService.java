package com.shop.service;

import com.shop.pojo.entity.Order;

import java.util.List;

public interface OrderService {
    public List<Order> getlist();

    public List<Order> getOrderInfo(Order info);

    public Integer cancel(Integer mid, Integer id);

    public Integer setUp(Integer mid, Integer id);

    public void updateOrder(Order info);
}
