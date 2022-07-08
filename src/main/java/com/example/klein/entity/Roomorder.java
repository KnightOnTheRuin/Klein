package com.example.klein.entity;

import java.io.Serializable;

/**
 * (Roomorder)实体类
 *
 * @author makejava
 * @since 2022-07-08 19:09:37
 */
public class Roomorder implements Serializable {
    private static final long serialVersionUID = -56986179372422842L;
    
    private Long orderid;
    
    private Long roomid;
    
    private Long visitorid;
    
    private Long administratorid;
    
    private Integer result;


    public Long getOrderid() {
        return orderid;
    }

    public void setOrderid(Long orderid) {
        this.orderid = orderid;
    }

    public Long getRoomid() {
        return roomid;
    }

    public void setRoomid(Long roomid) {
        this.roomid = roomid;
    }

    public Long getVisitorid() {
        return visitorid;
    }

    public void setVisitorid(Long visitorid) {
        this.visitorid = visitorid;
    }

    public Long getAdministratorid() {
        return administratorid;
    }

    public void setAdministratorid(Long administratorid) {
        this.administratorid = administratorid;
    }

    public Integer getResult() {
        return result;
    }

    public void setResult(Integer result) {
        this.result = result;
    }

}

