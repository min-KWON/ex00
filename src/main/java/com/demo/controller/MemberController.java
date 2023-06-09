package com.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.demo.domain.MemberVO;

@Controller
public class MemberController {
	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);
	
	// 로그인 페이지
	@RequestMapping("login")	// void이면 매핑 매개변수값이 jsp명이다.
	public void loginPage() {
		
		logger.info("로그인 페이지");
	}
	
	/*
	// 개별 파리미터 사용
	// 로그인 처리
	@RequestMapping("loginOK")
	public void loginOk(String userid, String passwd) {
		
		logger.info("아이디는? " + userid);
		logger.info("비밀번호는? " + passwd);
	}
	*/
	
	// 파라미터 VO클래스 사용
	@RequestMapping("loginOK")
	public void loginOk(MemberVO vo) {
		
		logger.info("로그인 정보? " + vo); // vo.toString()
	}
}
