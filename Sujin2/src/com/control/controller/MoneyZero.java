package com.control.controller;

public class MoneyZero {
	public static void main(String[] args) {
		Money mn1=new Money(10000); //won을 1000로 바꾸는 함수의 주소:mn1
		System.out.println(mn1.getWon()); //mn1 주소에 접속해서 getWon을 실행하라 : return won=10000
		zero(mn1);
		System.out.println(mn1.getWon());
		
		
		
	}
	public static void zero(Money m) {
		m.won=0;
	}
	public void zero1() {
		
	}
}
	class Money {
		public int won; //필
		public Money(int w){
			won=w; //won=10000
		}
		public int getWon() {
			return won;
		}
		
		
	}
