package com.iking.consumer.Vo;

import com.iking.provider.dao.domain.AssetsTagInfo;

import java.util.List;

public class AssetsTagInfoRespVo {
    private static final long serialVersionUID = -3903658270369390692L;




    public List<AssetsTagInfo> assetsTagInfoList;

    private int assetsTagInfoCountNumber;

    public List<AssetsTagInfo> getAssetsTagInfoList() {
        return assetsTagInfoList;
    }

    public void setAssetsTagInfoList(List<AssetsTagInfo> assetsTagInfoList) {
        this.assetsTagInfoList = assetsTagInfoList;
    }

    public int getAssetsTagInfoCountNumber() {
        return assetsTagInfoCountNumber;
    }

    public void setAssetsTagInfoCountNumber(int assetsTagInfoCountNumber) {
        this.assetsTagInfoCountNumber = assetsTagInfoCountNumber;
    }
}
