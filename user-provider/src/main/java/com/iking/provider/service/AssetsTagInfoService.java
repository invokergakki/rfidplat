package com.iking.provider.service;

import com.iking.provider.dao.domain.AssetsInfo;
import com.iking.provider.dao.domain.AssetsTagInfo;

import java.util.List;

public interface AssetsTagInfoService {
    int insert(AssetsTagInfo assetsTagInfo);

    int update(AssetsTagInfo assetsTagInfo);

    AssetsTagInfo selectByPrimaryKey(AssetsTagInfo assetsTagInfo);

    AssetsTagInfo selectByAssetsId(String assetsId);

    List<AssetsTagInfo> selectPagingInfo(int indexFrom, int indexCount);

    Integer selectPagingInfoCount();

    int updateByStatus(String assetsId);

    int deleteByAssetsIdAndStatus();
}
