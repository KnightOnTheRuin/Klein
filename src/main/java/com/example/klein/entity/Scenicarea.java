package com.example.klein.entity;

import java.io.Serializable;

/**
 * (Scenicarea)实体类
 *
 * @author makejava
 * @since 2022-07-08 19:10:11
 */
public class Scenicarea implements Serializable {
    private static final long serialVersionUID = 322459403977998110L;
    
    private Long scenicAreaId;
    
    private String scenicAreaName;
    
    private String phoneNumber;


    public Long getScenicAreaId() {
        return scenicAreaId;
    }

    public void setScenicAreaId(Long scenicAreaId) {
        this.scenicAreaId = scenicAreaId;
    }

    public String getScenicAreaName() {
        return scenicAreaName;
    }

    public void setScenicAreaName(String scenicAreaName) {
        this.scenicAreaName = scenicAreaName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

}

