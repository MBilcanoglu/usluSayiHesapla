package usluSayiHesapla;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int n,k,total=1;;
		
		Scanner scan=new Scanner(System.in);
		
		System.out.print("Üssü alýnacak sayý: ");
		n=scan.nextInt();
		
		System.out.print("Üs olacak sayý: ");
		k=scan.nextInt();
		
		for(int i=1; i<=k; i++) {
			total*=n;
		}
		
		System.out.println("Cevap: "+total);
		
	}

}
