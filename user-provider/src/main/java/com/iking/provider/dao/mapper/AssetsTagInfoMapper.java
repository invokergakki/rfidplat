package com.iking.provider.dao.mapper;

import com.iking.provider.dao.domain.AssetsInfo;
import com.iking.provider.dao.domain.AssetsTagInfo;
import com.iking.provider.dao.domain.AssetsTagInfoExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface AssetsTagInfoMapper {

    int insert(AssetsTagInfo record);

    int update(AssetsTagInfo record);

    AssetsTagInfo selectByPrimaryKey(AssetsTagInfo assetsTagInfo);

    AssetsTagInfo selectByAssetsId(@Param("assetsId") String assetsId);

    List<AssetsTagInfo> selectPagingInfo(@Param("indexFrom") int indexFrom, @Param("indexCount") int indexCount);

    Integer selectPagingInfoCount();

    int deleteByAssetsIdAndStatus();

    int updateByStatus(@Param("assetsId") String assetsId);
}