package com.example.dubboprovider.Mapper;

import com.demo.dubboapi.pojo.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @author GuoHongtao
 * @version v1.0
 * @Description:
 * @date 2018-6-12 12:31
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMapperTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void getUserByName(){
        List<User> list = userMapper.getUserByName("王");
        Assert.assertNotEquals(null,list.size());
    }
}