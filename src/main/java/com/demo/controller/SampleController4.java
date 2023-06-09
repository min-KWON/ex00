package com.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.demo.domain.ProductVO;

@Controller
public class SampleController4 {

	private static final Logger logger = LoggerFactory.getLogger(SampleController4.class);
	
	// 파라미터에 @ModelAttribute 어노테이션 사용
	// 일반적으로는 @ModelAttribute 이름과 파라미터명을 일치하여 사용한다.
	//  @ModelAttribute 파라미터의 값을 jsp에서 참조하고자 할 경우.
	
	// http://localhost:8081/controller/doJ?name=홍길동&age=100
	@RequestMapping("doJ")
	public String doJ(@ModelAttribute("name") String name, @ModelAttribute("age") int age) {
		
		logger.info("이름은? " + name);
		logger.info("나이는? " + age);
		
		 return "testJ";	// testJ.jsp 에서 매개변수의 값을 사용하고자 할 경우.
	}
	
	// 파라미터 값을 제공해도 @ModelAttribute 를 사용 안하면, jsp에서 참조가 안된다.
	//http://localhost:8081/controller/doK?name=홍길동&age=100
	@RequestMapping("doK")
	public String doK(String name,int age) {
		
		logger.info("이름은? " + name);
		logger.info("나이는? " + age);
		
		return "testK";
	}
	
	// ProductVO 클래스 먼저 구성 할 것.
	// 일반적이 파라미터는 클라이언트에서 값이 넘어와야한다. 그러나 Model model 파라미터는 주소만 요청하면 스프링에서 자동으로 처리를 해준다.
	// Model 은 스프링에서 제공해주는 명령어임에 따라 자동으로 객체를 생성해서 진행 시킬 수 있다.
	// Model model : 메서드 안의 데이터(객체)를 뷰(jsp)에 전달하는 기능을 제공.
	@RequestMapping("doL")
	public String doL(Model model)	{
		
		// 데이터. 실제 작업 시 DB에서 읽어옴.
		// VO클래스 객체 생성 
		ProductVO product = new ProductVO("사과", 10000); // 객체 들어있는 값을 jsp에서 쓰고 싶으면 Model을 써야함.

		logger.info("상품정보는: " + product);  // product.toString()이 자동 호출 됨.
		
		// 데이터를 작업
		// ""매개변수는 마땅히 줄 네임이 없어서 객체네임을 준거임. 네임 아무렇게나 줘도 됨.
		model.addAttribute("pdt", product);		// model.addAttribute("jsp참조 이름", product);
		
		return "productInfo"; // jsp명 // 뷰(view) - 화면작업 : jsp
	}
}
