package orthesabý;

import java.util.Scanner;

public class forfaktöriyel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner =new Scanner(System.in); 
		
		System.out.println("bir sayý giriniz");
		int sayý=scanner.nextInt();
		
		int total =1;
		for(int i=1;i<sayý;i++) {
	     total=total*i;
			System.out.println("faktöriyel: "+total);
		}
		
		
		
		
		
		
	}

}
