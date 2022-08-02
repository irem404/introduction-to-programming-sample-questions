package orthesabý;

import java.util.Scanner;

public class orthesap {

	public static void main(String[] args) {


		Scanner scanner = new Scanner(System.in);
		
		System.out.println("lütfen fizik notunuzu girininiz");
		int fizik=scanner.nextInt();
		
		System.out.println("lütfen mat notunuzu giriniz");
		int mat =scanner.nextInt();
		
		System.out.println("lütfen türkçe notunuzu giriniz ");
		int türkçe =scanner.nextInt();
		
		System.out.println("lütfen coðrafya notunuzu giriniz");
		int coðrafya=scanner.nextInt();
		
		int ort;
		
		ort=(fizik+mat+türkçe+coðrafya)/4;
		
		System.out.println("ortalamanýz:"+ort);
		
		
	}

}
