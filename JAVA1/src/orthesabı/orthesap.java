package orthesab�;

import java.util.Scanner;

public class orthesap {

	public static void main(String[] args) {


		Scanner scanner = new Scanner(System.in);
		
		System.out.println("l�tfen fizik notunuzu girininiz");
		int fizik=scanner.nextInt();
		
		System.out.println("l�tfen mat notunuzu giriniz");
		int mat =scanner.nextInt();
		
		System.out.println("l�tfen t�rk�e notunuzu giriniz ");
		int t�rk�e =scanner.nextInt();
		
		System.out.println("l�tfen co�rafya notunuzu giriniz");
		int co�rafya=scanner.nextInt();
		
		int ort;
		
		ort=(fizik+mat+t�rk�e+co�rafya)/4;
		
		System.out.println("ortalaman�z:"+ort);
		
		
	}

}
