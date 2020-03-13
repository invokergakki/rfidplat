package com.iking.customer.service;

import org.springframework.stereotype.Service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.iking.restapi.service.DemoService;

@Service
public class InvorkService {
	
	@Reference(version="1.0.0",timeout=100000)
	private DemoService demoServices;
	
	public void sayHello(String name) {
		System.out.println("消费端调用----------------------------------------------------------------");
		String result = demoServices.sayHello(name);
		System.out.println("result ====================================================  " + result);
	}

}
