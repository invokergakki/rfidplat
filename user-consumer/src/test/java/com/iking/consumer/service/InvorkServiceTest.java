package com.iking.consumer.service;


import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.iking.consumer.BaseTest;
import com.iking.consumer.service.InvorkService;

public class InvorkServiceTest extends BaseTest{
	
	@Autowired
	private InvorkService invorkService;
	
	@Test
	public void testSayHello() {
		invorkService.sayHello("张三");
	}

}
