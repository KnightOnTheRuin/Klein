package com.example.klein.entity;

import java.io.Serializable;

/**
 * (Showteam)实体类
 *
 * @author makejava
 * @since 2022-07-08 19:10:43
 */
public class Showteam implements Serializable {
    private static final long serialVersionUID = -80081372641734924L;
    
    private Long showTeamId;
    
    private String showTeamType;
    
    private String showTeamName;


    public Long getShowTeamId() {
        return showTeamId;
    }

    public void setShowTeamId(Long showTeamId) {
        this.showTeamId = showTeamId;
    }

    public String getShowTeamType() {
        return showTeamType;
    }

    public void setShowTeamType(String showTeamType) {
        this.showTeamType = showTeamType;
    }

    public String getShowTeamName() {
        return showTeamName;
    }

    public void setShowTeamName(String showTeamName) {
        this.showTeamName = showTeamName;
    }

}

