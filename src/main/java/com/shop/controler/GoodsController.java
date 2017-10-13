package com.shop.controler;

import com.shop.pojo.entity.Goods;
import com.shop.service.GoodsService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping(value = "/goods")
public class GoodsController {
	
	@Resource
	private GoodsService goodsServiceImpl;
	
	@RequestMapping("/getlist")
	public ModelAndView getGoodsList(){
		ModelAndView modelAndView = new ModelAndView();
		List<Goods> goodslist = goodsServiceImpl.getlist();
		modelAndView.addObject("goodslist", goodslist);
		modelAndView.setViewName("back/back_goods");
		return modelAndView;
	}
	
	@RequestMapping("/findGoods")
	public ModelAndView findGoods(@RequestParam(value = "id", required = true) Integer gid,
			@RequestParam(value = "gname", required = false) String gname){
		ModelAndView modelAndView = new ModelAndView();
		List<Goods> goodslist = goodsServiceImpl.findGoodsByInfo(new Goods(gid, gname, null, null, null, null));
		modelAndView.addObject("goodslist", goodslist);
		modelAndView.setViewName("back/back_goods");
		return modelAndView;
	}
	
	@RequestMapping("/getgoodsinfo")
	public ModelAndView getgoodsinfo(@RequestParam(value = "id", required = true) Integer gid,
			@RequestParam(value = "gname", required = false) String gname){
		ModelAndView modelAndView = new ModelAndView();
		List<Goods> goodslist = goodsServiceImpl.findGoodsByInfo(new Goods(gid, gname, null, null, null, null));
		modelAndView.addObject("goods", goodslist.get(0));
		modelAndView.setViewName("user/itemsdetail");
		return modelAndView;
	}
}
