package com.example.klein.entity;

import java.io.Serializable;

/**
 * (Nearty)实体类
 *
 * @author makejava
 * @since 2022-07-08 19:08:33
 */
public class Nearty implements Serializable {
    private static final long serialVersionUID = -90841607177186318L;
    
    private Long neartyid;
    
    private Long scenicareaid;
    
    private Long hotel1id;
    
    private Long hotel2id;
    
    private Long hotel3id;
    
    private Long hotel4id;
    
    private Long hotel5id;


    public Long getNeartyid() {
        return neartyid;
    }

    public void setNeartyid(Long neartyid) {
        this.neartyid = neartyid;
    }

    public Long getScenicareaid() {
        return scenicareaid;
    }

    public void setScenicareaid(Long scenicareaid) {
        this.scenicareaid = scenicareaid;
    }

    public Long getHotel1id() {
        return hotel1id;
    }

    public void setHotel1id(Long hotel1id) {
        this.hotel1id = hotel1id;
    }

    public Long getHotel2id() {
        return hotel2id;
    }

    public void setHotel2id(Long hotel2id) {
        this.hotel2id = hotel2id;
    }

    public Long getHotel3id() {
        return hotel3id;
    }

    public void setHotel3id(Long hotel3id) {
        this.hotel3id = hotel3id;
    }

    public Long getHotel4id() {
        return hotel4id;
    }

    public void setHotel4id(Long hotel4id) {
        this.hotel4id = hotel4id;
    }

    public Long getHotel5id() {
        return hotel5id;
    }

    public void setHotel5id(Long hotel5id) {
        this.hotel5id = hotel5id;
    }

}

