package com.shop.controler;

import com.shop.pojo.entity.User;
import com.shop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(value = "/user")
public class UserControler {
	@Autowired
	UserService userService;
	

	@RequestMapping("/getlist")
	public ModelAndView getlist() {
		List<User> list = new ArrayList<>();
		list = userService.getUserList();
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("userlist", list);
		modelAndView.setViewName("back/back_user");
		return modelAndView;
	}
	@RequestMapping("/finduser")
	public ModelAndView finduser(@RequestParam(value = "id", required = true) Integer uid) {
		ModelAndView modelAndView = new ModelAndView();
		User info = new User();
		info.setId_user(uid);
		List<User> list = new ArrayList<User>();
		list = userService.findUserByInfo(info);	
		modelAndView.addObject("userlist", list);
		modelAndView.setViewName("back/back_user");
		return modelAndView;
	}
}
