package com.iking.provider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.iking.provider.service.DemoService;

@Service(version="1.0.0")
public class DemoServiceImpl implements DemoService {

	@Override
	public String sayHello(String name) {
		System.out.println("服务端调用 -------------------------------------------------------------------------");
		return "Hello " + name;
	}

}
