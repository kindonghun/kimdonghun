package day06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class test2 {
	public static void main(String[] args)throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int kor=0;
		int mat=0;
		int eng=0;
		int sum=0;
		double avg=0;
		do {
			System.out.print("국어점수입력:");
			kor=Integer.parseInt(in.readLine());
			System.out.print("수학점수입력:");
			mat=Integer.parseInt(in.readLine());
			System.out.print("영어점수입력:");
			eng=Integer.parseInt(in.readLine());
		}while(kor >100||kor<=0); {
		
			System.out.println("국어점수는"+kor+"점입니다.");
			
		}
			while(mat>100||mat<=0);{
				System.out.println("수학점수는"+mat+"점입니다.");
				
			}
				while(eng>100||eng<=0);{
					System.out.println("영어점수는"+eng+"점입니다.");
			
				}
				sum =(kor+mat+eng);
				avg =(double)sum/3.f;
				System.out.println("총점은"+sum+"이고평균은"+avg+"입니다");
			if(avg >=90) //평균이 90보다 크거나같을떄 
				System.out.println("A등급입니다.");
			else if(avg>=80)
				System.out.println("B등급입니다.");
			else if(avg>=70)
				System.out.println("C등급입니다.");
			else if(avg>=60 )
				System.out.println("D등급입니다.");
			else
				System.out.println("F등급입니다.");
			
			
				
			
			
			
	
		
	}
}
