package com.control.controller;

public class MoneyZero2 {
	public static void main(String[] args) {
		Money2 mn=new Money2(100000);  //객체
		mn.pWon();
		System.out.println(mn.ppWon());
		cl(mn); // cl은 static 을 사용했기때문에 새로운 객체생성x
//		mn.cl(mn);
		mn.pWon();
		MoneyZero2 mz=new MoneyZero2();
		mz.cl2(mn); //cl2는 static 을 사용안했기 때문에 위에 새로운 객체를 생성하고 실행해야된다
		
	}
	public static void cl(Money2 zero2) { //static 사용 이유?
		zero2.won=0;
	}
	public void cl2(Money2 zero2) { //static 사용 이유?
		zero2.won=0;
	}
} 
	class Money2 { //public 왜 안됨?
		public int won; //public 선언안하면 default 로 인
		public Money2(int won) {
			this.won=won;
		}
		public void pWon() {
			System.out.println(won);
		}
		public int ppWon() {
			return won;
		}
		
//		public void cl(Money2 zero2) {
//			zero2.won=0;
//		}
		
	}