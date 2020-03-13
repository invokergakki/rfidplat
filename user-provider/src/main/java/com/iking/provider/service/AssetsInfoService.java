package com.iking.provider.service;

import com.iking.provider.dao.domain.AssetsInfo;

import java.util.List;

public interface AssetsInfoService {

    List<AssetsInfo> selectPagingInfo(int indexFrom, int indexCount,String department);

    List<AssetsInfo> selectPagingInfoWithNoDepartment(int indexFrom, int indexCount);

    Integer selectPagingInfoCount(String department);

    Integer selectPagingInfoCountWithNoDepartment();

    Integer deleteByPrimaryKey(String assetsId);

    AssetsInfo selectByPrimaryKey(String assetsId);

}
