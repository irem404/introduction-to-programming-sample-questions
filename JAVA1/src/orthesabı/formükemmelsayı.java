package orthesab�;

import java.util.Scanner;

public class form�kemmelsay� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scanner =new Scanner(System.in);
		
		int toplam=0;
		
		System.out.println("bir say� giriniz");
		int say�=scanner.nextInt();
		
		for(int i=1;i<say�;i++) {
			if(say� % i==0) {
				toplam=toplam+i;
				
			}
			}
			if(say�==toplam) {
				System.out.println("m�kemmel say�d�r");
			
		}else {
			System.out.println("de�ildir");
		}
		
		
		
	}

}
