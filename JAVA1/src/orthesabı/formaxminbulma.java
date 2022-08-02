package orthesabý;

import java.util.Scanner;

public class formaxminbulma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scanner =new Scanner(System.in);
		
		
		
		int min=0;
		int max=0;
		
		for(int i=0;i<5;i++) {
			System.out.println("lütfen bir sayý girini");
			int sayý=scanner.nextInt();
			if(i==1) {
				min=sayý;
				max=sayý;
			}else {
				if(sayý>max) {
					max=sayý;
				}else {
					min=sayý;
				}
			}
		}
		System.out.println("girilen en büyük sayý "+max);
		System.out.println("girilen en küçük sayý "+min);
		
		
		
	}

}
