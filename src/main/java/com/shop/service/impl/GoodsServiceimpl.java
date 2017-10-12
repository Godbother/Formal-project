package com.shop.service.impl;

import com.shop.mappers.newone.GoodsMapper;
import com.shop.pojo.entity.Goods;
import com.shop.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsServiceimpl implements GoodsService{
	
	@Autowired
	private GoodsMapper goodsMapper;
	
	@Override
	public List<Goods> getlist() {
		List<Goods> list = goodsMapper.findGoodsByInfo(null);
		return list;
	}

	@Override
	public List<Goods> findGoodsByInfo(Goods info) {
		List<Goods> list = goodsMapper.findGoodsByInfo(info);
		return list;
	}
	
}
