package day04;

import java.util.Scanner;

public class q3 {
	public static void main(String[] args) {
		Scanner	sc =new Scanner(System.in);
		
		int price =5000;
		int num;
		
		System.out.println("구입할비스켓 갯수를 입력하세요:");
		int a = sc.nextInt();
		
		if (a < 10) {
			num = a * price;
			System.out.println("디스켓 가격은"+num+"입니다");
		}else if (a < 100) {
			num =  (int)((a * price) * 0.9); 
			System.out.println("디스켓 가격은10%할인된금액"+num+"입니다");
		}else if (a >= 100) {
			num = (int) ((a * price) * 0.88);
			System.out.println("디스켓 가격은 12%할인된금액"+num+"입니다");
		}
		
	}
}
