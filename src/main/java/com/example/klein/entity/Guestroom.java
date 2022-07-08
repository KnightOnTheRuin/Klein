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
    
    private Long roomid;
    
    private String roomenvironment;
    
    private String roomtype;
    
    private Integer isreserved;
    
    private String price;


    public Long getRoomid() {
        return roomid;
    }

    public void setRoomid(Long roomid) {
        this.roomid = roomid;
    }

    public String getRoomenvironment() {
        return roomenvironment;
    }

    public void setRoomenvironment(String roomenvironment) {
        this.roomenvironment = roomenvironment;
    }

    public String getRoomtype() {
        return roomtype;
    }

    public void setRoomtype(String roomtype) {
        this.roomtype = roomtype;
    }

    public Integer getIsreserved() {
        return isreserved;
    }

    public void setIsreserved(Integer isreserved) {
        this.isreserved = isreserved;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

}

