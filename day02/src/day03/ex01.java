package day03;

import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in); //객체생성
			//문자열을 입력받는 밥법
			System.out.print("문자열입력:");
			String str =sc.nextLine(); // "\r\n" 개행문자까지 읽어서 String으로 변환
			System.out.println(str);
			
			/*//정수를 입력받는방법 1.
			int n1 = sc.nextInt();
			System.out.println(n1);*/
			
			//정수를 입력받는방법 2.
			System.out.print("정수입력2:");
				String tmp1= sc.nextLine();
				int n2 = Integer.parseInt(tmp1);
				System.out.println(n2+10);
			//실수를 입력받는방법 1.
			System.out.print("실수입력:");
			double de =sc.nextDouble();
			System.out.println(de);
			
			//실수를 입력받는방법 2.
			/*System.out.println("실수입력2:");
			double d2 = Double.parseDouble(sc.nextLine());
			System.out.println(d2);*/
			
			//문자하나 입력받는방법
			System.out.print("문자하나입력방법:");
			char ch = sc.nextLine().charAt(0);
			System.out.println(ch);
	}
}
