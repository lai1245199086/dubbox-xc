package com.xc.mapper;

import java.util.List;

import com.xc.entity.User;

public interface UserMapper {

	List<User> queryAll();
	User queryUserById(Long id);
    int deleteUserById(Long id);
    int insertUser(User record);
    int updateUser(User record);
}
