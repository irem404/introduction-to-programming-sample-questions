package orthesabý;

import java.util.Scanner;

public class ifelseuçakbileti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner =new Scanner(System.in);
		
		
		
		System.out.println("mesafeyi giriniz.");
		int km=scanner.nextInt();
		System.out.println("yaþýnýzý giriniz");
		int yaþ=scanner.nextInt();
		System.out.println("yolculuk tipini giriniz");
		int tip =scanner.nextInt();
		
		double normalfiyat,yaþindirimi,tipindirimi;
		if(km>0&&yaþ>0&&(tip==1|| tip==2)) {
			
			normalfiyat=km*0.10;
			
			if(yaþ<12) {
				yaþindirimi=normalfiyat*0.5;
				
			}else if(yaþ>=12&&yaþ<24) {
				yaþindirimi=normalfiyat*0.10;
				
			}else if(yaþ>65) {
				yaþindirimi=normalfiyat*0.30;
				
			}else {
				yaþindirimi=0;
			}
			normalfiyat-=yaþindirimi;
			if(tip==2) {
				tipindirimi=(normalfiyat*0.20);
				normalfiyat=(normalfiyat-tipindirimi)*2;
			}
			System.out.println("bilet tutarý : "+normalfiyat);
			
			
				
		}else {
			System.out.println("girdiler yanlýþ");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
