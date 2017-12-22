package day05;

import java.util.Scanner;

public class test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=0;
		int m=0;
		int sum =0;
	
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째값:");
		int n1 = sc.nextInt();
		System.out.println("두번째값:");
		int n2 = sc.nextInt();
		
		 if(n<m){
		  for(n=n+1;n<m;n++){
		   sum=sum+n;
		  }
		 }
		 else{
		  for(m=m+1;m<n;m++){
		   sum=sum+m;
		  }
		  
		 }
		 System.out.println("사이의합"+sum);                   

}
}



