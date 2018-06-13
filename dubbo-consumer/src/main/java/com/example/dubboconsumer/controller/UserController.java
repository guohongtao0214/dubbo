package com.example.dubboconsumer.controller;

import com.demo.dubboapi.pojo.User;
import com.example.dubboconsumer.service.UserServiceProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

/**
 * @author GuoHongtao
 * @version v1.0
 * @Description:
 * @date 2018-6-11 16:33
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserServiceProvider userServiceProvider;

    @GetMapping("/{name}")
    public List<User> getUserByName(@PathVariable("name") String name) {
        List<User> userList = userServiceProvider.getUserByName(name);
        return userList;
    }
}
