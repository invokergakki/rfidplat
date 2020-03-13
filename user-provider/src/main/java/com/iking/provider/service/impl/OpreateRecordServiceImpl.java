package com.iking.provider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.iking.provider.dao.domain.OpreateRecord;
import com.iking.provider.dao.mapper.OpreateRecordMapper;
import com.iking.provider.service.OpreateRecordService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
@Service(version="1.0.0")
public class OpreateRecordServiceImpl implements OpreateRecordService {

    @Autowired
    private OpreateRecordMapper opreateRecordMapper;

    @Override
    public int insert(OpreateRecord record) {

        return opreateRecordMapper.insert(record);
    }

    @Override
    public List<OpreateRecord> selectByIsQueried(String flag) {
        System.out.println(flag);
        return opreateRecordMapper.selectByIsQueried(flag);
    }

    @Override
    public int updateQueried() {

        return opreateRecordMapper.updateQueried();
    }
}
