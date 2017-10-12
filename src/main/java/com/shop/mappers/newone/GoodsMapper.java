package com.shop.mappers.newone;

import com.shop.pojo.entity.Goods;

import java.util.List;

public interface GoodsMapper {
	public List<Goods> findGoodsByInfo(Goods info);
}
