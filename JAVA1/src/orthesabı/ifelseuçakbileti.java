package orthesab�;

import java.util.Scanner;

public class ifelseu�akbileti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner =new Scanner(System.in);
		
		
		
		System.out.println("mesafeyi giriniz.");
		int km=scanner.nextInt();
		System.out.println("ya��n�z� giriniz");
		int ya�=scanner.nextInt();
		System.out.println("yolculuk tipini giriniz");
		int tip =scanner.nextInt();
		
		double normalfiyat,ya�indirimi,tipindirimi;
		if(km>0&&ya�>0&&(tip==1|| tip==2)) {
			
			normalfiyat=km*0.10;
			
			if(ya�<12) {
				ya�indirimi=normalfiyat*0.5;
				
			}else if(ya�>=12&&ya�<24) {
				ya�indirimi=normalfiyat*0.10;
				
			}else if(ya�>65) {
				ya�indirimi=normalfiyat*0.30;
				
			}else {
				ya�indirimi=0;
			}
			normalfiyat-=ya�indirimi;
			if(tip==2) {
				tipindirimi=(normalfiyat*0.20);
				normalfiyat=(normalfiyat-tipindirimi)*2;
			}
			System.out.println("bilet tutar� : "+normalfiyat);
			
			
				
		}else {
			System.out.println("girdiler yanl��");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
