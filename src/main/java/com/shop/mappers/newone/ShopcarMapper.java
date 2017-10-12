package com.shop.mappers.newone;

import com.shop.pojo.entity.Shopcar;

import java.util.List;

public interface ShopcarMapper {
    /**
     *
     * @param info（id，uid，orderid分别不为空时，对应三种不同搜索）
     * @return
     */
    public List<Shopcar> findShopcarByInfo(Shopcar info);

    /**
     *
     * @param info（info中除了ID，Orderid外不可为空）
     * @return
     */
    public Integer addItemsToShopcar(Shopcar info);

    /**
     *
     * @param info（目前可供修改的有商品数量，商品单价，下单日期）
     * @return
     */
    public Integer changeShopcarInfo(Shopcar info);

    /**
     *
     * @param info（传入id或者uid二选一，对应单条删除和批量删除）
     * @return
     */
    public Integer delShopcarInfo(Shopcar info);
}
