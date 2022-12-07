package com.app;

import org.springframework.beans.factory.annotation.Autowired;

@org.springframework.stereotype.Service
public class Service {
	
	@Autowired
	FeignDemoInterface feignClient;
	
	public String getCaseData() {
		return feignClient.getData();
	}

}
