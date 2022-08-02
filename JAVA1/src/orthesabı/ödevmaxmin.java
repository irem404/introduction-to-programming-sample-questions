package orthesabý;

import java.util.Scanner;

public class ödevmaxmin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner =new Scanner (System.in);
		
		int min=0;
		int max=0;
		for(int i=1;i<=3;i++) {
			System.out.println("lütfen sayý giriniz giriniz");
			int sayý =scanner.nextInt();
			
			
				if(sayý>max) {
					max=sayý;
				}
				if(sayý<min) {
					min=sayý;
				}
			}
		
			System.out.println("max sayý "+max);
			System.out.println("min sayý "+min);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
