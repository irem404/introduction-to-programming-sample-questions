package orthesab�;

import java.util.Scanner;

public class kitlehesap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scanner =new Scanner(System.in);
		
		System.out.println("l�tfen boyunuzu mete cinsinden giriniz");
		double boy=scanner.nextDouble();
		
		System.out.println("l�tfen kilonuzu giriniz");
		int kilo=scanner.nextInt();
		
		double index=(kilo)/(boy*boy);
		
		System.out.println("v�cut kilte indeksiniz:"+index);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
