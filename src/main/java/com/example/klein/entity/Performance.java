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
    
    private Long performanceId;
    
    private Long scenicAreaId;
    
    private Long showTeamId;
    
    private String performanceName;
    
    private String performanceType;
    
    private String time;


    public Long getPerformanceId() {
        return performanceId;
    }

    public void setPerformanceId(Long performanceId) {
        this.performanceId = performanceId;
    }

    public Long getScenicAreaId() {
        return scenicAreaId;
    }

    public void setScenicAreaId(Long scenicAreaId) {
        this.scenicAreaId = scenicAreaId;
    }

    public Long getShowTeamId() {
        return showTeamId;
    }

    public void setShowTeamId(Long showTeamId) {
        this.showTeamId = showTeamId;
    }

    public String getPerformanceName() {
        return performanceName;
    }

    public void setPerformanceName(String performanceName) {
        this.performanceName = performanceName;
    }

    public String getPerformanceType() {
        return performanceType;
    }

    public void setPerformanceType(String performanceType) {
        this.performanceType = performanceType;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

}

