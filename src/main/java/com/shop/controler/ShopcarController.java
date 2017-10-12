package com.shop.controler;

import com.shop.pojo.entity.Goods;
import com.shop.pojo.entity.Shopcar;
import com.shop.service.GoodsService;
import com.shop.service.ShopcarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.List;


@Controller
@RequestMapping("/shopcar")
public class ShopcarController{
    @Autowired
    private ShopcarService shopcarService;
    @Autowired
    private GoodsService goodsService;

    @RequestMapping("/getlist")//未完成，与前端交接未完成
    public ModelAndView getlist(HttpSession session){
        Integer uid = (Integer) session.getAttribute("uid");
        List<Shopcar> list = shopcarService.getlistByUid(uid);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("shopcarlist",list);
//        modelAndView.setViewName();
        return modelAndView;
    }

    @RequestMapping("/clear")
    public ModelAndView clear(HttpSession session){
        Integer uid = (Integer) session.getAttribute("uid");
        String msg = shopcarService.clear(uid);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("msg",msg);
//        modelAndView.setViewName();
        return modelAndView;
    }

    @RequestMapping("/del")
    public ModelAndView del(@RequestParam(value = "id", required = true) Integer id){
        String msg = shopcarService.delOne(id);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("msg",msg);
//        modelAndView.setViewName();
        return modelAndView;
    }

    @RequestMapping("/additem")
    public ModelAndView additem(@RequestParam(value = "gid", required = true) Integer gid,
                                @RequestParam(value = "num", required = true) Integer num,
                                HttpSession session){
        Integer uid = (Integer) session.getAttribute("uid");
        List<Goods> items = goodsService.findGoodsByInfo(new Goods(gid,null,null,null,null,null));
        String msg = shopcarService.addToShopcar(gid,num,uid,items.get(0));
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("msg",msg);
//        modelAndView.setViewName();
        return modelAndView;
    }

    @RequestMapping("updateitems")
    public ModelAndView updateitems(@RequestParam(value = "sid", required = true) Integer sid,
                                @RequestParam(value = "num", required = true) Integer num,
                                    HttpSession session){
        Shopcar shopcar = shopcarService.getById(sid);
        shopcarService.updateShopcar(num,shopcar);
        List<Shopcar> list = shopcarService.getlistByUid((Integer) session.getAttribute("uid"));
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("shopcarlist",list);
//        modelAndView.setViewName();
        return modelAndView;
    }
}
