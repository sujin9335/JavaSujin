package com.control.controller;

public class TestController {

	//필드
	public String model;
	public int modelYear;
	public String color;
	public int maxSpeed;
	public int currentSpeed;
	
	//매개변수 생성자
	public TestController(String model1, int modelYear1, String color1, int maxSpeed1) {
		this.model=model1;
		modelYear=modelYear1;
		color=color1;
		maxSpeed=maxSpeed1;
		
	}
	public String getModel() {//메소드
		return "모델 : "+this.model+" 년식 : "+this.modelYear+" 컬러 : "+color+" 최고속 : "+maxSpeed;
//		System.out.println(number+1);
	
	}
	
}
