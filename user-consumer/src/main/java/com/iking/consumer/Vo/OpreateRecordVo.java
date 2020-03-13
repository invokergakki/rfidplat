package com.iking.consumer.Vo;

/**
 * Created by qb2018-zhangjingzhi on 2019/7/13.
 */
public class OpreateRecordVo {
    private static final long serialVersionUID = -3903658270369390692L;

    private Integer id;

    private Integer addedNumber;

    private Integer updatedNumber;

    private String isQueried;

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
