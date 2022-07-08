package com.example.klein.entity;

import java.io.Serializable;

/**
 * (Performance)实体类
 *
 * @author makejava
 * @since 2022-07-08 19:08:51
 */
public class Performance implements Serializable {
    private static final long serialVersionUID = 477233976815660561L;
    
    private Long performanceid;
    
    private Long scenicareaid;
    
    private Long showteamid;
    
    private String performancename;
    
    private String performancetype;
    
    private String time;


    public Long getPerformanceid() {
        return performanceid;
    }

    public void setPerformanceid(Long performanceid) {
        this.performanceid = performanceid;
    }

    public Long getScenicareaid() {
        return scenicareaid;
    }

    public void setScenicareaid(Long scenicareaid) {
        this.scenicareaid = scenicareaid;
    }

    public Long getShowteamid() {
        return showteamid;
    }

    public void setShowteamid(Long showteamid) {
        this.showteamid = showteamid;
    }

    public String getPerformancename() {
        return performancename;
    }

    public void setPerformancename(String performancename) {
        this.performancename = performancename;
    }

    public String getPerformancetype() {
        return performancetype;
    }

    public void setPerformancetype(String performancetype) {
        this.performancetype = performancetype;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

}

