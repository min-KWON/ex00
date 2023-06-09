package com.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SampleController2 {
	private static final Logger logger = LoggerFactory.getLogger(SampleController2.class);
	
	// http://localhost:8081/controller/doD.			jsp: testD.jsp
	// 리턴값이 jsp파일명으로 처리된다
	// 매핑 이름과 jsp파일명이 다른 경우 메서드의 리턴타입을 string로 해야한다.
	@RequestMapping("doD")
	public String doD() {
		logger.info("doD called...");
		return "testD";
	}
	
	// http://localhost:8081/controller/doE.			jsp: testE.jsp
	@RequestMapping("doE")
	public String doE()	 {
		return "testE";
	}
	
	// http://localhost:8081/controller/doF.			jsp: testF.jsp
	@RequestMapping("doF")
	public String doF() {
		return "testF";
	}
}
