package com.example.klein.entity;

import java.io.Serializable;

/**
 * (Hotel)实体类
 *
 * @author makejava
 * @since 2022-07-08 19:08:11
 */
public class Hotel implements Serializable {
    private static final long serialVersionUID = -28885981114150919L;
    
    private Long hotelid;
    
    private String hotelname;
    
    private Integer startlevel;
    
    private String phonenumber;
    
    private String address;


    public Long getHotelid() {
        return hotelid;
    }

    public void setHotelid(Long hotelid) {
        this.hotelid = hotelid;
    }

    public String getHotelname() {
        return hotelname;
    }

    public void setHotelname(String hotelname) {
        this.hotelname = hotelname;
    }

    public Integer getStartlevel() {
        return startlevel;
    }

    public void setStartlevel(Integer startlevel) {
        this.startlevel = startlevel;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}

