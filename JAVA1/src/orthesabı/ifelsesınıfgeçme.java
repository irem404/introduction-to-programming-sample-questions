package orthesab�;

import java.util.Scanner;

public class ifelses�n�fge�me {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

 		
		Scanner scanner =new Scanner(System.in); 
		
		System.out.println("mat notunuz");
		int mat=scanner.nextInt();
		
		System.out.println("t�rk�e notunuz");
		int t�rk�e=scanner.nextInt();
		
		System.out.println("fizik notunuz");
		int fizik =scanner.nextInt();
		
		System.out.println("kimya notunuz");
		int  kimya =scanner.nextInt();
		
		double ortalama = (double)(mat+t�rk�e+fizik+kimya)/4;
		
		System.out.println("ortalaman�z: "+ ortalama);
		if(ortalama>=55) {
			System.out.println("ge�tiniz");
		}else {
			System.out.println("kald�n�z");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
