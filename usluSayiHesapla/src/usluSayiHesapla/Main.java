package usluSayiHesapla;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int n,k,total=1;;
		
		Scanner scan=new Scanner(System.in);
		
		System.out.print("�ss� al�nacak say�: ");
		n=scan.nextInt();
		
		System.out.print("�s olacak say�: ");
		k=scan.nextInt();
		
		for(int i=1; i<=k; i++) {
			total*=n;
		}
		
		System.out.println("Cevap: "+total);
		
	}

}
