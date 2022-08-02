package orthesabý;

import java.util.Scanner;

public class ifelsebüyüktenküçüðe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner=new Scanner(System.in);
		
		
		System.out.println("ilk sayýyý giriniz");
		int a=scanner.nextInt();
		System.out.println("2. sayýyý giriniz");
		int b =scanner.nextInt();
		System.out.println("3. sayýyý giriniz");
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
