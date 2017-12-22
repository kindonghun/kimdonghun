package day02;

import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		
		System.out.print("이름을입력하세요:");
		
		Scanner sc = new Scanner(System.in);
		String name =sc.nextLine();
		
		System.out.println("입력된이름은:"+name+"입니다.");
	}

}
