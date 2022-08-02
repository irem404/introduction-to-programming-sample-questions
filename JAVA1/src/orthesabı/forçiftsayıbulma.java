package orthesabý;

import java.util.Scanner;

public class forçiftsayýbulma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("bir sayý giriniz");
		int sayý=scanner.nextInt();
		
		
		int toplam=0;
		for(int i=0;i<sayý;i+=2) {
			toplam=toplam+i;
			
		}
		System.out.println("toplam: "+ toplam);
		
		
	}

}
