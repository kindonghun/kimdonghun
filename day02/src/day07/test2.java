package day07;

import java.util.Scanner;

public class test2 {
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
		String[] name =new String[5];
		int[] age = new int[5];
		
		for(int i= 0; i<5; i++) {
			System.out.println(i+1+"번째 정보입력");
			System.out.print("이름:");
			name[i] = sc.next();
			System.out.print("나이:");
			age[i]  = sc.nextInt();
		}System.out.println();
		for(int i =0; i<5; i++) {
			System.out.println(i+1+"정보");
			System.out.println("이름"+name[i]+ "나이:"+age[i]);
		}
		
	}
}
