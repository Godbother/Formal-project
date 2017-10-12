package com.shop.service.impl;

import com.shop.mappers.newone.OrderMapper;
import com.shop.pojo.entity.Order;
import com.shop.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService{
    @Autowired
    private OrderMapper orderMapper;
    @Override
    public List<Order> getlist() {
        List<Order> list = orderMapper.findOrderByInfo(null);
        return list;
    }

    @Override
    public List<Order> getOrderInfo(Order info) {
        List<Order> list = orderMapper.findOrderByInfo(info);
        return list;
    }

    public Order getForOneOrder(Integer id){
        List<Order> list = orderMapper.findOrderByInfo(new Order(id,null,null,null,null,null,null));
        Order order = null;
        if (list.size() == 1) {
            order = list.get(0);
        }
        return order;
    }

    @Override
    public Integer cancel(Integer mid, Integer id) {
        return orderMapper.cancelOrder(mid,id);
    }

    @Override
    public Integer setUp(Integer mid, Integer id) {
        return orderMapper.setUpOrder(mid, id);
    }

    @Override
    public void updateOrder(Order info) {
        //除了需要修改的数据，其他全部置null
        //前端可以保证，id，countprice，mid，remark不为空
        Order old = getForOneOrder(info.getId_orders());
        if (info.getOrders_states() == null) {
            info.setOrders_states(old.getOrders_states());
        }
        if (info.getOrders_date() == null) {
            info.setOrders_date(new Date());
        }
        if (info.getOrders_uid() == null) {
            info.setOrders_uid(old.getOrders_uid());
        }
        orderMapper.changeOrderInfo(info);
    }
}
