package day03;

import java.util.Scanner;

public class test7 {
	public static void main(String[] agrs) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째숫자:");
		int a =sc.nextInt();
		System.out.print("두번째숫자:");
		int b =sc.nextInt();
		System.out.print("세번째숫자:");
		int c =sc.nextInt();
		if(b >= a && b >= c) {
			int tmp =a;
			a = b;
			b= tmp;
		}
		else if(c >=a && c>=b) {
			int tmp =a;
			a= c;
			c= tmp;
		}
		if(c >= b) {
			int tmp =b;
			b= c;
			c= tmp;
		}
		
		System.out.println(a+">="+b+">="+c);
	}
		
}
