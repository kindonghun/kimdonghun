package day04;

import java.util.Scanner;

public class q3 {
	public static void main(String[] args) {
		Scanner	sc =new Scanner(System.in);
		
		int price =5000;
		int num;
		
		System.out.println("�����Һ��� ������ �Է��ϼ���:");
		int a = sc.nextInt();
		
		if (a < 10) {
			num = a * price;
			System.out.println("���� ������"+num+"�Դϴ�");
		}else if (a < 100) {
			num =  (int)((a * price) * 0.9); 
			System.out.println("���� ������10%���εȱݾ�"+num+"�Դϴ�");
		}else if (a >= 100) {
			num = (int) ((a * price) * 0.88);
			System.out.println("���� ������ 12%���εȱݾ�"+num+"�Դϴ�");
		}
		
	}
}
