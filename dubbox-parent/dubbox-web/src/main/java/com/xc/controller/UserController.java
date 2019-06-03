package com.xc.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.xc.entity.User;
import com.xc.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

	 
    @Reference
    private UserService userService;
 
    @RequestMapping("/findList")
    public List<User> findList() {
      return userService.findUserList();
    }
 
    @RequestMapping("/findUser")
    public User findUser(Long id){
        return userService.findUser(id);
    }
 
}
