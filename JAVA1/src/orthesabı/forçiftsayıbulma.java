package orthesab�;

import java.util.Scanner;

public class for�iftsay�bulma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("bir say� giriniz");
		int say�=scanner.nextInt();
		
		
		int toplam=0;
		for(int i=0;i<say�;i+=2) {
			toplam=toplam+i;
			
		}
		System.out.println("toplam: "+ toplam);
		
		
	}

}
