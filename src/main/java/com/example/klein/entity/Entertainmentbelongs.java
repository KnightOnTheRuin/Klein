package com.example.klein.entity;

import java.io.Serializable;

/**
 * (Entertainmentbelongs)实体类
 *
 * @author makejava
 * @since 2022-07-08 19:06:36
 */
public class Entertainmentbelongs implements Serializable {
    private static final long serialVersionUID = -41590425731114734L;
    
    private Long belongsid;
    
    private Long scenicareaid;
    
    private Long entertainmentid;


    public Long getBelongsid() {
        return belongsid;
    }

    public void setBelongsid(Long belongsid) {
        this.belongsid = belongsid;
    }

    public Long getScenicareaid() {
        return scenicareaid;
    }

    public void setScenicareaid(Long scenicareaid) {
        this.scenicareaid = scenicareaid;
    }

    public Long getEntertainmentid() {
        return entertainmentid;
    }

    public void setEntertainmentid(Long entertainmentid) {
        this.entertainmentid = entertainmentid;
    }

}

