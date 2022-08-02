package orthesabý;

import java.util.Scanner;

public class ifelsehesapmak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scanner =new Scanner(System.in);
		
		int a1,a2;
		
		System.out.println("lütfen ilk sayýyý giriniz");
		a1=scanner.nextInt();
		System.out.println("lütfen 2. sayýyý giriniz");
		a2=scanner.nextInt();
		
		System.out.println("iþlemler:\n1.toplama\n2.çýkarma\n3.çarpma\n4.bölme");
		System.out.println("lütfen bir iþlem seçiniz");
		int iþlem =scanner.nextInt();
		
		if(iþlem==1) {
			System.out.println("toplam: " +(a1+a2));
		}
		else if(iþlem==2){
			System.out.println("çýkarým :"+ (a1-a2));
		}
		else if(iþlem==3) {
			System.out.println("çarpým "+ (a1*a2));
		}
		else if(iþlem ==4) {
			if(a2!=0) {
				System.out.println("bölüm: " +(double)(a1/a2));
			}else {
				System.out.println("bir sayý sýfýra bölünemez");
			}
			
		}
		else {
			System.out.println("geçersiz iþlem girdinz tekrar deneyiniz");
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
