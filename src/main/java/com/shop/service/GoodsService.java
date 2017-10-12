package com.shop.service;

import com.shop.pojo.entity.Goods;

import java.util.List;

public interface GoodsService {
	public List<Goods> getlist();
	public List<Goods> findGoodsByInfo(Goods info);
}
