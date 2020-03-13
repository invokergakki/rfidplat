package com.iking.consumer.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.iking.consumer.Vo.OpreateRecordVo;
import com.iking.consumer.Vo.StorageReqVo;
import com.iking.provider.dao.domain.AssetsTagInfo;
import com.iking.provider.dao.domain.OpreateRecord;
import com.iking.provider.service.AssetsTagInfoService;
import com.iking.provider.service.AssetsTagsInfoService;
import com.iking.provider.service.DemoService;
import com.iking.provider.service.OpreateRecordService;
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
@RequestMapping("/storage")
public class ToDoAssetsTagInfoController {

	@Reference(version="1.0.0",timeout=100000)
	private AssetsTagInfoService assetsTagInfoService;

	@Reference(version="1.0.0",timeout=100000)
	private AssetsTagsInfoService assetsTagsInfoService;

	@Reference(version="1.0.0",timeout=100000)
	private OpreateRecordService opreateRecordService;

    @RequestMapping(method = RequestMethod.POST)
	public void sayHello(@RequestBody StorageReqVo vo) {
		System.out.println(vo);
		int addedNumber = 0;
		int updatedNumber = 0;
		String isQueried = "N";
		OpreateRecordVo opreateRecordVo = new OpreateRecordVo();
		for(int i=0;i<vo.getCheckList().length;i++){
			AssetsTagInfo assetsTagInfo = assetsTagsInfoService.selectByAssetsId(vo.getCheckList()[i]);
			AssetsTagInfo assetsTagInfos = assetsTagInfoService.selectByAssetsId(vo.getCheckList()[i]);
			if(assetsTagInfo == null){
				addedNumber = addedNumber+1;
				assetsTagsInfoService.insert(assetsTagInfos);
			}else if(assetsTagInfo != null){
				updatedNumber = updatedNumber+1;
				assetsTagsInfoService.update(assetsTagInfos);
			}
		}
		opreateRecordVo.setUpdatedNumber(updatedNumber);
		opreateRecordVo.setAddedNumber(addedNumber);
		opreateRecordVo.setIsQueried(isQueried);
		OpreateRecord opreateRecordDTO = new OpreateRecord();
		BeanUtils.copyProperties(opreateRecordVo,opreateRecordDTO);
		opreateRecordService.insert(opreateRecordDTO);
		assetsTagInfoService.deleteByAssetsIdAndStatus();
	}
}
