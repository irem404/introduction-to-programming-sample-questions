package orthesab�;

import java.util.Scanner;

public class hipohesap {

	public static void main(String[] args) {
	
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("��genin dik kenar�n� giriniz");
		int a=scanner.nextInt();
		
		System.out.println("��genin taban�n� giriniz");
		int b =scanner.nextInt();
		
		double c =Math.sqrt((a*a)+(b*b));
		
		System.out.println("��genin hipoten�s� "+c);
		
	}

}
