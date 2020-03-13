package com.iking.consumer.Vo;

public class AssetsInfoAndTagInfoVo {
    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 5759172199859708554L;

    public String getAssetsId() {
        return assetsId;
    }

    public void setAssetsId(String assetsId) {
        this.assetsId = assetsId;
    }

    private String assetsId;
    private String epcId;
    private String scanPlace;
    private String scanDate;

    public String getScanPlace() {
        return scanPlace;
    }

    public void setScanPlace(String scanPlace) {
        this.scanPlace = scanPlace;
    }

    public String getEpcId() {
        return epcId;
    }

    public void setEpcId(String epcId) {
        this.epcId = epcId;
    }

    public String getScanDate() {
        return scanDate;
    }

    public void setScanDate(String scanDate) {
        this.scanDate = scanDate;
    }

    public String getAssetsName() {
        return assetsName;
    }

    public void setAssetsName(String assetsName) {
        this.assetsName = assetsName;
    }

    public String getAssetsType() {
        return assetsType;
    }

    public void setAssetsType(String assetsType) {
        this.assetsType = assetsType;
    }

    public String getAssetsUse() {
        return assetsUse;
    }

    public void setAssetsUse(String assetsUse) {
        this.assetsUse = assetsUse;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    private String assetsName;
    private String assetsType;
    private String assetsUse;
    private String department;
    private String userName;
}
