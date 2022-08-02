package orthesabý;

import java.util.Scanner;

public class dairehesabý {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scanner =new Scanner(System.in);
		
		int pi=3;
		
		System.out.println("dairenin yarýçapýný giriniz");
		int r=scanner.nextInt();
		
		double area=pi*r*r;
		double circuit=2*pi*r;
		
		System.out.println("dairenin alaný:"+area+"dairenin çevresi"+circuit);
		
		
		
		
	}

}
