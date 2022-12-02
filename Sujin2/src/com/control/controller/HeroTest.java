package com.control.controller;

public class HeroTest {
	public static void main(String[] args) {
		Hero a=new Hero("아서스", 30);
		
		Hero b = new Hero("디아블로",30);
		a.punch(b);
		
		Hero c=new Hero();
		c.HeroName("팔라딘");
		c.HeroHp(30);
////		
		Hero d=new Hero();
		d.HeroName("소서");
		d.HeroHp(30);
////		
		c.punch(d);
	}
}
		
	class Hero{
	public String name;
	public int hp;
	
	public Hero(String Hero, int hp){ //생성자
		this.name=Hero;
		this.hp=hp;
	}
		
	public void HeroName(String Hero) { //name 메소드 
		this.name=Hero;
	}
	
	public void HeroHp(int hp) { //hp 메소드
		this.hp=hp;
	}
	
	public Hero() {
		
	}

		
	
	public void punch(Hero bad) {
		bad.hp-=10;
		System.out.printf("%s 펀치 공격!", name);
		System.out.printf("\n%s 공격을 받음, %d 체력남음!", bad.name, bad.hp);
		
	}
}
