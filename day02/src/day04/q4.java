package day04;

import java.util.Scanner;

public class q4 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("ù��°��������:");
		int a = sc.nextInt();
		System.out.print("�ι�°��������:");
		int b = sc.nextInt();
		System.out.print("����°��������:");
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
		System.out.println("����� �����հ��"+sum+"���̰� ����� �����"+avg+"���̰� �����"+rank+"�Դϴ�");
	}
	
}
