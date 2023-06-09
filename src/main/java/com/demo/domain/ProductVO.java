package com.demo.domain;

// 시나리오 : 상품테이블의 구조를 내용으로 한 클래스. VO클래스(Value Object).
public class ProductVO {

	private String name;
	private double price;
	
	// 일반 개발할때 잘 사용하지 않음. 빼도 됨.
	public ProductVO(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	// getter setter는 public으로 해야함.
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	// 필드값을 재정의되는 것을 출력하는 toString() 
	// 자기 자신의 정보를 조회하는 목적이다.
	@Override
	public String toString() {
		return "ProductVO [name=" + name + ", price=" + price + "]";
	}
	
	
}
