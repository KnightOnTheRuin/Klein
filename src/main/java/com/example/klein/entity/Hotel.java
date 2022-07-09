package com.example.klein.entity;

import java.io.Serializable;

/**
 * 酒店实体表(Hotel)实体类
 *
 * @author makejava
 * @since 2022-07-09 19:04:32
 */
public class Hotel implements Serializable {
    private static final long serialVersionUID = 338720900725631261L;
    
    private Long hotelId;
    
    private String hotelName;
    
    private Integer startLevel;
    
    private String phoneNumber;
    
    private String address;
    
    private String price;


    public Long getHotelId() {
        return hotelId;
    }

    public void setHotelId(Long hotelId) {
        this.hotelId = hotelId;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public Integer getStartLevel() {
        return startLevel;
    }

    public void setStartLevel(Integer startLevel) {
        this.startLevel = startLevel;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

}

