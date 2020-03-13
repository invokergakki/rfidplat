package com.iking.consumer.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.iking.consumer.Vo.*;
import com.iking.provider.dao.domain.AssetsInfo;
import com.iking.provider.dao.domain.AssetsTagInfo;
import com.iking.provider.dao.domain.OpreateRecord;
import com.iking.provider.service.AssetsInfoService;
import com.iking.provider.service.AssetsTagInfoService;
import com.iking.provider.service.OpreateRecordService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
@RestController
@RequestMapping("/assetsInfoAndTagInfo")
public class AssetsInfoAndTagInfoController {

    private static final Logger logger = LoggerFactory.getLogger(AssetsInfoAndTagInfoController.class);

    @Reference(version="1.0.0",timeout=100000)
    private AssetsInfoService assetsInfoService;



    @RequestMapping(method = RequestMethod.GET)
    public AssetsInfoQueryRespVo queryOpreateRecord(AssetsInfoQueryReqVo vo) {

        AssetsInfoQueryRespVo respVO = new AssetsInfoQueryRespVo();
        List<AssetsInfo> assetsInfoAndTagInfoResult = new ArrayList<>();
        List<AssetsInfoAndTagInfoVo> assetsInfoAndTagInfoVoList = new ArrayList<>();
        try {
            if(vo.getDepartment()!=null){
                assetsInfoAndTagInfoResult = assetsInfoService.selectPagingInfo((vo.getIndexFrom()-1)*5,vo.getIndexCount(),vo.getDepartment());
                int counts = assetsInfoService.selectPagingInfoCount(vo.getDepartment());
                respVO.setAssetsInfoNumber(counts);
            }else if(vo.getDepartment()==null){
                assetsInfoAndTagInfoResult = assetsInfoService.selectPagingInfoWithNoDepartment((vo.getIndexFrom()-1)*5,vo.getIndexCount());
                int counts = assetsInfoService.selectPagingInfoCountWithNoDepartment();
                respVO.setAssetsInfoNumber(counts);
            }
            for (int i = 0; i < assetsInfoAndTagInfoResult.size(); i++) {
                AssetsInfoAndTagInfoVo assetsInfoAndTagInfoVo = new AssetsInfoAndTagInfoVo();
                BeanUtils.copyProperties(assetsInfoAndTagInfoResult.get(i), assetsInfoAndTagInfoVo);
                assetsInfoAndTagInfoVoList.add(assetsInfoAndTagInfoVo);
            }
            respVO.setAssetsInfoAndTagInfoVoList(assetsInfoAndTagInfoVoList);
        } catch (Exception e) {
            logger.error("插入固定资产相关表异常", e);
            e.printStackTrace();
        }
        return respVO;
    }
}