package orthesabý;

import java.util.Scanner;

public class kitlehesap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scanner =new Scanner(System.in);
		
		System.out.println("lütfen boyunuzu mete cinsinden giriniz");
		double boy=scanner.nextDouble();
		
		System.out.println("lütfen kilonuzu giriniz");
		int kilo=scanner.nextInt();
		
		double index=(kilo)/(boy*boy);
		
		System.out.println("vücut kilte indeksiniz:"+index);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
