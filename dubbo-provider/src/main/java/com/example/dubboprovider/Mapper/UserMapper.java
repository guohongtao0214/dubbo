package com.example.dubboprovider.Mapper;

import com.demo.dubboapi.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author GuoHongtao
 * @version v1.0
 * @Description:
 * @date 2018-6-11 16:19
 */
@Mapper
public interface UserMapper {

    @Select("select * from user where name like '%${value}%'")
    public List<User> getUserByName(String name);
}
