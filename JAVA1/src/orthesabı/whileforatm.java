package orthesabý;

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
			System.out.println("kullanýcý adýnýz:");
			username=scanner.nextLine();
			System.out.println("parolanýz: ");
			password=scanner.nextLine();
			
			if(username.equals("patika")&&password.equals("dev123")) {
				System.out.println("hoþgeldiniz sisteme giriþ yaptýnýz");
				do {
					
					System.out.println("1-para yatýrma\n2-para çekme\n3-bakiye sorgula\n4-çýkýþ yap");
					System.out.print("lütfen yapmak istediðiniz iþlemi seçiniz");
					select=scanner.nextInt();
					
					if(select==1) {
						System.out.println("para miktarý ");
						int price =scanner.nextInt();
						balance=balance+price;
						System.out.println("eklenen bakiyeniz :"+ balance);
						
					}else if(select==2) {
						System.out.println("para miktarý ");
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
				System.out.println("tekrar görüþmek üzere");
				break;
				
				
			}else {
				--right;
				System.out.println("hatalý password veya username tekrar deneyiniz ");
				if(right==0) {
					System.out.println("hesap bloke olmuþtur bankanýzý arayýn");
				}else {
					
				System.out.println("kalan hakkýnýz: "+right);
				}
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
