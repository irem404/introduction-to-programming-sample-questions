package orthesab�;

import java.util.Scanner;

public class whileforatm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String username,password;
		
		Scanner scanner=new Scanner(System.in);
		
		int right=3;
		int balance=1500;
		int select;
		
		while(right>0) {
			System.out.println("kullan�c� ad�n�z:");
			username=scanner.nextLine();
			System.out.println("parolan�z: ");
			password=scanner.nextLine();
			
			if(username.equals("patika")&&password.equals("dev123")) {
				System.out.println("ho�geldiniz sisteme giri� yapt�n�z");
				do {
					
					System.out.println("1-para yat�rma\n2-para �ekme\n3-bakiye sorgula\n4-��k�� yap");
					System.out.print("l�tfen yapmak istedi�iniz i�lemi se�iniz");
					select=scanner.nextInt();
					
					if(select==1) {
						System.out.println("para miktar� ");
						int price =scanner.nextInt();
						balance=balance+price;
						System.out.println("eklenen bakiyeniz :"+ balance);
						
					}else if(select==2) {
						System.out.println("para miktar� ");
						int price =scanner.nextInt();
						if(price>balance) {
							System.out.println("yeterli bakiye yok");
						}else {
							balance =balance-price;
							System.out.println("kalan bakiyeniz "+ balance);
						}
					}else if(select==3) {
						System.out.println("bakiyeniz : "+ balance);
					}
					
					
				}while(select!=4);
				System.out.println("tekrar g�r��mek �zere");
				break;
				
				
			}else {
				--right;
				System.out.println("hatal� password veya username tekrar deneyiniz ");
				if(right==0) {
					System.out.println("hesap bloke olmu�tur bankan�z� aray�n");
				}else {
					
				System.out.println("kalan hakk�n�z: "+right);
				}
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
