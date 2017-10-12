package com.shop.controler;

import com.shop.pojo.entity.Order;
import com.shop.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/order")
public class OrderCountroller {
    @Autowired
    private OrderService orderService;

    @RequestMapping("/getlist")
    public ModelAndView getOrderList(){
        ModelAndView modelAndView = new ModelAndView();
        List<Order> list = orderService.getlist();
        modelAndView.addObject("orderlist",list);
        modelAndView.setViewName("back/back_orders");
        return modelAndView;
    }
}
