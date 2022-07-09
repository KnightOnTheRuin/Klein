package com.example.klein.entity;

import java.io.Serializable;

/**
 * (Guestroom)实体类
 *
 * @author makejava
 * @since 2022-07-08 19:07:45
 */
public class Guestroom implements Serializable {
    private static final long serialVersionUID = 218922223153514706L;
    
    private Long roomId;
    
    private String roomEnvironment;
    
    private String roomType;
    
    private Integer isReserved;
    
    private String price;


    public Long getRoomId() {
        return roomId;
    }

    public void setRoomId(Long roomId) {
        this.roomId = roomId;
    }

    public String getRoomEnvironment() {
        return roomEnvironment;
    }

    public void setRoomEnvironment(String roomEnvironment) {
        this.roomEnvironment = roomEnvironment;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public Integer getIsReserved() {
        return isReserved;
    }

    public void setIsReserved(Integer isReserved) {
        this.isReserved = isReserved;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

}

