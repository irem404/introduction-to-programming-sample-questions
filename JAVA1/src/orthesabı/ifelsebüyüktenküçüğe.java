package orthesab�;

import java.util.Scanner;

public class ifelseb�y�ktenk����e {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner=new Scanner(System.in);
		
		
		System.out.println("ilk say�y� giriniz");
		int a=scanner.nextInt();
		System.out.println("2. say�y� giriniz");
		int b =scanner.nextInt();
		System.out.println("3. say�y� giriniz");
		int c=scanner.nextInt();
		
		if((a>b)&&(a>c)) {
			if(b>c) {
				System.out.println("a>b>c");
			}else {
				System.out.println("a>c>b");
			}
			
		}else if((b>a)&&(b>c)) {
			if(a>c) {
				System.out.println("b>a>c");
			}else {
				System.out.println("b>c>a");
			}
		}else if((c>b)&&(c>b)) {
			if(b>a) {
				System.out.println("c>b>a");
			}else {
				System.out.println("c>a>b");
			}
		}
		
		
		
		
		
		
		
		
		
	}

}
