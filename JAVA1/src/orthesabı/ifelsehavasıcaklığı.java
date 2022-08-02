package orthesabý;

import java.util.Scanner;

public class ifelsehavasýcaklýðý {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scanner =new Scanner(System.in);
		
		System.out.println("yarýnki hava sýcaklýðý");
		int sýcaklýk=scanner.nextInt();
		
		
		if(sýcaklýk<=0) {
			System.out.println("kayaða gidebilirsiniz");
		}else if(sýcaklýk>0&&sýcaklýk<20) {
			System.out.println("pikniðe gidebilirsiniz");
		}else if(sýcaklýk>=20&&sýcaklýk<40) {
			System.out.println("havuza gidebilirsiniz");
		}else {
			System.out.println("öyle bir sýcaklýk olamaz olursa evinden çýkma aslaným");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
