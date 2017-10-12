package com.shop.service;

import com.shop.pojo.entity.User;

import java.util.List;

public interface UserService {
	public List<User> getUserList();
	public List<User> findUserByInfo(User info);
	public String deluser(Integer id);
	public String updateuser(User info);
}
