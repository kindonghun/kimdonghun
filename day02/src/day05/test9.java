package day05;

public class test9 {
	public static void main(String[] args) {
		
		System.out.println("Q3.");
		for (int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++)
				System.out.print("*");
			System.out.println();
		}System.out.println();
			
		System.out.println("Q4.");
		for (int i = 1; i < 6; i++) {
			for (int j = 1; j < 6; j++)
				System.out.print(i);
			System.out.println();
		}System.out.println();
		
		System.out.println("Q5.");
		for (int i = 1; i < 6; i++) {
			for (int j = 1; j < 6; j++)
				System.out.print(j);
			System.out.println();
		}System.out.println();
		
		System.out.println("Q6.");
		for(int i=0;i<5;i++) {
			for(int j=(i+1);j<(i+6); j++) 
				System.out.print(j);
				System.out.println();
			}System.out.println();
			
			System.out.println("Q7.");
			for(int i=6;i>1;i--) {
				for(int j=(i-1);j<(i+4); j++) 
					System.out.print(j);
				System.out.println();
			}System.out.println();
			
			System.out.println("Q8.");
			for(int i = 0; i < 5; i++) {
				for (int j = 1; j < (i + 2); j++)
					System.out.print("*");
				System.out.println();
			}System.out.println();
			
			System.out.println("Q9.");
			for(int i=6; i>1;i--) {
				for(int j=1; j<=(i-1);j++)
					System.out.print("*");
				System.out.println();
			}System.out.println();
			
			System.out.println("Q10.");
			for (int i = 1; i <= 5; i++) {
				for (int k = 1; k < i; k++)
					System.out.print(" ");
				for (int j = 1; j < (7-i); j++)
					System.out.print("*");
				System.out.println();
			}System.out.println();
			
			System.out.println("Q11.");
			for(int i=1; i<=5;i++) {
				for(int j=1; j<(6-i); j++)
					System.out.print(" ");
				for(int k=1; k<(i+1); k++)
					System.out.print("*");
				System.out.println();
			}System.out.println();
			
			System.out.println("Q11.");
			for(int i = 1; i <= 5; i++) {
				for (int k = 1; k < (6-i); k++)
					System.out.print(" ");
				for (int j = 1; j < (i+1); j++)
					System.out.print("*");
				System.out.println();
			}System.out.println();
			
			System.out.println("Q12.");
			for(int i =1; i<=5; i++) {
				for(int j=1; j<(i+1);j++)
					System.out.print("*");
				System.out.println();
			}
			for(int k =1; k<=4; k++) {
				for(int l=1; l<(6-k); l++)
					System.out.print("*");
				System.out.println();
			}System.out.println();
			
			System.out.println("Q13.");
			for(int i=1; i<=5; i++) {
				for(int k=1; k<=(6-i);k++)
					System.out.print("*");
				System.out.println();
			}
			for(int i=1; i<=4; i++) {
				for(int k=1; k<=(1+i);k++)
					System.out.print("*");
			System.out.println();
			}
			System.out.println("Q14.");
			for(int i=1; i<=5; i++) {
				for(int k=1;k<i;k++)
					System.out.print(" ");
				for(int j=1; j<(7-i); j++)
					System.out.print("*");
			System.out.println();
			}
			for(int i=1; i<=4; i++) {
				for(int k=1; k<(5-i);k++)
					System.out.print(" ");
				for(int j=1; j<(i+2); j++)
					System.out.print("*");
				System.out.println();
			}
			System.out.println("Q15.");
			for(int i=1; i<=6; i++) {
				for(int k=1; k<6-i;k++)
					System.out.print(" ");
				for(int j=1; j<=(6-i);j++)
					System.out.print("*");
			}System.out.println();
				
	}
}
	
	
	