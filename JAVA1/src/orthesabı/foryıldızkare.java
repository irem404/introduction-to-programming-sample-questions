package orthesabý;

import java.util.Scanner;

public class foryýldýzkare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner klavye=new Scanner(System.in);
		System.out.println("Bir Sayý Giriniz");
        int k=klavye.nextInt();
        
        k=k*4;
        
        for(int i=0;i<=k;i++){
            for(int j=0;j<=k;j++){
                
                if(i %4 ==0 && j<=k){
                    System.out.print(" * ");
                }else if(j%4==0 && i<=k){
                    System.out.print(" * ");
                }else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
		
		
		
	}

}
