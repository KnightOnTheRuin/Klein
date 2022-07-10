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
    
    private Long administrationId;
    
    private Long administratorId;
    
    private Long hotelId;


    public Long getAdministrationId() {
        return administrationId;
    }

    public Long getHotelId() {
        return hotelId;
    }

    public void setAdministrationId(Long administrationid) {
        this.administrationId = administrationid;
    }

    public Long getAdministratorId() {return administratorId;}

    //public Long getAdministratorid() {return administratorId;}

    public void setAdministratorId(Long administratorid) {
        this.administratorId = administratorid;
    }

    /*//public Long getHotelid() {
        return hotelId;
    }*/

    public void setHotelId(Long hotelid) {
        this.hotelId = hotelid;
    }

}

