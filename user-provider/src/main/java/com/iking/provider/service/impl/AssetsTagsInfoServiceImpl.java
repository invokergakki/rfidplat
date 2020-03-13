package com.iking.provider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.iking.provider.dao.domain.AssetsTagInfo;
import com.iking.provider.dao.mapper.AssetsTagsInfoMapper;
import com.iking.provider.service.AssetsTagInfoService;
import com.iking.provider.service.AssetsTagsInfoService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service(version="1.0.0")
public class AssetsTagsInfoServiceImpl implements AssetsTagsInfoService {

    @Autowired
    private AssetsTagsInfoMapper assetsTagsInfoMapper;

    @Override
    public int insert(AssetsTagInfo assetsTagInfo) {

        return assetsTagsInfoMapper.insert(assetsTagInfo);
    }

    @Override
    public int update(AssetsTagInfo assetsTagInfo) {

        return assetsTagsInfoMapper.update(assetsTagInfo);
    }

    @Override
    public AssetsTagInfo selectByPrimaryKey(AssetsTagInfo assetsTagInfo) {

        return assetsTagsInfoMapper.selectByPrimaryKey(assetsTagInfo);
    }

    @Override
    public AssetsTagInfo selectByAssetsId(String assetsId) {

        return assetsTagsInfoMapper.selectByAssetsId(assetsId);
    }

    @Override
    public List<AssetsTagInfo> selectPagingInfo(int indexFrom, int indexCount)

    {
        return assetsTagsInfoMapper.selectPagingInfo(indexFrom,indexCount);
    }
    @Override
    public Integer selectPagingInfoCount(){
        return assetsTagsInfoMapper.selectPagingInfoCount();
    }

    @Override
    public int updateByStatus(String assetsId){
        return assetsTagsInfoMapper.updateByStatus(assetsId);
    }

    @Override
    public int deleteByAssetsIdAndStatus(){
        return assetsTagsInfoMapper.deleteByAssetsIdAndStatus();
    }
}
