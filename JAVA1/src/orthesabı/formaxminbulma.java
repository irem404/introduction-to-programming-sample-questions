package orthesab�;

import java.util.Scanner;

public class formaxminbulma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scanner =new Scanner(System.in);
		
		
		
		int min=0;
		int max=0;
		
		for(int i=0;i<5;i++) {
			System.out.println("l�tfen bir say� girini");
			int say�=scanner.nextInt();
			if(i==1) {
				min=say�;
				max=say�;
			}else {
				if(say�>max) {
					max=say�;
				}else {
					min=say�;
				}
			}
		}
		System.out.println("girilen en b�y�k say� "+max);
		System.out.println("girilen en k���k say� "+min);
		
		
		
	}

}
