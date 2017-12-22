package day03;
import java.util.Scanner;
public class q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("당신의이름은무엇입니까?");
		String name1 = sc.nextLine();
		
		System.out.println(name1+"의 나이는 몇살입니까?");
		int age = sc.nextInt();
		System.out.println(name1+"님의 나이는"+age+"살입니다.");
	}

}
