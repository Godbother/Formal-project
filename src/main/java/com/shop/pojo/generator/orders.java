package com.shop.pojo.generator;

public class orders {
    private Integer idOrders;

    private String ordersRemark;

    private Integer ordersCountprice;

    private String ordersStates;

    private Integer ordersMid;

    private Integer ordersUid;

    private Integer ordersDate;

    public Integer getIdOrders() {
        return idOrders;
    }

    public void setIdOrders(Integer idOrders) {
        this.idOrders = idOrders;
    }

    public String getOrdersRemark() {
        return ordersRemark;
    }

    public void setOrdersRemark(String ordersRemark) {
        this.ordersRemark = ordersRemark == null ? null : ordersRemark.trim();
    }

    public Integer getOrdersCountprice() {
        return ordersCountprice;
    }

    public void setOrdersCountprice(Integer ordersCountprice) {
        this.ordersCountprice = ordersCountprice;
    }

    public String getOrdersStates() {
        return ordersStates;
    }

    public void setOrdersStates(String ordersStates) {
        this.ordersStates = ordersStates == null ? null : ordersStates.trim();
    }

    public Integer getOrdersMid() {
        return ordersMid;
    }

    public void setOrdersMid(Integer ordersMid) {
        this.ordersMid = ordersMid;
    }

    public Integer getOrdersUid() {
        return ordersUid;
    }

    public void setOrdersUid(Integer ordersUid) {
        this.ordersUid = ordersUid;
    }

    public Integer getOrdersDate() {
        return ordersDate;
    }

    public void setOrdersDate(Integer ordersDate) {
        this.ordersDate = ordersDate;
    }
}