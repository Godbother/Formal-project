package com.shop.mappers.generator;

import com.shop.pojo.generator.goods;

public interface goodsMapper {
    int deleteByPrimaryKey(Integer idGoods);

    int insert(goods record);

    int insertSelective(goods record);

    goods selectByPrimaryKey(Integer idGoods);

    int updateByPrimaryKeySelective(goods record);

    int updateByPrimaryKey(goods record);
}