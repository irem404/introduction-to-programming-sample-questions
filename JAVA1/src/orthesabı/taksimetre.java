package orthesab�;

import java.util.Scanner;

public class taksimetre {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		double km= 2.20;
		
		int mintutar=20;
		int a��l��tutar=10;
		
		System.out.println("mesafeyi km cinsinden giriniz");
		int mesafe =scanner.nextInt();
		
		double tutar=(mesafe*km)+a��l��tutar;
		
		System.out.println("tutar�n�z�:"+ tutar);

	}

}
