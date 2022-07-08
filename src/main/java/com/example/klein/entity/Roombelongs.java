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
    
    private Long belongsid;
    
    private Long roomid;
    
    private Long hotelid;


    public Long getBelongsid() {
        return belongsid;
    }

    public void setBelongsid(Long belongsid) {
        this.belongsid = belongsid;
    }

    public Long getRoomid() {
        return roomid;
    }

    public void setRoomid(Long roomid) {
        this.roomid = roomid;
    }

    public Long getHotelid() {
        return hotelid;
    }

    public void setHotelid(Long hotelid) {
        this.hotelid = hotelid;
    }

}

