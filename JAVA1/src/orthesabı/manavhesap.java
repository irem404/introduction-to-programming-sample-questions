package orthesabý;

import java.util.Scanner;

public class manavhesap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner =new Scanner(System.in);
		
		double kgarmut=2.14;
		double kgelma=3.67;
		double kgdomates=1.11;
		double kgmuz=0.95;
		double kgpatlýcan=5.00;
		
		System.out.println("kaç kilo armut alacaksýnýz");
		int armut=scanner.nextInt();
		
		System.out.println("kaç kilo elma alacaskýnýz");
		int elma=scanner.nextInt();
		
		System.out.println("kaç kilo domates alacaksýnýz");
		int domates=scanner.nextInt();
		
		System.out.println("kaç kilo muz alacaksýnýz");
		int muz =scanner.nextInt();
		
		System.out.println("kaç kilo patlýcan alacskýnýz");
		int patlýcan =scanner.nextInt();
		
		double tutar=(armut*kgarmut)+(elma*kgelma)+(domates*kgdomates)+(muz*kgmuz)+(patlýcan*kgpatlýcan);
		
		System.out.println("toplam tutar: "+tutar);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
