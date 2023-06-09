package com.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SampleController {
	
	// SampleController클래스 동작시 기록을 담당할 로그객체 생성구문.
	private static final Logger logger = LoggerFactory.getLogger(SampleController.class);
	
	// 매핑 이름과 jsp 파일명이 동일한 경우 메서드 리턴타입을 void로 해야한다.
	// 매핑 이름과 메서드명은 상관이 없다.
	
	// http://localhost:8081/controller/doA.  INFO : com.demo.controller.SampleController - doA called... 결과보면 doA 메서드를 호출
	@RequestMapping("doA") // 매핑 주소. 클라이언트에서 스프링의 메서드를 호출하는 목적으로 사용.
	public void doA() {
		logger.info("doA called...");
	}
	
	// /WEB-INF/views/ + doA + .jsp = /WEB-INF/views/doA.jsp
	
	// http://localhost:8081/controller/doB
	@RequestMapping("doB")
	public void doB() {
		logger.info("doB called...");
	}
	
	// http://localhost:8081/controller/doC
	@RequestMapping("doC")
	public void doC() {
		logger.info("doC called...");
	}
}
