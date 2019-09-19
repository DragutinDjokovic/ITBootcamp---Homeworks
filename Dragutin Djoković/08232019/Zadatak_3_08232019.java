package n5domaci;

import java.util.Scanner;

public class Zadatak_3_08232019 {

	public static void main(String[] args) {
		/*
		 * Napisati program koji ucitava niz od n celih brojeva i dve metode. Prva
		 * metoda vraca proizvod elemenata na neparnim pozicijama, 
		 * a druga vraca zbir
		 * parnih elemenata niza.
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesi broj elemenata niza: ");
		int n = sc.nextInt();
		int niz[] = new int[n];

		System.out.println("Unesite vrednosti elemenata niza: ");
		for (int i = 0; i < niz.length; i++) {
			niz[i] = sc.nextInt();
			
		}
		System.out.println("Proizvod elemenata na neparnim pozicijama je: "+proizvod(niz));
		System.out.println("Zbir parnih elemenata niza: "+zbir(niz));
	}
	//
	public static int proizvod(int[] niz) {
		int pr=1;{
		for(int i=0; i<niz.length; i++) {
			if(i%2==0)
			pr*=niz[i];
		}	
		
	}
	return pr;
	}
	//
	public static int zbir(int[] niz) {
		int zb=0;{
			for(int i=0; i<niz.length; i++) {
				if(niz[i]%2==0) {
				zb+=niz[i];}
			}
		}
		
	return zb;}
}
