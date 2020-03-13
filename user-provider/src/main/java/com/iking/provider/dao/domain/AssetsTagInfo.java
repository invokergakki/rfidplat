package com.iking.provider.dao.domain;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

public class AssetsTagInfo implements Serializable {
    private String assetsId;

    private String epcId;

    private String assetsNumber;

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date scanDate;

    private String scanPlace;

    private String devName;

    private String status;

    private String opreate;

    private String field3;

    private String field4;

    private String field5;

    private static final long serialVersionUID = 1L;

    public String getAssetsId() {
        return assetsId;
    }

    public void setAssetsId(String assetsId) {
        this.assetsId = assetsId == null ? null : assetsId.trim();
    }

    public String getEpcId() {
        return epcId;
    }

    public void setEpcId(String epcId) {
        this.epcId = epcId == null ? null : epcId.trim();
    }

    public String getAssetsNumber() {
        return assetsNumber;
    }

    public void setAssetsNumber(String assetsNumber) {
        this.assetsNumber = assetsNumber == null ? null : assetsNumber.trim();
    }

    public Date getScanDate() {
        return scanDate;
    }

    public void setScanDate(Date scanDate) {
        this.scanDate = scanDate;
    }

    public String getScanPlace() {
        return scanPlace;
    }

    public void setScanPlace(String scanPlace) {
        this.scanPlace = scanPlace == null ? null : scanPlace.trim();
    }

    public String getDevName() {
        return devName;
    }

    public void setDevName(String devName) {
        this.devName = devName == null ? null : devName.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getOpreate() {
        return opreate;
    }

    public void setOpreate(String opreate) {
        this.opreate = opreate == null ? null : opreate.trim();
    }

    public String getField3() {
        return field3;
    }

    public void setField3(String field3) {
        this.field3 = field3 == null ? null : field3.trim();
    }

    public String getField4() {
        return field4;
    }

    public void setField4(String field4) {
        this.field4 = field4 == null ? null : field4.trim();
    }

    public String getField5() {
        return field5;
    }

    public void setField5(String field5) {
        this.field5 = field5 == null ? null : field5.trim();
    }
}