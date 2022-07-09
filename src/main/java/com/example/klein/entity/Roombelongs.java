package com.example.klein.entity;

import java.io.Serializable;

/**
 * (Roombelongs)实体类
 *
 * @author makejava
 * @since 2022-07-08 19:09:22
 */
public class Roombelongs implements Serializable {
    private static final long serialVersionUID = 997344102955965784L;
    
    private Long belongsId;
    
    private Long roomId;
    
    private Long hotelId;


    public Long getBelongsId() {
        return belongsId;
    }

    public void setBelongsId(Long belongsId) {
        this.belongsId = belongsId;
    }

    public Long getRoomId() {
        return roomId;
    }

    public void setRoomId(Long roomId) {
        this.roomId = roomId;
    }

    public Long getHotelId() {
        return hotelId;
    }

    public void setHotelId(Long hotelId) {
        this.hotelId = hotelId;
    }

}

