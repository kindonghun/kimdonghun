package day06;

import java.util.Scanner;

public class test1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
			int a;
			System.out.println("입력:");
			a = sc.nextInt();
			int re =0;
			
			System.out.println("출력:");
			do {
				re=a%10; 
				System.out.print(re);
				a /=10; 
				
			}while(a>0);//a가 0이되면 빠져나간다.
			
			System.out.println("\n");
			
		
			
			
			

		
	}
}
