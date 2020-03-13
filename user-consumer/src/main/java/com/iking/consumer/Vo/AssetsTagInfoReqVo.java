package com.iking.consumer.Vo;

import java.util.List;

public class AssetsTagInfoReqVo {
    private static final long serialVersionUID = -3903658270369390692L;
    public String getScanName() {
        return scanName;
    }

    public void setScanName(String scanName) {
        this.scanName = scanName;
    }

    public String getAssetsPlace() {
        return assetsPlace;
    }

    public void setAssetsPlace(String assetsPlace) {
        this.assetsPlace = assetsPlace;
    }

    private String scanName;



    private String assetsPlace;
    private String assetsNumber;

    public List<AssetsInfoPartVo> getAssetsList() {
        return assetsList;
    }

    public void setAssetsList(List<AssetsInfoPartVo> assetsList) {
        this.assetsList = assetsList;
    }

    public List<AssetsInfoPartVo> assetsList;



    public String getAssetsNumber() {
        return assetsNumber;
    }

    public void setAssetsNumber(String assetsNumber) {
        this.assetsNumber = assetsNumber;
    }
}
