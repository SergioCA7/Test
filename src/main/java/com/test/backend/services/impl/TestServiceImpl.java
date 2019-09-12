package com.test.backend.services.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.test.backend.model.OutPutDataTest;
import com.test.backend.services.TestService;
@Service
public class TestServiceImpl implements TestService {
	
	 @Value("${microservice.instance.ID}")
	 private String instance;


	@Override
	public OutPutDataTest getIpAddressAndInstance(String ip) {
		OutPutDataTest  response = new OutPutDataTest();
		response.setInstance(instance);
		response.setClientIp(ip);
		return response;
	}
	
	

}
