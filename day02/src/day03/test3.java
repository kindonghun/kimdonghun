package day03;

import java.util.Scanner;

public class test3 {
	public static void main(String[] agrs) {
		Scanner sc =new Scanner(System.in);
		System.out.print("��������ڸ� �Է��ϼ���(+,-,*,/):");
		 char b =sc.nextLine().charAt(0);
			System.out.println(( b=='+'|| b=='-'||
								 b=='*'|| b=='/')? 
								"����������Դϴ�.":"��������ڰ��ƴմϴ�.");
	}
}
