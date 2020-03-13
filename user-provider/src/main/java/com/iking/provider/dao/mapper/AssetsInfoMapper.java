package com.iking.provider.dao.mapper;

import com.iking.provider.dao.domain.AssetsInfo;
import com.iking.provider.dao.domain.AssetsInfoExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface AssetsInfoMapper {
    long countByExample(AssetsInfoExample example);

    int deleteByExample(AssetsInfoExample example);

    int deleteByPrimaryKey(String assetsId);

    int insert(AssetsInfo record);

    int insertSelective(AssetsInfo record);

    List<AssetsInfo> selectByExample(AssetsInfoExample example);

    AssetsInfo selectByPrimaryKey(String assetsId);

    int updateByExampleSelective(@Param("record") AssetsInfo record, @Param("example") AssetsInfoExample example);

    int updateByExample(@Param("record") AssetsInfo record, @Param("example") AssetsInfoExample example);

    int updateByPrimaryKeySelective(AssetsInfo record);

    int updateByPrimaryKey(AssetsInfo record);

    List<AssetsInfo> selectPagingInfo(@Param("indexFrom") int indexFrom,@Param("indexCount") int indexCount,@Param("department") String department);

    List<AssetsInfo> selectPagingInfoWithNoDepartment(@Param("indexFrom") int indexFrom,@Param("indexCount") int indexCount);


    Integer selectPagingInfoCount(@Param("department") String department);

    Integer selectPagingInfoCountWithNoDepartment();
}