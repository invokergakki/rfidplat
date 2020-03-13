package com.iking.provider.dao.domain;

import java.io.Serializable;

public class OpreateRecord implements Serializable {
    private Integer id;

    private Integer addedNumber;

    private Integer updatedNumber;

    private String isQueried;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAddedNumber() {
        return addedNumber;
    }

    public void setAddedNumber(Integer addedNumber) {
        this.addedNumber = addedNumber;
    }

    public Integer getUpdatedNumber() {
        return updatedNumber;
    }

    public void setUpdatedNumber(Integer updatedNumber) {
        this.updatedNumber = updatedNumber;
    }

    public String getIsQueried() {
        return isQueried;
    }

    public void setIsQueried(String isQueried) {
        this.isQueried = isQueried == null ? null : isQueried.trim();
    }
}