package com.iking.provider.service;

import com.iking.provider.dao.domain.OpreateRecord;

import java.util.List;

public interface OpreateRecordService {
    int insert(OpreateRecord record);

    List<OpreateRecord> selectByIsQueried(String flag);

    int updateQueried();
}
