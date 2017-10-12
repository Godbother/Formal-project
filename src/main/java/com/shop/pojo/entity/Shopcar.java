package com.shop.pojo.entity;
import com.shop.pojo.generator.shopcar;

import java.util.Date;

public class Shopcar extends shopcar {
    private Integer id_shopcar;

    private String shopcar_itemname;

    private Integer shopcar_itemprice;

    private Integer shopcar_itemnum;

    private Date shopcar_adddate;

    private Integer shopcar_uid;

    private Integer orders_id_orders;

    public Integer getId_shopcar() {
        return id_shopcar;
    }

    public void setId_shopcar(Integer id_shopcar) {
        this.id_shopcar = id_shopcar;
    }

    public String getShopcar_itemname() {
        return shopcar_itemname;
    }

    public void setShopcar_itemname(String shopcar_itemname) {
        this.shopcar_itemname = shopcar_itemname;
    }

    public Integer getShopcar_itemprice() {
        return shopcar_itemprice;
    }

    public void setShopcar_itemprice(Integer shopcar_itemprice) {
        this.shopcar_itemprice = shopcar_itemprice;
    }

    public Integer getShopcar_itemnum() {
        return shopcar_itemnum;
    }

    public void setShopcar_itemnum(Integer shopcar_itemnum) {
        this.shopcar_itemnum = shopcar_itemnum;
    }

    public Date getShopcar_adddate() {
        return shopcar_adddate;
    }

    public void setShopcar_adddate(Date shopcar_adddate) {
        this.shopcar_adddate = shopcar_adddate;
    }

    public Integer getShopcar_uid() {
        return shopcar_uid;
    }

    public void setShopcar_uid(Integer shopcar_uid) {
        this.shopcar_uid = shopcar_uid;
    }

    public Integer getOrders_id_orders() {
        return orders_id_orders;
    }

    public void setOrders_id_orders(Integer orders_id_orders) {
        this.orders_id_orders = orders_id_orders;
    }

    public Shopcar() {
    }

    public Shopcar(Integer id_shopcar, String shopcar_itemname, Integer shopcar_itemprice, Integer shopcar_itemnum, Date shopcar_adddate, Integer shopcar_uid, Integer orders_id_orders) {
        this.id_shopcar = id_shopcar;
        this.shopcar_itemname = shopcar_itemname;
        this.shopcar_itemprice = shopcar_itemprice;
        this.shopcar_itemnum = shopcar_itemnum;
        this.shopcar_adddate = shopcar_adddate;
        this.shopcar_uid = shopcar_uid;
        this.orders_id_orders = orders_id_orders;
    }
}
