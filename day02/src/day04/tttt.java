package day04;

import java.util.Scanner;

public class tttt {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int basetime = 30; //기본이용시간(분)
		int baseuseprice = 3000; //기본이용요금(원)
		int addprice = 500; //추가요금(원)
		int addpermuiute = 10; //분당(분)
		int usetime = 0; //이용시간
		int useprice = 0; //전체금액
		
		System.out.println("이용시간:");
		 usetime= sc.nextInt();
		 if(usetime <= basetime) { // 이용시간 <=기본이용시간	  ex) 이용시간이 30분이넘어갈시에 else문으로 넘어감
			 useprice = baseuseprice; //전체금액 = 기본이용요금	  ex) 30분입력하면 기본이용요금 3000원이 출력됨.)
		 }else { //나머지 						//40분이상
			 int tmp=(usetime- basetime); // 새로운 tmp 변수생성	 ex)추가시간을구하기위해 tmp라는 변수생성
			 								//이용시간 - 기본이용시간 (tmp에 대입) ex) 50분 - 30분 = 20분
			 tmp =tmp / addpermuiute; // tmp / 추가요금   		ex) 20분 /500원  = 50이 tmp 에 대입
			 useprice = baseuseprice +(addprice*tmp); //전체금액 = 기본이용요금 +(500원*tmp) ex) 3000+(50원*20) = 3000+1000 = 4000원(useprice)
		 }
		 System.out.println("이용요금은:"+useprice+"원입니다");
		
	
	}
}