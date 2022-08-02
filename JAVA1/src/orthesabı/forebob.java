package orthesabý;

import java.util.Scanner;

public class forebob {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scanner =new Scanner(System.in);
		
		System.out.println("ilk sayýyý giriniz:");
		int n1=scanner.nextInt();
		
		System.out.println("ikinci sayýyý giriniz");
		int n2=scanner.nextInt();
		
		int ebob=1;
		for(int i=1;i<=n1;i++) {
			if(n1%i==0&&n2%i==0) {
				ebob=i;
			}
		}
		System.out.println(ebob);
		
		
		System.out.println("---------KISAYOLU----------------");
		
		for(int k=n1;k>0;k--) {
			if(n1%k==0&&n2%k==0) {
				ebob =k;
				System.out.println(ebob);
				break;
			}
		}
		
		
	}

}
