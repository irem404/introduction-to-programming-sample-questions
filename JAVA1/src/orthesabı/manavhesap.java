package orthesab�;

import java.util.Scanner;

public class manavhesap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner =new Scanner(System.in);
		
		double kgarmut=2.14;
		double kgelma=3.67;
		double kgdomates=1.11;
		double kgmuz=0.95;
		double kgpatl�can=5.00;
		
		System.out.println("ka� kilo armut alacaks�n�z");
		int armut=scanner.nextInt();
		
		System.out.println("ka� kilo elma alacask�n�z");
		int elma=scanner.nextInt();
		
		System.out.println("ka� kilo domates alacaks�n�z");
		int domates=scanner.nextInt();
		
		System.out.println("ka� kilo muz alacaks�n�z");
		int muz =scanner.nextInt();
		
		System.out.println("ka� kilo patl�can alacsk�n�z");
		int patl�can =scanner.nextInt();
		
		double tutar=(armut*kgarmut)+(elma*kgelma)+(domates*kgdomates)+(muz*kgmuz)+(patl�can*kgpatl�can);
		
		System.out.println("toplam tutar: "+tutar);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
