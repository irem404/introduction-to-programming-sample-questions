package orthesab�;

import java.util.Scanner;

public class ifelsekullan�c�giri�i {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

           Scanner scanner =new Scanner(System.in);		
		
		String username,password;
		
		System.out.println("kullan�c� ad�n�z� giriniz");
		username=scanner.nextLine();
		
		System.out.println("�ifrenizi giriniz");
		password=scanner.nextLine();
		
		if(username.equals("iremel")&&password.equals("221122")) {
			System.out.println("ba�ar�yla giri� yapt�n�z");
		}else {
			System.out.println("�ifre veya kullan�c� ad� hatal�");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
