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
    
    private Long belongsId;
    
    private Long scenicareaId;
    
    private Long entertainmentId;


    public Long getBelongsId() {
        return belongsId;
    }

    public void setBelongsId(Long belongsId) {
        this.belongsId = belongsId;
    }

    public Long getScenicareaId() {
        return scenicareaId;
    }

    public void setScenicareaId(Long scenicareaId) {
        this.scenicareaId = scenicareaId;
    }

    public Long getEntertainmentId() {
        return entertainmentId;
    }

    public void setEntertainmentId(Long entertainmentId) {
        this.entertainmentId = entertainmentId;
    }

}

