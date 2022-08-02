package orthesabý;

import java.util.Scanner;

public class hipohesap {

	public static void main(String[] args) {
	
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("üçgenin dik kenarýný giriniz");
		int a=scanner.nextInt();
		
		System.out.println("üçgenin tabanýný giriniz");
		int b =scanner.nextInt();
		
		double c =Math.sqrt((a*a)+(b*b));
		
		System.out.println("üçgenin hipotenüsü "+c);
		
	}

}
