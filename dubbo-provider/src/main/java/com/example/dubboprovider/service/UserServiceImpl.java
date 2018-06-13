package com.example.dubboprovider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.demo.dubboapi.pojo.User;
import com.demo.dubboapi.service.UserService;
import com.example.dubboprovider.Mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author GuoHongtao
 * @version v1.0
 * @Description:
 * @date 2018-6-11 16:13
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> getUserByName(String name) {
        List<User> userList = userMapper.getUserByName(name);
        System.out.println("=======================================");
        return userList;
    }
}
