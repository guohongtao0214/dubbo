package com.demo.dubboapi.service;

import com.demo.dubboapi.pojo.User;

import java.util.List;

/**
 * @author GuoHongtao
 * @version v1.0
 * @Description:
 * @date 2018-6-11 15:55
 */
public interface UserService {

    public List<User> getUserByName(String name);
}
