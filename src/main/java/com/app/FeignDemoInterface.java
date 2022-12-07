package com.app;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "demoFeign", url = "http://localhost:8080")
public interface FeignDemoInterface {

	@GetMapping("/getCaseData/")
	public String getData();
	
}
