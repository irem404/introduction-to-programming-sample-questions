package orthesabı;

import java.util.Scanner;

public class taksimetre {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		double km= 2.20;
		
		int mintutar=20;
		int açılıştutar=10;
		
		System.out.println("mesafeyi km cinsinden giriniz");
		int mesafe =scanner.nextInt();
		
		double tutar=(mesafe*km)+açılıştutar;
		
		System.out.println("tutarınızŞ:"+ tutar);

	}

}
