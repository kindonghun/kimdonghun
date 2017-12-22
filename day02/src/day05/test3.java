package day05;

public class test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum1=0;
		int sum2=0;
		int sum3=0;
		
		
		for(int i=1;i<=100;i++) {
			 sum1 +=i;
			if(i%2==0) {
			sum2 += i;
			}else {
				sum3 +=i;
			}
		}
		System.out.println("ÃÑÇÕ:"+sum1);
		System.out.println("Â¦¼öÀÇÇÕ:"+sum2);
		System.out.println("È¦¼öÀÇÇÕ:"+sum3);
	}

}
