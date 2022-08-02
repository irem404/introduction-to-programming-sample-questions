package orthesabý;

import java.util.Scanner;

public class ifelsekullanýcýgiriþi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

           Scanner scanner =new Scanner(System.in);		
		
		String username,password;
		
		System.out.println("kullanýcý adýnýzý giriniz");
		username=scanner.nextLine();
		
		System.out.println("þifrenizi giriniz");
		password=scanner.nextLine();
		
		if(username.equals("iremel")&&password.equals("221122")) {
			System.out.println("baþarýyla giriþ yaptýnýz");
		}else {
			System.out.println("þifre veya kullanýcý adý hatalý");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
