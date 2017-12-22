package day03;

import java.util.Scanner;

public class test3 {
	public static void main(String[] agrs) {
		Scanner sc =new Scanner(System.in);
		System.out.print("산술연사자를 입력하세요(+,-,*,/):");
		 char b =sc.nextLine().charAt(0);
			System.out.println(( b=='+'|| b=='-'||
								 b=='*'|| b=='/')? 
								"산술연산자입니다.":"산술연산자가아닙니다.");
	}
}
