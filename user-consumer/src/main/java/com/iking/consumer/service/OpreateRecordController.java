package com.iking.consumer.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.iking.consumer.Vo.OpreateRecordVo;
import com.iking.provider.dao.domain.OpreateRecord;
import com.iking.provider.service.OpreateRecordService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@Service
@RestController
@RequestMapping("/opreateRecord")
public class OpreateRecordController {

    private static final Logger logger = LoggerFactory.getLogger(OpreateRecordController.class);

    @Reference(version="1.0.0",timeout=100000)
    private OpreateRecordService opreateRecordService;

    @RequestMapping(method = RequestMethod.GET)
    public OpreateRecordVo queryOpreateRecord() {

        OpreateRecord reqDTO = new OpreateRecord();
        OpreateRecordVo respVO = new OpreateRecordVo();
        int addNumberCount = 0;
        int updateNumberCount = 0;
        try {
            List<OpreateRecord> opreateRecordResultList = new ArrayList<>();
            opreateRecordResultList = opreateRecordService.selectByIsQueried("N");
            logger.info(String.valueOf(opreateRecordResultList.size()));
            for (int i = 0; i < opreateRecordResultList.size(); i++) {
                addNumberCount = addNumberCount+opreateRecordResultList.get(i).getAddedNumber();
                updateNumberCount = opreateRecordResultList.get(i).getUpdatedNumber();
            }
            opreateRecordService.updateQueried();
            respVO.setAddedNumber(addNumberCount);
            respVO.setUpdatedNumber(updateNumberCount);
        } catch (Exception e) {
            respVO.setAddedNumber(0);
            respVO.setUpdatedNumber(0);
        }
        return respVO;
    }
}