package com.example.klein.entity;

import java.io.Serializable;

/**
 * (Entertainment)实体类
 *
 * @author makejava
 * @since 2022-07-08 19:06:08
 */
public class Entertainment implements Serializable {
    private static final long serialVersionUID = 533613795942216362L;
    
    private Long entertainmentid;
    
    private String entertainmentname;
    
    private String entertainmenttype;
    
    private String phonenumber;


    public Long getEntertainmentid() {
        return entertainmentid;
    }

    public void setEntertainmentid(Long entertainmentid) {
        this.entertainmentid = entertainmentid;
    }

    public String getEntertainmentname() {
        return entertainmentname;
    }

    public void setEntertainmentname(String entertainmentname) {
        this.entertainmentname = entertainmentname;
    }

    public String getEntertainmenttype() {
        return entertainmenttype;
    }

    public void setEntertainmenttype(String entertainmenttype) {
        this.entertainmenttype = entertainmenttype;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

}

