package day04;

import java.util.Scanner;

public class q4 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("첫번째과목점수:");
		int a = sc.nextInt();
		System.out.print("두번째과목점수:");
		int b = sc.nextInt();
		System.out.print("세번째과목점수:");
		int c = sc.nextInt();
		
		int sum =(a+b+c);
		double avg =(double)sum/3.f;
		char rank;
		
		if(avg >= 90)
		 rank = 'A';
		else if(avg >= 80)
			rank = 'B';
		else if(avg >= 70)
			rank = 'C';
		else if(avg >= 60)
			rank = 'D';
		else
			rank = 'F';
		System.out.println("당신의 과목합계는"+sum+"점이고 당신의 평균은"+avg+"점이고 등급은"+rank+"입니다");
	}
	
}
