package com.control.controller;
import java.util.Scanner;
public class Controller {
	public void calcGrade() {
		//수학,영어, 국어, 코딩 점수를 입력받고 
		//합계와 평균을 출력하는 기능 구현하기 * 전체값을 저장하는 변수는 한개만 선언
		//* 복합대입연산자를 이용해보세요!
		Scanner sc=new Scanner(System.in);
		
		int total=0;
		System.out.print("수학 점수 : ");
		int a=sc.nextInt();
		total+=a;
		System.out.print("영어 점수 : ");
		a=sc.nextInt();
		total+=a;
		System.out.print("국어 점수 : ");
		a=sc.nextInt();
		total+=a;
		System.out.print("코딩 점수 : ");
		a=sc.nextInt();
		total+=a;
		
		System.out.println("합계: "+total+" 평균: "+(double)total/4);
		
	}
	public void inputMsgPrint() {
		//사용자에게 문자열을 4개 입력받고 입력받은 문자열을 한번에 모두 출력하기
		Scanner sc=new Scanner(System.in);
		
		String a, all;
		all=" ";
		System.out.print("입력 : ");
		a=sc.nextLine();
		all+=a;
		System.out.print("입력 : ");
		a=sc.nextLine();
		all+=a;
		System.out.print("입력 : ");
		a=sc.nextLine();
		all+=a;
		System.out.print("입력 : ");
		a=sc.nextLine();
		all+=a;
		
		System.out.println(all);
	
	}
	public void calcInputNum() {
		//사용자에게 숫자를 입력받아 합계를 구하는 기능 구현하기
		Scanner sc=new Scanner(System.in);
		
		int num, input;
		num=0;
		System.out.print("입력 숫자: ");
		input=sc.nextInt();
		num+=input;
		System.out.print("입력 숫자: ");
		input=sc.nextInt();
		num+=input;
		System.out.print("입력 숫자: ");
		input=sc.nextInt();
		num+=input;
		System.out.print("입력 숫자: ");
		input=sc.nextInt();
		num+=input;
		
		System.out.println("합계"+num);
	}
	public void checkNumber() {
		//입력받은 값이 5배수인지 확인하는 기능구현하기
		//입력값이 5의 배수인경우 5의배수입니다 출력
		Scanner sc=new Scanner(System.in);
		
		int num;
		System.out.print("입력 : ");
		num=sc.nextInt();
		if(num%5==0) {
			System.out.println("5의 배수입니다");
		}
		
		
	}
	public void amdinCheck() {
		//아이디와 패스워드를 입력받아 아이디가 admin이고 패스워드가 9876이면
		//이름, 나이, 성별, 전화번호를 입력받아 한번에 출력하는 기능
		Scanner sc=new Scanner(System.in);
		
		String id, pass, name, num;
		int age ;
		char gender;
		System.out.print("아이디: ");
		id=sc.next();
		System.out.print("비번: ");
		pass=sc.next();
		
		if(id.equals("admin")&&pass.equals("9876")) {
			System.out.print("이름 : ");
			name=sc.next();
			System.out.print("나이 : ");
			age=sc.nextInt();
			System.out.print("성별 : ");
			gender=sc.next().charAt(0);
			sc.nextLine();
			System.out.print("전화번호 : ");
			num=sc.nextLine();
			
			System.out.printf("%s %d %c %s", name,age,gender,num);
		}else {
			System.out.println("로그인 실패");
		}
		
		
	}
	public void checkAgeEnroll() {
		//미성년자만 회원가입할 수 있는 기능만들기
		//미성년이면 아이디, 패스워드, 이름,별명, 나이, 키를 입력받고 한번에 출력
		//미성년아니면 "성인은 가입할 수 없습니다" 출력하기
		Scanner sc=new Scanner(System.in);
		
		System.out.print("나이 : ");
		int age=sc.nextInt();
		
		if(age>19) {
			System.out.print("아이디: ");
			String id=sc.next();
			System.out.print("비번: ");
			String pass=sc.next();
			System.out.print("이름: ");
			String name=sc.next();
			System.out.print("별명: ");
			String a=sc.next();
			System.out.print("키: ");
			double high=sc.nextDouble();
			System.out.printf("%s %s %s %s %d %.1f", id,pass,name,a,age,high);
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
		System.out.print("나이 : ");
		int age=sc.nextInt();
		
		if(age>=10&&age<20) {
			System.out.println("열심히 공부하세요! 좋은대학가야지요!");
		}else if(age>=20&&age<30) {
			System.out.println("열심히 준비하세요~ 취직해야지요!");
		}else if(age>=30&&age<40) {
			System.out.println("열심히 일하세요~ 돈모아야지요!");
		}else if(age>=40&&age<50) {
			System.out.println("열심히 돈버세요~ 자식키워야죠!");
		}else if(age>=50&&age<60) {
			System.out.println("열심히 운동하세요~ 건강해야지요!");
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

		System.out.println("======메뉴=====");
		System.out.println("1. 떡볶이 3000원");
		System.out.println("2. 튀김 2500원");
		System.out.println("3. 순대 4000원");
		System.out.println("4. 참치김밥 4500원");
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("메뉴 선택: ");
		int menu=sc.nextInt();
		switch(menu) {
		case 1 : System.out.print("떡볶이를 선택하셨습니다 3000원 입니다");
		System.out.print("몇개 주문하시겠습니까 : ");
		int su=sc.nextInt();
		int total=su*3000;
		System.out.printf("떡볶이 %d개 %d원 입니다", su,total); break;
		case 2 : System.out.print("튀김를 선택하셨습니다 2500원 입니다");
		System.out.print("몇개 주문하시겠습니까 : ");
		su=sc.nextInt();
		total=su*2500;
		System.out.printf("튀김 %d개 %d원 입니다", su,total); break;
		case 3 : System.out.print("순대를 선택하셨습니다 4000원 입니다");
		System.out.print("몇개 주문하시겠습니까 : ");
		su=sc.nextInt();
		total=su*4000;
		System.out.printf("순대 %d개 %d원 입니다", su,total); break;
		case 4 : System.out.print("참치김밥를 선택하셨습니다 4500원 입니다");
		System.out.print("몇개 주문하시겠습니까 : ");
		su=sc.nextInt();
		total=su*4500;
		System.out.printf("참치김밥 %d개 %d원 입니다", su,total); break;
		default : System.out.println("1~4 골라주세요");
		}
		
	}
	public void ex_test() {
		//성인만 가입할 수 있는 회원가입 -> 미성년이면 회원가입불가합니다 출력
		//성인이면 내국인인지 외국인인지 확인하고
		//내국인이면 회원가입으로 내용을 출력 이름, 주소를 변수에 저장후 출력
		//외국인이면 외국인등록번호여부를 확인(있다, 없다 선택)
		//있으면 회원가입 내용을 출력 이름, 주소 저장후 출력
		//없으면 회원가입이 불가능합니다 출력
		//외국인 등록번호여부를 잘못누른경우 잘못누르셨습니다 출력 후 프로그램 종료	
		Scanner sc=new Scanner(System.in);
		
		
		String nation, nameAddr, name, addr;
		nameAddr="";
		System.out.print("성인입니까? (네/아니요): ");
		String age1=sc.next();
		if(age1.equals("네")) {
			System.out.print("내국인/외국인");
			nation=sc.next();
			switch(nation) {
				case "내국인" : 
					sc.nextLine();
					System.out.print("이름 : ");
					name=sc.nextLine();
					nameAddr+=name;
					System.out.print("주소 : ");
					addr=sc.nextLine();
					System.out.println();
					nameAddr+=addr;
					System.out.println(nameAddr);
					break;
				case "외국인" :
					System.out.println("외국인 등록번호 있습니까? (있다/없다)");
					String fnum=sc.next();
					if(fnum.equals("있다")){
						sc.nextLine();
						System.out.print("이름 : ");
						name=sc.nextLine();				
						System.out.print("주소 : ");
						addr=sc.nextLine();
						System.out.println();						
						System.out.println(name+" "+addr);
					}else if(fnum.equals("없다")) {
						System.out.println("회원가입이 불가능합니다");
					}else {
						System.out.println("잘못 누르셨습니다");
					}
			}
				
		}else if(age1.equals("아니요")) {
			System.out.println("회원가입불가합니다");
		}else {
			System.out.println("(네/아니요)로 입력해주세요");
		}
	
	}
	public void checkStrLower() {
		//1. 입력받은 문자에 소문자가 있는지 확인해주는 기능 구현하기
		//추가 소문자가 뭐가 있는지 확인하고 소문자 갯수가 2개 이상일경우 1개만 출력 ex(소문자가 s가 3개 있습니다)
		Scanner sc=new Scanner(System.in);
		
		String smallMsg="";
		int count=0;
		System.out.print("입력 : ");
		String msg=sc.nextLine();
		
		for(int i=0; i<msg.length(); i++) {
			char msgch=msg.charAt(i);
			if(msgch>='a'&&msgch<='z') {
				smallMsg+=msgch;
				count++;
			}
		}
		System.out.println(count>0 ? "소문자가 "+count+"개 있습니다"+smallMsg : "소문자가 없습니다");
		
		
	}
	public void checkStrNumber() {
		//입력받은 문자에 숫자가 있는지 확인하고 있는 수를 출력해주는 기능 구현하기
		Scanner sc=new Scanner(System.in);
		
		String smallMsg="";
		int count=0;
		System.out.print("입력 : ");
		String msg=sc.nextLine();
		
		for(int i=0; i<msg.length(); i++) {
			char msgch=msg.charAt(i);
			if(msgch>='0'&&msgch<='9') {
				smallMsg+=msgch;
				count++;
			}
		}
		System.out.println(count>0 ? "숫자가 "+count+"개 있습니다"+smallMsg : "숫자가 없습니다");
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
}