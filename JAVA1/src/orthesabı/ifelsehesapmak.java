package orthesab�;

import java.util.Scanner;

public class ifelsehesapmak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scanner =new Scanner(System.in);
		
		int a1,a2;
		
		System.out.println("l�tfen ilk say�y� giriniz");
		a1=scanner.nextInt();
		System.out.println("l�tfen 2. say�y� giriniz");
		a2=scanner.nextInt();
		
		System.out.println("i�lemler:\n1.toplama\n2.��karma\n3.�arpma\n4.b�lme");
		System.out.println("l�tfen bir i�lem se�iniz");
		int i�lem =scanner.nextInt();
		
		if(i�lem==1) {
			System.out.println("toplam: " +(a1+a2));
		}
		else if(i�lem==2){
			System.out.println("��kar�m :"+ (a1-a2));
		}
		else if(i�lem==3) {
			System.out.println("�arp�m "+ (a1*a2));
		}
		else if(i�lem ==4) {
			if(a2!=0) {
				System.out.println("b�l�m: " +(double)(a1/a2));
			}else {
				System.out.println("bir say� s�f�ra b�l�nemez");
			}
			
		}
		else {
			System.out.println("ge�ersiz i�lem girdinz tekrar deneyiniz");
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
