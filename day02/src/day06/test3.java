package day06;

import java.util.Scanner;

public class test3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i=1,j=1;
		System.out.print("입력 : ");
		int su = sc.nextInt();
		while(true) {
			j*=i;
			i++;
			if((i-1)==su)
				break;
		}
		System.out.println(su+"!은 "+j+"이다");
	}
}
