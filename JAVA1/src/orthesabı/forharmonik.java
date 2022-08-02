package orthesabý;

import java.util.Scanner;

public class forharmonik {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner=new Scanner(System.in);
		
		System.out.println("bir sayý giriniz");
		int sayý=scanner.nextInt();
		
		
		double result=0.0;
		for(int i=1;i<=sayý;i++) {
			result+=(1.0/i);
		}
		// i = 1 result=0+1
		// i=2 result = 1+1/2
		// i=3 result = 1+1/2+1/3
		System.out.println(result);
		
		
		
		
		
		
		
		
		
	}

}
