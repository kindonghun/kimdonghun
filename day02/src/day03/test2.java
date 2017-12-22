package day03;

import java.util.Scanner;

public class test2 {
	public static void main(String[] ages) {
		Scanner sc =new Scanner(System.in);
		System.out.println("합격여부를 입력하세요:(1. 합격  2.불합격)");
		int a = sc.nextInt();
		
		System.out.println((a==1? "합격입니다":"불합격입니다"));
	
		
	}


}
