package orthesab�;

import java.util.Scanner;

public class �devmaxmin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner =new Scanner (System.in);
		
		int min=0;
		int max=0;
		for(int i=1;i<=3;i++) {
			System.out.println("l�tfen say� giriniz giriniz");
			int say� =scanner.nextInt();
			
			
				if(say�>max) {
					max=say�;
				}
				if(say�<min) {
					min=say�;
				}
			}
		
			System.out.println("max say� "+max);
			System.out.println("min say� "+min);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
