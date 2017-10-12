package com.shop.service;

import com.shop.pojo.entity.Goods;
import com.shop.pojo.entity.Shopcar;

import java.util.List;

public interface ShopcarService {
    //对单个用户的全购物车列表搜索
    public List<Shopcar> getlistByUid(Integer uid);
//    对单个id的购物车项进行搜索
    public Shopcar getById(Integer id);
//    对相应订单进行购物车恢复的时候使用
    public Shopcar getByOid(Integer oid);
    //新增购物车商品
    public String addToShopcar(Integer gid, Integer num, Integer uid, Goods item_info);
    //删除购物车商品
    public String delOne(Integer id);
    //清空购物车
    public String clear(Integer uid);
    //修改购物车商品
    public void updateShopcar(Integer num, Shopcar info);
}
