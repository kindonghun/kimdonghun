package day03;

import java.util.Scanner;

public class q2 {

	public static void main(String[] ages) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을입력하세요:");
		String name2 =sc.nextLine();
		System.out.print("국어점수를입력하세요:");
		int kor =sc.nextInt();
		System.out.print("수학점수를입력하세요:");
		int mat =sc.nextInt();
		System.out.print("영어점수를입력하세요:");
		int eng =sc.nextInt();
		
		System.out.println("3과목 합계는:"+(kor+mat+eng));
		System.out.println("3과목 평균은:"+(kor+mat+eng)/3.0f);
	}
}
