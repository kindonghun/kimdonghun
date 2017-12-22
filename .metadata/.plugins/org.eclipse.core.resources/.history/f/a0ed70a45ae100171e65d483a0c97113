package day05;

import java.util.Scanner;

public class test6 {
	public static void main(String[] args) {
		int tmp = 0;
		int sum = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째값:");
		int n1 = sc.nextInt();
		System.out.println("두번째값:");
		int n2 = sc.nextInt();

		for (int i = n1 + 1; i <= n2 - 1; i++) {
			if (n1 < n2) {
				System.out.println(i + "\t");
				sum += i;
			} else {
				for (int j = n1; j >= n2; j++) {
					if (n1 > n2) {
						System.out.println(j+"\t");
						sum += j;
					}
				}
			}
		}
		System.out.println(n1 + "부터" + n2 + "까지의사이합은" + sum + "입니다.");
	}
}
