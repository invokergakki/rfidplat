package com.iking.consumer.service;

import com.alibaba.dubbo.common.utils.StringUtils;
import com.alibaba.dubbo.config.annotation.Reference;
import com.iking.consumer.Vo.*;
import com.iking.provider.dao.domain.AssetsInfo;
import com.iking.provider.dao.domain.AssetsTagInfo;
import com.iking.provider.dao.domain.OpreateRecord;

import com.iking.provider.service.AssetsTagInfoService;
import com.iking.provider.service.AssetsTagsInfoService;
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
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Service
@RestController
@RequestMapping("/messages")
public class AssetsTagInfoController {

    private static final Logger logger = LoggerFactory.getLogger(AssetsTagInfoController.class);

    @Reference(version="1.0.0",timeout=100000)
    private AssetsTagInfoService assetsTagInfoService;

    @Reference(version="1.0.0",timeout=100000)
    private AssetsTagsInfoService assetsTagsInfoService;


    @RequestMapping(method = RequestMethod.POST)
    public ResponseHeaderVo queryOpreateRecord(@RequestBody AssetsTagInfoReqVo vo) {
        ResponseHeaderVo responseHeaderVO = new ResponseHeaderVo();
        try {
            for(int i=0;i<vo.getAssetsList().size();i++){

                AssetsTagInfo assetsDTO = new AssetsTagInfo();
                assetsDTO.setAssetsNumber(vo.getAssetsNumber());
                assetsDTO.setDevName(vo.getScanName());
                assetsDTO.setScanPlace(vo.getAssetsPlace());
                BeanUtils.copyProperties( vo.getAssetsList().get(i),assetsDTO);
                assetsDTO.setAssetsId(replace(vo.getAssetsList().get(i).getAssetsId()));
                assetsDTO.setScanDate(stringToDate(vo.getAssetsList().get(i).getScanDate()));
                assetsTagInfoService.insert(assetsDTO);
                responseHeaderVO.setResponseCode("0000");
                responseHeaderVO.setResponseMsg("success");
            }
        } catch (Exception e) {
            logger.error("插入固定资产相关表异常", e);
            responseHeaderVO.setResponseCode("9999");
            responseHeaderVO.setResponseMsg("server error");
            e.printStackTrace();
        }
        return responseHeaderVO;
    }

    @RequestMapping(method = RequestMethod.GET)
    public AssetsTagInfoRespVo queryAssetsTagInfoList(AssetsInfoQueryReqVo vo) {
        AssetsTagInfoRespVo assetsTagInfoRespVo = new AssetsTagInfoRespVo();
        try {
            List<AssetsTagInfo> assetsInfoAndTagInfoResult = assetsTagInfoService.selectPagingInfo(vo.getIndexFrom()-1,vo.getIndexCount());
            assetsTagInfoRespVo.setAssetsTagInfoList(assetsInfoAndTagInfoResult);
            int counts = assetsTagsInfoService.selectPagingInfoCount();
            assetsTagInfoRespVo.setAssetsTagInfoCountNumber(counts);
        } catch (Exception e) {
            logger.error("插入固定资产相关表异常", e);
            e.printStackTrace();
        }
        return assetsTagInfoRespVo;
    }

    public Date stringToDate(String string) throws ParseException {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss Z");
        date = sdf.parse(string);
        return date;
    }

    public static String replace(String str) {

        if(str==null){
            return null;
        }else if(StringUtils.isBlank(str)){
            return "";
        }
        String regEx = "[a-zA-Zａ-ｚＡ-Ｚ0-9０-９\\u4e00-\\u9fa5]";
        Pattern p = Pattern.compile(regEx);
        Matcher m = p.matcher(str);
        StringBuffer sb = new StringBuffer();
        while (m.find()) {
            sb.append(m.group());
        }
        return sb.toString();
    }
}