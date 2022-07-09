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
    
    private Long orderId;
    
    private Long roomId;
    
    private Long visitorId;
    
    private Long administratorId;
    
    private Integer result;


    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getRoomId() {
        return roomId;
    }

    public void setRoomId(Long roomId) {
        this.roomId = roomId;
    }

    public Long getVisitorId() {
        return visitorId;
    }

    public void setVisitorId(Long visitorId) {
        this.visitorId = visitorId;
    }

    public Long getAdministratorId() {
        return administratorId;
    }

    public void setAdministratorId(Long administratorId) {
        this.administratorId = administratorId;
    }

    public Integer getResult() {
        return result;
    }

    public void setResult(Integer result) {
        this.result = result;
    }

}

