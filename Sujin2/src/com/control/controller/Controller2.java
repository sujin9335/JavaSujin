package com.control.controller;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;
public class Controller2 {
	public void calcGrade() {
		//수학,영어, 국어, 코딩 점수를 입력받고 
		//합계와 평균을 출력하는 기능 구현하기 * 전체값을 저장하는 변수는 한개만 선언
		//* 복합대입연산자를 이용해보세요!
		Scanner sc=new Scanner(System.in);
		
		int total=0;
		System.out.print("수학점수 : ");
		int math=sc.nextInt();
		total+=math;
		System.out.print("국어점수 : ");
		int gug=sc.nextInt();
		total+=gug;
		System.out.print("코딩점수 : ");
		int coding=sc.nextInt();
		total+=coding;
		
		System.out.printf("합계 : %d 평균 %.1f", total,(double)total/3);
		
		
		
		
	}
	public void inputMsgPrint() {
		//사용자에게 문자열을 4개 입력받고 입력받은 문자열을 한번에 모두 출력하기
		Scanner sc=new Scanner(System.in);
		
		String total="";
		for(int i=0; i<4; i++) {
			System.out.print("문자: ");
			String input=sc.nextLine();
			total+=input;
		}
		System.out.println(total);
	
	}
	public void calcInputNum() {
		//사용자에게 숫자를 입력받아 합계를 구하는 기능 구현하기
		Scanner sc=new Scanner(System.in);
		
		int total=0;
		while(true) {
		System.out.print("숫자: ");
		int input=sc.nextInt();
		total+=input;
		System.out.println("합계 : "+total);
		}
		
		
		
	}
	public void checkNumber() {
		//입력받은 값이 5배수인지 확인하는 기능구현하기
		//입력값이 5의 배수인경우 5의배수입니다 출력
		Scanner sc=new Scanner(System.in);
		
		System.out.print("입력: ");
		int input=sc.nextInt();
		
		if(input%5==0) {
			System.out.println(input+"은 5의 배수입니다");
		}
		
		
		
		
		
		
		
	}
	public void amdinCheck() {
		//아이디와 패스워드를 입력받아 아이디가 admin이고 패스워드가 9876이면
		//이름, 나이, 성별, 전화번호를 입력받아 한번에 출력하는 기능
		Scanner sc=new Scanner(System.in);
		
		System.out.print("아이디: ");
		String id=sc.next();
		System.out.print("비밀번호: ");
		String pass=sc.next();
		
		if(id.equals("admin")) {
			if(pass.equals("9876")) {
				System.out.print("이름 : ");
				String name=sc.next();
				System.out.print("나이 : ");
				int age=sc.nextInt();
				System.out.print("성별 : ");
				char gender=sc.next().charAt(0);
				System.out.print("전화번호 : ");
				int num=sc.nextInt();
				
				System.out.printf("%s, %d, %c, %d", name,age,gender,num);
			}else {
				System.out.println("비밀번호 틀림");
			}
		}else {
			System.out.println("아이디 틀림");
		}
		
				
		
		
		
		
		
	}
	public void checkAgeEnroll() {
		//미성년자만 회원가입할 수 있는 기능만들기
		//미성년이면 아이디, 패스워드, 이름,별명, 나이, 키를 입력받고 한번에 출력
		//미성년아니면 "성인은 가입할 수 없습니다" 출력하기
		Scanner sc=new Scanner(System.in);

		System.out.print("나이 : ");
		int age=sc.nextInt();
		
		String add="";
		if(age<20) {
			System.out.print("아이디: ");
			String id=sc.next();
			add+=id;
			System.out.print("비밀번호: ");
			String pass=sc.next();
			add+=pass;
			System.out.print("이름: ");
			String name=sc.next();
			add+=name;
			add+=age;
			System.out.print("별명: ");
			String nName=sc.next();
			add+=nName;
			System.out.print("키: ");
			double high=sc.nextDouble();
			add+=high;
			System.out.println(add);
			
		}else {
			System.out.println("성인은 가입불가");
		}
		
		
		
		
		
		
		
		
		
		
	}
	public void printMessage() {
		//연령대별 메세지출력하기 -> 연령을 입력받아서 처리
		//10대 : 열심히 공부하세요! 좋은대학가야지요!
		//20대 : 열심히 준비하세요~ 취직해야지요!
		//30대 : 열심히 일하세요~ 돈모아야지요!
		//40대 : 열심히 돈버세요~ 자식키워야죠!
		//50대 : 열심히 운동하세요~ 건강해야지요!
		Scanner sc=new Scanner(System.in);
		
		System.out.print("나이: ");
		int age=sc.nextInt();
		
		if(age>=10&&age<20) {
			System.out.println("10대 : 열심히 공부하세요! 좋은대학가야지요!");
		}else if(age>=20&&age<30) {
			System.out.println("20대 : 열심히 준비하세요~ 취직해야지요!");

		}
		
		
		
		
		
		
	}
	public void caseTest() {
		//분식집 주문기능을 만들어보기
		//1. 떡볶이        3000원
		//2. 튀김         2500원
		//3. 순대         4000원
		//4. 참치김밥      4500원
		//1) 메뉴를 선택하면 메뉴와 가격을 출력해주기
		// 예) 1선택시 떡볶이를 선택하셨습니다. 3000원 입니다.
		//2) 메뉴 선택 후 수량을 입력받아
		// 예) 1 선택시 떡볶이를 선택하셨습니다. 몇개 주문하시겠습니까?
//		    3개 -> 떡볶이 3개 9000원입니다. 출력
		Scanner sc=new Scanner(System.in);

		
		System.out.println("=====메뉴=====");
		System.out.println("1. 떡볶이 3천원");
		System.out.println("2. 튀김 2천5백원");
		System.out.println("3. 순대 4천원");
		
		System.out.println("메뉴 선택: ");
		int menu=sc.nextInt();
		String chMenu=" ";
		int price=0;
		
		switch(menu) {
			case 1 : 
				chMenu="떡볶이";
				price=3000;
				break;
				
				
				
		}
		System.out.printf("%s 선택하셨습니다 가격은 %d 입니다", chMenu,price);
		System.out.print("\n몇개 주문하시겠습니까 : ");
		int chNum=sc.nextInt();
		int chPrice=chNum*price;
		System.out.printf("떡볶이 %d개 %d원 입니다", chNum,chPrice);
		
		
		
		
		
	}
	public void ex_test() {
		//성인만 가입할 수 있는 회원가입 -> 미성년이면 회원가입불가합니다 출력
		//성인이면 내국인인지 외국인인지 확인하고
		//내국인이면 회원가입으로 내용을 출력 이름, 주소를 변수에 저장후 출력
		//외국인이면 외국인등록번호여부를 확인(있다, 없다 선택)
		//있으면 회원가입 내용을 출력 이름, 주소 저장후 출력
		//없으면 회원가입이 불가능합니다 출력
		//외국인 등록번호여부를 잘못누른경우 잘못누르셨습니다 출력 후 프로그램 종료	
		
	
	}
	public void checkStrLower() {
		//1. 입력받은 문자에 소문자가 있는지 확인해주는 기능 구현하기
		//추가 소문자가 뭐가 있는지 확인하고 소문자 갯수가 2개 이상일경우 1개만 출력 ex(소문자가 s가 3개 있습니다)
		Scanner sc=new Scanner(System.in);

		System.out.print("입력 :");
		String input=sc.nextLine();
		
		int total=0;
		char chi, chj;
		char add=0;
		for(int i=0; i<input.length(); i++) {
			chi=input.charAt(i);
			if(chi>='a'&&chi<='z') {
//				System.out.println(chi);
				add+=chi;
				break;
			}else {
				System.out.println("소문자가 없습니다");
				break;
			}
		}
	
		
		
		for(int j=0; j<input.length(); j++) {
			chj=input.charAt(j);
			if(chj==add) {
				total++;
			}
		}
		System.out.println(total>1 ? add+"의 갯수: "+total : "소문자"+add);
		

		
		
		
	}
	public void checkStrNumber() {
		//입력받은 문자에 숫자가 있는지 확인하고 있는 수를 출력해주는 기능 구현하기
		Scanner sc=new Scanner(System.in);
		
		System.out.print("입력 : ");
		String input=sc.nextLine();
		
		
		String chto=" ";
		int count=0;
		for(int i=0; i<input.length(); i++) {
			char chi=input.charAt(i);
			if(chi>='0'&&chi<='9') {
				chto+=chi;
				count++;
				System.out.println(chi);
			}
		}
		System.out.println("갯수 : "+count+" 숫자 :"+chto);
		
		
		
	}
	public void startprint(){
		//*****
		//****
		//***
		//**
		//*
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<(5-i); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		
		
	}
	public void RpsGame() {
//		1. 가위바위보게임
//		 설명 
//		 - 사용자에게 가위, 바위, 보 중 한개를 입력하도록하고(입력방식은 숫자)
//		 - 컴퓨터가 랜덤값으로 세개중 하나의 데이터를 대입
//		 - 컴퓨터의 값과 사용자의 값을 비교하여 다음의 결과출력
//		   같으면 비겼습니다. 출력 후 다시 사용자와 컴퓨터가 선택할 수 있도록 로직구성
//		   컴퓨터가 사용자에게 이기면 컴퓨터가 이겼습니다. 출력
//		   사용자가 컴퓨터에게 이기면 사용자가 있겼습니다. 출력   
//
//		-  승자가 나왔으면 다시 하겠습니다 출력 
//		    다시하면 위에 로직 다시 실행
//		    종료하면 프로그램 종료
//		- 추가 : 만일 위내용을 쉽게 처리 했으면 프로그램 종료시 지금까지 전적을 출력
//		       컴퓨터 승 00번, 사용자 승 00번
		Scanner sc=new Scanner(System.in);

		char yn='y';
		while(yn=='y') {
		System.out.print("가위 바위 보 (1/2/3) : ");
		int rsp=sc.nextInt();
		int random=((int)(Math.random()*3)+1);
		
		
		switch(rsp) {
		case 1 :
			if(random==1) {
				System.out.print("비겼습니다 다시하겠습니까? (y,n)");
				yn=sc.next().charAt(0);
				}
			if(random==2) {
				System.out.print("사용자가 이겼습니다 다시하겠습니까? (y,n)");
				yn=sc.next().charAt(0);
				}
			if(random==3) {
				System.out.print("컴퓨터가 이겼습니다 다시하겠습니까? (y,n)");
				yn=sc.next().charAt(0);
				}
			break;
		
			
		default : System.out.println("1,2,3 중에 입력 바랍니다");
			yn='y';
			}
			
		
		if(yn!='y'&&yn!='n') {
			System.out.print("y,n 입력바랍니다 : ");
			yn=sc.next().charAt(0);
		
		}
		
		}
		
		
		
				
		
		
			
	}
	public void bbGame() {
//		야구게임
//		- 랜덤으로 세개의 수를 각 자리 수에 저장 * 정답값
//		- 사용자가 임의의 수 3개를 입력받음
//		- 정답값이랑 비교하여 
//		   사용자가 입력한 숫자가 정답과 자리수와 숫자가 일치하면 -> 스트라이크,
//		   사용자가 입력한 숫자가 정답과 일치하고 자리수가 맞지 않으면 -> 볼,
//		   사용자가 입력한 숫자가 일치한게 하나도 없으면 -> 파울으로 처리
//
//		- 정답을 맞출때까지 입력이 반복되야함.
//
//		예 ) ==== 야구게임시작 ==== 
//		     답 : 345
//		     입력 : 311 -> 1 스트라이크
//		     입력 : 354 -> 1스트라이크 2볼
//		     입력 : 344 -> 2스트라이크
//		     입력 : 534 -> 3볼
//		     입력 : 890 -> 파울
//		     입력 : 345 -> 3스크라이크 정답
//		     게임한판 더?  
//		- 정답을 맞추면 게임을 더 할지 확인후 계속진행은 위 로직 반복
//		  그만하면 프로그램종료
		Scanner sc=new Scanner(System.in);

		
		int strike=0;
		int ball=0;
		
		int random=551;
//		int random= ((int)(Math.random()*1000));
		System.out.println(random);//랜덤확인용
		String input = " ";
		System.out.print("입력: ");
		int a3=sc.nextInt();		
		input+=a3;
		System.out.print("입력: ");
		int a2=sc.nextInt();		
		input+=a2;
		System.out.print("입력: ");
		int a1=sc.nextInt();		
		input+=a1;
		
		System.out.println(input);
		
		int r3=random%1000/100;
		int r2=random%100/10;
		int r1=random%10;
		
		if(a3==r3) {
			strike++;
		}
		if(a2==r2) {
			strike++;
		}
		if(a2==r2) {
			strike++;
		}
		
		if(a3!=r3&&(a3==r1||a3==r2)) {
			ball++;
		}
		if(a2!=r2&&(a2==r1||a2==r3)) {
			ball++;
		}
		if(a1!=r1&&(a1==r2||a1==r3)) {
			ball++;
		}
		
		
		System.out.println("스트라이크 : "+strike+" 볼 : "+ball);
		
		
	}
	public void array() {
		//저장된 학생 중 박씨성을 가진 학생 조회하기
		String[] names3= {"이동명","윤주","김태훈","오윤재","최이경","김수진","박세현","박보검","박상민"};
		
		String total=" ";
		int count=0;
		for(int i=0; i<names3.length; i++) {
			char a=names3[i].charAt(0);
			if(a=='박') {
				total+=names3[i];
				count++;
			}
		}
		System.out.println(count+total);	
				
		//대문자와 소문자의 갯수를 구하시오
				
		int count1=0;	
		int count2=0;	
		char[] alpha2= {'a','b','D','E','T','s','y','U','h'};
		
		for(int i=0; i<alpha2.length; i++) {
			if(alpha2[i]>='a'&&alpha2[i]<='z') {
				count1++;
			}
			if(alpha2[i]>='A'&&alpha2[i]<='Z') {
				count2++;
			}
			
		}
		System.out.println(count1+" "+count2);
	
		
		int[] test= {1,2,3,4,5};
		
		int[] test1=new int[10];
		int[] test2;
		test2=new int[] {1,2,4,5,6};
		
		
		
		
	}
}