package com.iking.consumer.service;

import com.iking.provider.dao.domain.OpreateRecord;
import com.iking.provider.service.DemoService;
import com.iking.provider.service.OpreateRecordService;
import org.springframework.stereotype.Service;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@Service
@RestController
@RequestMapping("/opreateRecords")
public class InvorkService {
	
	@Reference(version="1.0.0",timeout=100000)
	private DemoService demoServices;

	@Reference(version="1.0.0",timeout=100000)
	private OpreateRecordService opreateRecordService;

    @RequestMapping(method = RequestMethod.GET)
	public void sayHello(String name) {
		System.out.println("消费端调用----------------------------------------------------------------");
		String result = demoServices.sayHello(name);
		System.out.println("result ====================================================  " + result);
		List<OpreateRecord> queryResult= new ArrayList<>();
		queryResult = opreateRecordService.selectByIsQueried("Y");
		System.out.println(queryResult.size());
		System.out.println("test");
	}

}
