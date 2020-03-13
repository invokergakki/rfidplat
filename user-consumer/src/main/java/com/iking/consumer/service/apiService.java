package com.iking.consumer.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.iking.consumer.Vo.ApiInfoRespVo;
import com.iking.consumer.Vo.DataRespVo;
import com.iking.consumer.Vo.LoginDataRespVo;
import com.iking.consumer.Vo.LoginRespVo;
import com.iking.provider.dao.domain.OpreateRecord;
import com.iking.provider.service.DemoService;
import com.iking.provider.service.OpreateRecordService;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@Service
@RestController
@RequestMapping("/api/user")
public class apiService {


    @RequestMapping(value="/info",method = RequestMethod.GET)
	public ApiInfoRespVo sayHello() {
    	ApiInfoRespVo apiInfoRespVo = new ApiInfoRespVo();
    	apiInfoRespVo.setCode(1);
		DataRespVo dataRespVo = new DataRespVo();
		dataRespVo.setName("admin");
		dataRespVo.setAvatar("https://randy168.com/1533262153771.gif");
		List<String> roles = new ArrayList<>();
		String admin = "admin";
		roles.add(admin);
		dataRespVo.setRoles(roles);
		List<String> data = new ArrayList<>();
		data.add("order-manage");
		data.add("order-list");
		data.add("product-manage");
		data.add("product-list");
		data.add("review-manage");
		data.add("return-goods");
		data.add("goods");
		data.add("goods-list");
		data.add("goods-classify");
		data.add("permission");
		data.add("user-manage");
		data.add("role-manage");
		data.add("menu-manage");
		dataRespVo.setData(data);
		apiInfoRespVo.setData(dataRespVo);
    	return apiInfoRespVo;
	}

	@RequestMapping(value="/login",method = RequestMethod.POST)
	public LoginRespVo login() {
		LoginRespVo loginRespVo = new LoginRespVo();
		LoginDataRespVo loginDataRespVo = new LoginDataRespVo();
		loginRespVo.setCode(1);
		loginRespVo.setMessage("获取token成功");
		loginDataRespVo.setToken("eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6ImFkbWluIiwiaWF0IjoxNTYzNzY0MDAxLCJleHAiOjE1NjM4NTA0MDF9.14dEfjBNN4L1QiPIsArkhv4kzwYXseWzLPNBVbQSx-k");
		loginRespVo.setData(loginDataRespVo);
		return loginRespVo;
	}
}
