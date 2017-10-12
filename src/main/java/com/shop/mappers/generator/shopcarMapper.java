package com.shop.mappers.generator;

import com.shop.pojo.generator.shopcar;

public interface shopcarMapper {
    int deleteByPrimaryKey(Integer idShopcar);

    int insert(shopcar record);

    int insertSelective(shopcar record);

    shopcar selectByPrimaryKey(Integer idShopcar);

    int updateByPrimaryKeySelective(shopcar record);

    int updateByPrimaryKey(shopcar record);
}