package com.shop.service.impl;

import com.shop.mappers.newone.UserMapper;
import com.shop.pojo.entity.User;
import com.shop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserMapper userMapper;
	@Override
	public List<User> getUserList() {
		List<User> list = new ArrayList<User>();
		list = userMapper.findUserByInfo(null);
		return list;
	}

	@Override
	public List<User> findUserByInfo(User info) {
		List<User> list = new ArrayList<User>();
		list = userMapper.findUserByInfo(info);
		return list;
	}

	@Override
	//ֻ����idɾ��������ɾ����Ϣ
	public String deluser(Integer id) {
		Integer code = userMapper.deluser(id);
		String msg = null;
		if(code!=-1&&code!=0){
			msg = "ɾ���ɹ�";
		}else{
			msg = "ɾ��ʧ��";
		}
		return msg;
	}

	@Override
	//ֻ�ṩ�����޸ģ���ַ�޸ģ�ͷ���޸ģ����������޸�
	public String updateuser(User info) {
		String msg = null;
		if(info.getId_user()==null){
			return null;
		}
		User user = userMapper.findUserByInfo(new User(info.getId_user(),null,null,null,null,null,null,null)).get(0);
		if(info.getUser_password()!=null){
			user.setUser_password(info.getUser_password());
		}
		if(info.getUser_address()!=null){
			user.setUser_address(info.getUser_address());
		}
		if(info.getUsers_image()!=null){
			user.setUsers_image(info.getUsers_image());
		}
		if(info.getUser_remark()!=null){
			user.setUser_remark(info.getUser_remark());
		}
		if(userMapper.changeuser(user)!=0&&userMapper.changeuser(user)!=-1){
			msg = "success!";
		}else{
			msg = "fail";
		}
		return msg;
	}
	
}
