package com.example.klein.entity;

import java.io.Serializable;

/**
 * 景区附近的酒店关系表(Nearty)实体类
 *
 * @author makejava
 * @since 2022-07-09 19:20:11
 */
public class Nearty implements Serializable {
    private static final long serialVersionUID = -75594811450247299L;
    
    private Long neartyId;
    
    private Long scenicAreaId;
    
    private Long hotelId;


    public Long getNeartyId() {
        return neartyId;
    }

    public void setNeartyId(Long neartyId) {
        this.neartyId = neartyId;
    }

    public Long getScenicAreaId() {
        return scenicAreaId;
    }

    public void setScenicAreaId(Long scenicAreaId) {
        this.scenicAreaId = scenicAreaId;
    }

    public Long getHotelId() {
        return hotelId;
    }

    public void setHotelId(Long hotelId) {
        this.hotelId = hotelId;
    }

}

