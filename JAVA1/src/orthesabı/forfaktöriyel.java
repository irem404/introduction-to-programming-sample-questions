package orthesab�;

import java.util.Scanner;

public class forfakt�riyel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner =new Scanner(System.in); 
		
		System.out.println("bir say� giriniz");
		int say�=scanner.nextInt();
		
		int total =1;
		for(int i=1;i<say�;i++) {
	     total=total*i;
			System.out.println("fakt�riyel: "+total);
		}
		
		
		
		
		
		
	}

}
