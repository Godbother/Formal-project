package com.shop.pojo.generator;

public class shopcar {
    private Integer idShopcar;

    private String shopcarItemname;

    private Integer shopcarItemprice;

    private Integer shopcarItemnum;

    private Integer shopcarAdddate;

    private Integer shopcarUid;

    private Integer ordersIdOrders;

    public Integer getIdShopcar() {
        return idShopcar;
    }

    public void setIdShopcar(Integer idShopcar) {
        this.idShopcar = idShopcar;
    }

    public String getShopcarItemname() {
        return shopcarItemname;
    }

    public void setShopcarItemname(String shopcarItemname) {
        this.shopcarItemname = shopcarItemname == null ? null : shopcarItemname.trim();
    }

    public Integer getShopcarItemprice() {
        return shopcarItemprice;
    }

    public void setShopcarItemprice(Integer shopcarItemprice) {
        this.shopcarItemprice = shopcarItemprice;
    }

    public Integer getShopcarItemnum() {
        return shopcarItemnum;
    }

    public void setShopcarItemnum(Integer shopcarItemnum) {
        this.shopcarItemnum = shopcarItemnum;
    }

    public Integer getShopcarAdddate() {
        return shopcarAdddate;
    }

    public void setShopcarAdddate(Integer shopcarAdddate) {
        this.shopcarAdddate = shopcarAdddate;
    }

    public Integer getShopcarUid() {
        return shopcarUid;
    }

    public void setShopcarUid(Integer shopcarUid) {
        this.shopcarUid = shopcarUid;
    }

    public Integer getOrdersIdOrders() {
        return ordersIdOrders;
    }

    public void setOrdersIdOrders(Integer ordersIdOrders) {
        this.ordersIdOrders = ordersIdOrders;
    }
}