package com.shop.service.impl;

import com.shop.mappers.newone.ShopcarMapper;
import com.shop.pojo.entity.Goods;
import com.shop.pojo.entity.Shopcar;
import com.shop.service.ShopcarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ShopcarServiceImpl implements ShopcarService {
    @Autowired
    private ShopcarMapper shopcarMapper;

    @Override
    public List<Shopcar> getlistByUid(Integer uid) {
        List<Shopcar> list = shopcarMapper.findShopcarByInfo(new Shopcar(null,null,null,null,null,uid,null));
        return list;
    }

    @Override
    public Shopcar getById(Integer id) {
        List<Shopcar> list = shopcarMapper.findShopcarByInfo(new Shopcar(id,null,null,null,null,null,null));
        if (list==null) {
            return null;
        }else{
            return list.get(0);
        }
    }

    @Override
    public Shopcar getByOid(Integer oid) {
        List<Shopcar> list = shopcarMapper.findShopcarByInfo(new Shopcar(null,null,null,null,null,null,oid));
        if (list==null) {
            return null;
        }else{
            return list.get(0);
        }
    }

    @Override
    public String addToShopcar(Integer gid,Integer num,Integer uid,Goods item_info) {
        Shopcar info = new Shopcar();
        Integer oneprice = item_info.getGoods_price();
        Integer price = oneprice * num;

        info.setShopcar_itemname(item_info.getGoods_name());
        info.setShopcar_uid(uid);
        info.setShopcar_adddate(new Date());
        info.setShopcar_itemprice(price);
        info.setShopcar_itemnum(num);
        Integer sign = shopcarMapper.addItemsToShopcar(info);
        String msg = null;
        if (sign == 0) {
            msg = "添加失败";
        }else{
            msg = "添加成功";
        }
        return msg;
    }

    @Override
    public String delOne(Integer id) {
        Shopcar shopcar = new Shopcar();
        shopcar.setId_shopcar(id);
        Integer sign = shopcarMapper.delShopcarInfo(shopcar);
        String msg = null;
        if (sign == 0) {
            msg = "删除失败";
        }else{
            msg = "删除成功";
        }
        return msg;
    }

    @Override
    public String clear(Integer uid) {
        Shopcar shopcar = new Shopcar();
        shopcar.setShopcar_uid(uid);
        Integer sign = shopcarMapper.delShopcarInfo(shopcar);
        return "操作完成";
    }

    @Override
    public void updateShopcar(Integer num,Shopcar info) {
        ShopcarServiceImpl shopcarService = new ShopcarServiceImpl();
        if (num <= 0) {
            shopcarService.delOne(info.getId_shopcar());
        }else{
            Integer oldnum = info.getShopcar_itemnum();
            Integer price = info.getShopcar_itemprice()/oldnum;
            info.setShopcar_itemnum(num);
            info.setShopcar_itemprice(price*num);
            info.setShopcar_adddate(new Date());
            shopcarMapper.changeShopcarInfo(info);
        }

    }
}
