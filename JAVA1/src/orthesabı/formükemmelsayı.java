package orthesabý;

import java.util.Scanner;

public class formükemmelsayý {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scanner =new Scanner(System.in);
		
		int toplam=0;
		
		System.out.println("bir sayý giriniz");
		int sayý=scanner.nextInt();
		
		for(int i=1;i<sayý;i++) {
			if(sayý % i==0) {
				toplam=toplam+i;
				
			}
			}
			if(sayý==toplam) {
				System.out.println("mükemmel sayýdýr");
			
		}else {
			System.out.println("deüildir");
		}
		
		
		
	}

}
