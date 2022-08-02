package orthesabý;

import java.util.Scanner;

public class forfibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scanner =new Scanner(System.in);
		
		System.out.println("bir deðer giriniz");
		int sayý =scanner.nextInt();
		
		int a=1;
		int b=1;
		int c;
		
		
		// 1 1 2 3 5 8 13 21 34 55 
		// a b c
		//   a b c
		//     a b c
		
		System.out.println(a);
		System.out.println(b);
		for(int i=1;i<=sayý;i++) {
			c=a+b;
			a=b;
			b=c;
			System.out.println(c);
		}
		
		
		
		
	}

}
