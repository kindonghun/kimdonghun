package day07;

import java.util.Scanner;

public class test2 {
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
		String[] name =new String[5];
		int[] age = new int[5];
		
		for(int i= 0; i<5; i++) {
			System.out.println(i+1+"��° �����Է�");
			System.out.print("�̸�:");
			name[i] = sc.next();
			System.out.print("����:");
			age[i]  = sc.nextInt();
		}System.out.println();
		for(int i =0; i<5; i++) {
			System.out.println(i+1+"����");
			System.out.println("�̸�"+name[i]+ "����:"+age[i]);
		}
		
	}
}
