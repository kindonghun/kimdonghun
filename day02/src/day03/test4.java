package day03;

import java.util.Scanner;

public class test4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("입력한데이터가 3의 배수인경우를 출력하시오");
		int a = sc.nextInt();
		if (a % 3 == 0) {
			System.out.println("입력하신데이터는 3의배수가맞습니다");
		} else {
			System.out.println("입력한데이터는 3의배수가 아닙니다.");
		}
	}
}
