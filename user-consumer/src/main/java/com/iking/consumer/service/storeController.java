package com.iking.consumer.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.iking.consumer.Vo.*;
import com.iking.provider.dao.domain.AssetsInfo;
import com.iking.provider.dao.domain.AssetsTagInfo;
import com.iking.provider.service.AssetsInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@Service
@RestController
@RequestMapping("/storeDelete")
public class storeController {

    private static final Logger logger = LoggerFactory.getLogger(storeController.class);

    @Reference(version="1.0.0",timeout=100000)
    private AssetsInfoService assetsInfoService;



    @RequestMapping(method = RequestMethod.POST)
    public StoreDeleteRespVo queryOpreateRecord(@RequestBody StorageReqVo vo) {

        StoreDeleteRespVo respVO = new StoreDeleteRespVo();
        int counts=0;
            for(int i=0;i<vo.getCheckList().length;i++){
                    counts = counts+1;
                    assetsInfoService.deleteByPrimaryKey(vo.getCheckList()[i]);
            }
        respVO.setCounts(counts);
        return respVO;
    }
}