package day04;

import java.util.Scanner;

public class test1 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("계산기를시작하시겠습니까?");
		System.out.println("1. YES");
		System.out.println("2. NO");
		int a = sc.nextInt();
		
		switch (a) {
		case 1:
			System.out.println("****계산기 시작합니다****");
			System.out.print("계산기에입력할 첫번째수 입력:");
			int num1 = sc.nextInt();
			System.out.print("계산기에입력할 두번째수 입력:");
			int num2 = sc.nextInt();
			System.out.print("계산기에입력할 사칙연산 입력(+,-,*,/):");
			char num3 = sc.next().charAt(0);
		
			switch (num3) {
			case '+':
				System.out.println(num1+"+"+num2+"="+(num1+num2));break;
			case '-':
				System.out.println(num1+"-"+num2+"="+(num1+num2));break;
			case '*':
				System.out.println(num1+"*"+num2+"="+(num1+num2));break;
			case '/':
				System.out.println(num1+"/"+num2+"="+(num1+num2));break;
		
			}
			default:
				System.out.println("계산기를종료합니다.");
		}
	}
}