package orthesab�;

import java.util.Scanner;

public class ifelsehavas�cakl��� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scanner =new Scanner(System.in);
		
		System.out.println("yar�nki hava s�cakl���");
		int s�cakl�k=scanner.nextInt();
		
		
		if(s�cakl�k<=0) {
			System.out.println("kaya�a gidebilirsiniz");
		}else if(s�cakl�k>0&&s�cakl�k<20) {
			System.out.println("pikni�e gidebilirsiniz");
		}else if(s�cakl�k>=20&&s�cakl�k<40) {
			System.out.println("havuza gidebilirsiniz");
		}else {
			System.out.println("�yle bir s�cakl�k olamaz olursa evinden ��kma aslan�m");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
