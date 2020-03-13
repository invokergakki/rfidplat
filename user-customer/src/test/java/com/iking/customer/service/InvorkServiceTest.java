package com.iking.customer.service;


import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.iking.customer.BaseTest;

public class InvorkServiceTest extends BaseTest{
	
	@Autowired
	private InvorkService invorkService;
	
	@Test
	public void testSayHello() {
		invorkService.sayHello("张三");
	}

}
