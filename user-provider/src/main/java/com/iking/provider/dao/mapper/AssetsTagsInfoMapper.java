package com.iking.provider.dao.mapper;

import com.iking.provider.dao.domain.AssetsTagInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface AssetsTagsInfoMapper {

    int insert(AssetsTagInfo record);

    int update(AssetsTagInfo record);

    AssetsTagInfo selectByPrimaryKey(AssetsTagInfo assetsTagInfo);

    AssetsTagInfo selectByAssetsId(@Param("assetsId") String assetsId);

    List<AssetsTagInfo> selectPagingInfo(@Param("indexFrom") int indexFrom, @Param("indexCount") int indexCount);

    Integer selectPagingInfoCount();

    int deleteByAssetsIdAndStatus();

    int updateByStatus(@Param("assetsId") String assetsId);
}