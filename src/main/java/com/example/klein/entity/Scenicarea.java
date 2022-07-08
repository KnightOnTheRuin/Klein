package com.example.klein.entity;

import java.io.Serializable;

/**
 * (Scenicarea)实体类
 *
 * @author makejava
 * @since 2022-07-08 19:10:11
 */
public class Scenicarea implements Serializable {
    private static final long serialVersionUID = 322459403977998110L;
    
    private Long scenicareaid;
    
    private String scenicareaname;
    
    private String phonenumber;


    public Long getScenicareaid() {
        return scenicareaid;
    }

    public void setScenicareaid(Long scenicareaid) {
        this.scenicareaid = scenicareaid;
    }

    public String getScenicareaname() {
        return scenicareaname;
    }

    public void setScenicareaname(String scenicareaname) {
        this.scenicareaname = scenicareaname;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

}

