package com.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/feignProject")
public class Controler {

	@Autowired
	Service service;
	
	@GetMapping("/getDataUsingFeign/")
	public String getCaseData() {
		return service.getCaseData();
	}
}
