package com.xc.service.impl;

import com.xc.entity.User;
import com.xc.service.DemoService;

public class  DemoServiceImpl implements DemoService{

	@Override
	public String helloDubbox() {
		// TODO Auto-generated method stub
		return "Hello Dubbox";
	}

	@Override
	public User getUserById(String userId) {
		User user = new User();
		user.setId(1001l);
		user.setUsername("张三");
		user.setPassword("123456");
		return user;
	}
	
}
