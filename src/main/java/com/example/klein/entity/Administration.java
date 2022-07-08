package com.example.klein.entity;

import java.io.Serializable;

/**
 * (Administration)实体类
 *
 * @author makejava
 * @since 2022-07-08 19:05:26
 */
public class Administration implements Serializable {
    private static final long serialVersionUID = -59241270481846739L;
    
    private Long administrationid;
    
    private Long administratorid;
    
    private Long hotelid;


    public Long getAdministrationid() {
        return administrationid;
    }

    public void setAdministrationid(Long administrationid) {
        this.administrationid = administrationid;
    }

    public Long getAdministratorid() {
        return administratorid;
    }

    public void setAdministratorid(Long administratorid) {
        this.administratorid = administratorid;
    }

    public Long getHotelid() {
        return hotelid;
    }

    public void setHotelid(Long hotelid) {
        this.hotelid = hotelid;
    }

}

