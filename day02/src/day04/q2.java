package day04;

import java.util.Scanner;

public class q2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("구입할 도시락갯수를 입력해주세요.:");
		int a = sc.nextInt();
		
		if(a <= 10) {
			System.out.println("결제하실금액은:"+a*2500+"원입니다");
		}
		else {
			System.out.println("결제하실금액은은:"+a*2400+"원입니다");
		}
		
		
	}
}
