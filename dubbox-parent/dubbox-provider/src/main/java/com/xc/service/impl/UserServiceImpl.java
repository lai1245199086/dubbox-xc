package com.xc.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.dubbo.config.annotation.Service;
import com.xc.entity.User;
import com.xc.mapper.UserMapper;
import com.xc.service.UserService;

@Service
public class  UserServiceImpl implements UserService{
	Log log = LogFactory.getLog(getClass());
	@Resource
	@Autowired
    private UserMapper userMapper;
	@Override
	public List<User> findUserList() {
		log.info("queryAll user");
        List<User> userList = userMapper.queryAll();
        return userList;
	}

	@Override
	public User findUser(Long id) {
        //根据用户名查询出来肯定只有一条记录
        return userMapper.queryUserById(id);
	}

}
