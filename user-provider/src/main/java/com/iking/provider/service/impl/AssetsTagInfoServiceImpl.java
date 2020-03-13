package com.iking.provider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.iking.provider.dao.domain.AssetsInfo;
import com.iking.provider.dao.domain.AssetsTagInfo;
import com.iking.provider.dao.mapper.AssetsTagInfoMapper;
import com.iking.provider.service.AssetsTagInfoService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service(version="1.0.0")
public class AssetsTagInfoServiceImpl implements AssetsTagInfoService {

    @Autowired
    private AssetsTagInfoMapper assetsTagInfoMapper;

    @Override
    public int insert(AssetsTagInfo assetsTagInfo) {

        return assetsTagInfoMapper.insert(assetsTagInfo);
    }

    @Override
    public int update(AssetsTagInfo assetsTagInfo) {

        return assetsTagInfoMapper.update(assetsTagInfo);
    }

    @Override
    public AssetsTagInfo selectByPrimaryKey(AssetsTagInfo assetsTagInfo) {

        return assetsTagInfoMapper.selectByPrimaryKey(assetsTagInfo);
    }

    @Override
    public AssetsTagInfo selectByAssetsId(String assetsId) {

        return assetsTagInfoMapper.selectByAssetsId(assetsId);
    }

    @Override
    public List<AssetsTagInfo> selectPagingInfo(int indexFrom, int indexCount)

    {
        return assetsTagInfoMapper.selectPagingInfo(indexFrom,indexCount);
    }
    @Override
    public Integer selectPagingInfoCount(){
        return assetsTagInfoMapper.selectPagingInfoCount();
    }

    @Override
    public int updateByStatus(String assetsId){
        return assetsTagInfoMapper.updateByStatus(assetsId);
    }

    @Override
    public int deleteByAssetsIdAndStatus(){
        return assetsTagInfoMapper.deleteByAssetsIdAndStatus();
    }
}
