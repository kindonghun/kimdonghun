package day03;

import java.util.Scanner;

public class test6 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		
		System.out.println("두수를 입력받아 큰수를 출력하시오.");
		int a = sc.nextInt();
		int b = sc.nextInt();
		if(a > b) {
			System.out.println(a);
		}
		else {
			System.out.println(b);
		}
	}

}
