package com.iking.consumer.Vo;

/**
 * Created by qb2018-zhangjingzhi on 2019/7/13.
 */
public class OpreateRecordReqVo {
    private static final long serialVersionUID = -3903658270369390692L;


    private String isQueried;

    public String getIsQueried() {
        return isQueried;
    }

    public void setIsQueried(String isQueried) {
        this.isQueried = isQueried == null ? null : isQueried.trim();
    }



}
