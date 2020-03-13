package com.iking.consumer.Vo;

import java.util.List;

public class AssetsInfoQueryRespVo {
    private static final long serialVersionUID = -3903658270369390692L;

    public List<AssetsInfoAndTagInfoVo> getAssetsInfoAndTagInfoVoList() {
        return assetsInfoAndTagInfoVoList;
    }

    public void setAssetsInfoAndTagInfoVoList(List<AssetsInfoAndTagInfoVo> assetsInfoAndTagInfoVoList) {
        this.assetsInfoAndTagInfoVoList = assetsInfoAndTagInfoVoList;
    }

    private List<AssetsInfoAndTagInfoVo> assetsInfoAndTagInfoVoList;

    public int getAssetsInfoNumber() {
        return assetsInfoNumber;
    }

    public void setAssetsInfoNumber(int assetsInfoNumber) {
        this.assetsInfoNumber = assetsInfoNumber;
    }

    private int assetsInfoNumber;
}
