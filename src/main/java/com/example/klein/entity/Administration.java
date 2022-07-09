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

    public void setAdministrationId(Long administrationId) {
        this.administrationId = administrationId;
    }

    public Long getAdministratorId() {
        return administratorId;
    }

    public void setAdministratorId(Long administratorId) {
        this.administratorId = administratorId;
    }

    public Long getHotelId() {
        return hotelId;
    }

    public void setHotelId(Long hotelId) {
        this.hotelId = hotelId;
    }

}

