package day04;

import java.util.Scanner;

public class test2 {
	public static void main(String[] args) {
			
		//가위바위보 게임만들어보기
		Scanner sc = new Scanner(System.in);
		
		System.out.println("가위바위보를시작하시겠습니까?");
		System.out.println("1. YES ");
		System.out.println("2. NO ");
		int a = sc.nextInt();
		
		switch(a) {
		case 1:
		System.out.println("가위바위보 선택을시작합니다 ");
		String n = sc.next();
		
		switch(n) {
		case "가위":
		System.out.print("가위를 내셧습니다.");
		String b = sc.next();
	  
		case "바위":
		System.out.print("바위를 내셧습니다."); 
		String c = sc.next();
		
		case "보":
		System.out.print("보를 내셧습니다.");
		String d = sc.next();
		
	
		default:
			System.out.println("가위바위보를 종료합니다.");
			
		}
	}
	}
	
}
