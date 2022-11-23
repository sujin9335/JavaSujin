package com.control.run;

import com.control.controller.TestController;

public class MainTest {
	public static void main(String[] args) {
		TestController car=new TestController("말리", 5, "검정", 280);
		
		System.out.println(car.getModel());
		
		
		
	}
}
