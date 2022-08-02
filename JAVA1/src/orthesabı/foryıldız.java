package orthesabý;

import java.util.Scanner;

public class foryýldýz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner =new Scanner(System.in);
		
		System.out.println("basamak sayýsýný giriniz");
		int n=scanner.nextInt();
		
		for(int i=1;i<=n;i++) {
			for(int k=1;k<=(n-i);k++) {
				System.out.print(" ");
			}
			for(int j=1;j<=(2*i)-1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
	}

}
