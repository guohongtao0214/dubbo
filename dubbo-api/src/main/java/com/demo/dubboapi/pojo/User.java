package com.demo.dubboapi.pojo;

import java.io.Serializable;

/**
 * @author GuoHongtao
 * @version v1.0
 * @Description:
 * @date 2018-6-11 15:48
 */
public class User implements Serializable{

    private static final long serialVersionUID = -3114794806579385817L;

    private Integer id;

    private String username;

    private String password;

    private String age;
    
    private String name;

    public User() {
        
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
