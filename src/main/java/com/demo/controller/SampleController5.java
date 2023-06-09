package com.demo.controller;

import java.lang.ProcessBuilder.Redirect;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class SampleController5 {
	private static final Logger logger = LoggerFactory.getLogger(SampleController5.class);
	
	//리다이렉트(Redirect)
	// http://localhost:8081/controller/doM
	// RedirectAttributes : 스프링 자체 명령어 임에 따라 자동으로 객체 생성.
	@RequestMapping("doM")
	public String doM(RedirectAttributes rttr) {
		
		// 데이터베이스 작업(insert, update, delete 등)
		
		// http://localhost:8081/controller/doN?idx=10&title=spring+study
		rttr.addAttribute("idx", 10);
		rttr.addAttribute("title", "spring study");			// 앞에는 매개변수를 입력해줘야 한다.
		
		// return "redirect:/doN?idx=10";  // return "redirect:/매핑주소"; , jsp파일명이 필요가 없다.
		return "redirect:/doN";
	}
	
	@RequestMapping("doN")
	public void doN(String title, int idx) {
		logger.info("리다이렉트 요청으로 진행 됨.");
		logger.info("글제목: " + title);
		logger.info("글 번호: " + idx);
	}
	
	/*----------------------------------------------------------------------------------------------------------------------*/
	
	
	@RequestMapping("doO")
	public String doO(RedirectAttributes rttr) {
		
		// 리다이렉트되는 주소의 jsp에서 자바스크립트 구문에서 이용
		// addFlashAttribute는 1회성이다
		rttr.addFlashAttribute("msg", "ok");	// msg라는 이름으로 ok라는 값을 jsp에서 사용 가능. 리다이렉트 되는 주소의 jsp에서 참조하게 됨. 
		
		return "redirect:/doP";		// jsp가 필요없다.
	}
	
	@RequestMapping("doP")
	public void doP() {
		logger.info("리다이렉트 요청으로 진행 됨.");
		
		//doP.jsp에서 데이터를 참조. msg키를 이용하여 "ok" 문자열 데이터를 사용이 가능해짐.
	}
}
