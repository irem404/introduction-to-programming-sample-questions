package orthesabý;

import java.util.Scanner;

public class ifelsesýnýfgeçme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

 		
		Scanner scanner =new Scanner(System.in); 
		
		System.out.println("mat notunuz");
		int mat=scanner.nextInt();
		
		System.out.println("türkçe notunuz");
		int türkçe=scanner.nextInt();
		
		System.out.println("fizik notunuz");
		int fizik =scanner.nextInt();
		
		System.out.println("kimya notunuz");
		int  kimya =scanner.nextInt();
		
		double ortalama = (double)(mat+türkçe+fizik+kimya)/4;
		
		System.out.println("ortalamanýz: "+ ortalama);
		if(ortalama>=55) {
			System.out.println("geçtiniz");
		}else {
			System.out.println("kaldýnýz");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
