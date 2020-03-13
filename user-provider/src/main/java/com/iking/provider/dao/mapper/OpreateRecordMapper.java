package com.iking.provider.dao.mapper;

import com.iking.provider.dao.domain.OpreateRecord;
import com.iking.provider.dao.domain.OpreateRecordExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface OpreateRecordMapper {


    int insert(OpreateRecord record);

    int updateQueried();

    List<OpreateRecord> selectByIsQueried(String isQueried);
}