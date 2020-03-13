package com.iking.consumer.Vo;

public class AssetsInfoQueryReqVo {
    public int getIndexFrom() {
        return indexFrom;
    }

    public void setIndexFrom(int indexFrom) {
        this.indexFrom = indexFrom;
    }

    public int getIndexCount() {
        return indexCount;
    }

    public void setIndexCount(int indexCount) {
        this.indexCount = indexCount;
    }

    private int indexFrom;//页码

    private int indexCount;//每页条数

    private String department;

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
