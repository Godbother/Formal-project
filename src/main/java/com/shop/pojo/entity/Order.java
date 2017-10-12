package com.shop.pojo.entity;

import java.util.Date;

public class Order {
    private Integer id_orders;
    private String orders_remark;
    private Integer orders_countprice;
    private String orders_states;
    private Integer orders_mid;
    private Integer orders_uid;
    private Date orders_date;

    public Integer getId_orders() {
        return id_orders;
    }

    public void setId_orders(Integer id_orders) {
        this.id_orders = id_orders;
    }

    public String getOrders_remark() {
        return orders_remark;
    }

    public void setOrders_remark(String orders_remark) {
        this.orders_remark = orders_remark;
    }

    public Integer getOrders_countprice() {
        return orders_countprice;
    }

    public void setOrders_countprice(Integer orders_countprice) {
        this.orders_countprice = orders_countprice;
    }

    public String getOrders_states() {
        return orders_states;
    }

    public void setOrders_states(String orders_states) {
        this.orders_states = orders_states;
    }

    public Integer getOrders_mid() {
        return orders_mid;
    }

    public void setOrders_mid(Integer orders_mid) {
        this.orders_mid = orders_mid;
    }

    public Integer getOrders_uid() {
        return orders_uid;
    }

    public void setOrders_uid(Integer orders_uid) {
        this.orders_uid = orders_uid;
    }

    public Date getOrders_date() {
        return orders_date;
    }

    public void setOrders_date(Date orders_date) {
        this.orders_date = orders_date;
    }

    public Order() {
    }

    public Order(Integer id_orders, String orders_remark, Integer orders_countprice, String orders_states, Integer orders_mid, Integer orders_uid, Date orders_date) {
        this.id_orders = id_orders;
        this.orders_remark = orders_remark;
        this.orders_countprice = orders_countprice;
        this.orders_states = orders_states;
        this.orders_mid = orders_mid;
        this.orders_uid = orders_uid;
        this.orders_date = orders_date;
    }
}
