package com.example.klein.entity;

import java.io.Serializable;

/**
 * (Entertainment)实体类
 *
 * @author makejava
 * @since 2022-07-08 19:06:08
 */
public class Entertainment implements Serializable {
    private static final long serialVersionUID = 533613795942216362L;
    
    private Long entertainmentId;
    
    private String entertainmentName;
    
    private String entertainmentType;
    
    private String phoneNumber;


    public Long getEntertainmentId() {
        return entertainmentId;
    }

    public void setEntertainmentId(Long entertainmentId) {
        this.entertainmentId = entertainmentId;
    }

    public String getEntertainmentName() {
        return entertainmentName;
    }

    public void setEntertainmentName(String entertainmentName) {
        this.entertainmentName = entertainmentName;
    }

    public String getEntertainmentType() {
        return entertainmentType;
    }

    public void setEntertainmentType(String entertainmentType) {
        this.entertainmentType = entertainmentType;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

}

