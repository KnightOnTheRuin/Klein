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
    
    private Long showteamid;
    
    private String showteamtype;
    
    private String showteamname;


    public Long getShowteamid() {
        return showteamid;
    }

    public void setShowteamid(Long showteamid) {
        this.showteamid = showteamid;
    }

    public String getShowteamtype() {
        return showteamtype;
    }

    public void setShowteamtype(String showteamtype) {
        this.showteamtype = showteamtype;
    }

    public String getShowteamname() {
        return showteamname;
    }

    public void setShowteamname(String showteamname) {
        this.showteamname = showteamname;
    }

}

