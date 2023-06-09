package com.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.demo.domain.ProductVO;

@Controller
public class ProductController {
	private static final Logger logger = LoggerFactory.getLogger(ProductController.class);
	
	@RequestMapping("productForm")
	public void productForm() {
		
		logger.info("상품등록페이지");
	}
	
	// 데이터 입력 시 메서드의 파라미터를 클래스로 사용 할 경우에는 클래스 안에 들어있는 필드명(원래는 setter임)을 jsp에 들어가야한다.
	@RequestMapping("productInsert")
	public void productInsert(ProductVO vo) {
		
		logger.info("상품등록완료 " + vo);
	}
}
