package orthesab�;

import java.util.Scanner;

public class dairehesab� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scanner =new Scanner(System.in);
		
		int pi=3;
		
		System.out.println("dairenin yar��ap�n� giriniz");
		int r=scanner.nextInt();
		
		double area=pi*r*r;
		double circuit=2*pi*r;
		
		System.out.println("dairenin alan�:"+area+"dairenin �evresi"+circuit);
		
		
		
		
	}

}
