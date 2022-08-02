package orthesabý;

import java.util.Scanner;

public class forekok {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner =new Scanner(System.in);
		
		System.out.println("ilk deðer :");
		int n1=scanner.nextInt();
		
		System.out.println("2. deðer ");
		int n2=scanner.nextInt();
		
		for(int i=1;i<=(n1*n2);i++) {
			if(i%n1==0&&i%n2==0) {
				System.out.println(i);
				break;
				
			}
		}
		
		
	}

}
