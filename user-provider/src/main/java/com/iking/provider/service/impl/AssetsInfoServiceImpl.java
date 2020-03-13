package com.iking.provider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.iking.provider.dao.domain.AssetsInfo;
import com.iking.provider.dao.mapper.AssetsInfoMapper;
import com.iking.provider.service.AssetsInfoService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
@Service(version="1.0.0")
public class AssetsInfoServiceImpl implements AssetsInfoService {

    @Autowired
    private AssetsInfoMapper assetsInfoMapper;


    @Override
    public List<AssetsInfo> selectPagingInfo(int indexFrom,int indexCount,String department)

    {
        return assetsInfoMapper.selectPagingInfo(indexFrom,indexCount,department);
    }

    @Override
    public List<AssetsInfo> selectPagingInfoWithNoDepartment(int indexFrom,int indexCount)

    {
        return assetsInfoMapper.selectPagingInfoWithNoDepartment(indexFrom,indexCount);
    }

    @Override
    public Integer selectPagingInfoCount(String department){
        return assetsInfoMapper.selectPagingInfoCount(department);
    }

    @Override
    public Integer selectPagingInfoCountWithNoDepartment(){
        return assetsInfoMapper.selectPagingInfoCountWithNoDepartment();
    }

    @Override
    public Integer deleteByPrimaryKey(String assetsId){
        return assetsInfoMapper.deleteByPrimaryKey(assetsId);
    }

    @Override
    public AssetsInfo selectByPrimaryKey(String assetsId){
        return assetsInfoMapper.selectByPrimaryKey(assetsId);
    }
}
