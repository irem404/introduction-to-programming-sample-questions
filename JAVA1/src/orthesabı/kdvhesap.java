package orthesab�;

import java.util.Scanner;

public class kdvhesap {

	public static void main(String[] args) {


		Scanner scanner =new Scanner(System.in);
		
		double kdv=0.18;
		
		System.out.println("�r�n tutar fiyat�n� giriniz;");
		int tutar=scanner.nextInt();
		
		double kdvlitutar=tutar+(tutar*kdv);
		System.out.println("kdvli fiyat "+ kdvlitutar);
		
		
		

	}

}
