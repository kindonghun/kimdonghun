package day03;

import java.util.Scanner;

public class test8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Scanner sc = new Scanner(System.in);
			
			System.out.println("첫번째숫자:");
			int a = sc.nextInt();
			System.out.println("두번째숫자:");
			int b = sc.nextInt();
			
			int big=0;
			if(a>=b)big=a;
			else big=b;
			System.out.println("큰수는:"+big);
			if(big%2==0) {
				System.out.println(big+"은짝수");
			}
			else
				System.out.println(big+"은홀수");
				
	}

}
