package com.test.backend.services;

import org.springframework.stereotype.Service;

import com.test.backend.model.OutPutDataTest;

@Service
public interface TestService {

	public OutPutDataTest getIpAddressAndInstance(String ip);
	
}
