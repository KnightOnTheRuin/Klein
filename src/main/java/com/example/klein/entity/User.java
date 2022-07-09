package com.example.klein.entity;

import java.io.Serializable;

/**
 * (User)实体类
 *
 * @author makejava
 * @since 2022-07-08 19:11:03
 */
public class User implements Serializable {
    private static final long serialVersionUID = 926239666797360948L;
    
    private Long userId;
    
    private String name;
    
    private String phoneNumber;
    
    private String password;
    
    private Integer isAdmin;


    public Long getUserid() {
        return userId;
    }

    public void setUserid(Long userid) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(Integer isAdmin) {
        this.isAdmin = isAdmin;
    }

}

