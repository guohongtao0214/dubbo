package com.example.dubboconsumer.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.demo.dubboapi.pojo.User;
import com.demo.dubboapi.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author GuoHongtao
 * @version v1.0
 * @Description:
 * @date 2018-6-12 13:55
 */
@Service
public class UserServiceProvider {

    @Reference
    private UserService userService;

    public List<User> getUserByName(String name) {
        List<User> userList = userService.getUserByName(name);
        return userList;
    }
}
