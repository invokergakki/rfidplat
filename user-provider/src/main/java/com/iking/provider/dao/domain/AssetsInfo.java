package com.iking.provider.dao.domain;

import java.io.Serializable;

public class AssetsInfo implements Serializable {
    private String assetsId;

    private String assetsName;

    private String assetsType;

    private String assetsUse;

    private String department;

    private String userName;

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

    public String getAssetsName() {
        return assetsName;
    }

    public void setAssetsName(String assetsName) {
        this.assetsName = assetsName == null ? null : assetsName.trim();
    }

    public String getAssetsType() {
        return assetsType;
    }

    public void setAssetsType(String assetsType) {
        this.assetsType = assetsType == null ? null : assetsType.trim();
    }

    public String getAssetsUse() {
        return assetsUse;
    }

    public void setAssetsUse(String assetsUse) {
        this.assetsUse = assetsUse == null ? null : assetsUse.trim();
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department == null ? null : department.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getField1() {
        return status;
    }

    public void setField1(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getField2() {
        return opreate;
    }

    public void setField2(String opreate) {
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