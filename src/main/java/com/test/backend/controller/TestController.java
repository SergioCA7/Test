package com.test.backend.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.test.backend.model.OutPutDataTest;
import com.test.backend.services.TestService;

@RestController
public class TestController {
	
	@Autowired
	TestService testService;
	
	 @RequestMapping(value = "/getIp", method = RequestMethod.GET,produces = "application/json")
	 public ResponseEntity<OutPutDataTest> getIpAdress(HttpServletRequest request) {
		 OutPutDataTest response = new OutPutDataTest();
		 ResponseEntity<OutPutDataTest> responseEntity = null; 
		 try {
			 response = testService.getIpAddressAndInstance(request.getRemoteAddr());
			 responseEntity = new ResponseEntity<>(response,HttpStatus.OK);
			 
		 }catch(Exception e) {
			 responseEntity = new ResponseEntity<>(null,HttpStatus.INTERNAL_SERVER_ERROR);
		 }
		 return responseEntity;
	 }

}
