package com.iking.consumer.Vo;

public class AssetsInfoPartVo {
    public String getScanDate() {
        return scanDate;
    }

    public void setScanDate(String scanDate) {
        this.scanDate = scanDate;
    }

    public String getEpcId() {
        return epcId;
    }

    public void setEpcId(String epcId) {
        this.epcId = epcId;
    }

    public String getAssetsId() {
        return assetsId;
    }

    public void setAssetsId(String assetsId) {
        this.assetsId = assetsId;
    }

    private String assetsId;
    private String epcId;
    private String scanDate;
}
