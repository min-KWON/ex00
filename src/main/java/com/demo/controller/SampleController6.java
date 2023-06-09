package com.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.demo.domain.ProductVO;

// CTRL + Shift + O : 사용하지 않는 패키지를 제거하는 단축키.
// 객체를 json으로 변환하여 클라이언트에게 보내는 예제
@Controller
public class SampleController6 {
	private static final Logger logger = LoggerFactory.getLogger(SampleController6.class);
	
	// 객체를 JSON 형식으로 변환하여, 클라이언트에게 보내는 작업.
	// 주로 Ajax기능에서 사용.
	/*
	 	1) 객체를 JSON형식으로 변환 : Jackson Databind 라이브러리
	 	2) JSON데이터를 클라이언트에게 보내는 작업 : @ResponseBody 
	 
	 */
	// http://localhost:8081/controller/doJSON
	// @ResponseBody : 리턴값(vo)을 json으로 변환시켜주는 어노테이션
	@RequestMapping("/doJSON")
	public @ResponseBody ProductVO doJSON() {
		
		ProductVO vo = new ProductVO("사과", 10000);
		
		// VO - > JSON 변환
		/*
		  {"name":"사과","price":10000.0}
		 */
		
		
		return vo;
	}
}
