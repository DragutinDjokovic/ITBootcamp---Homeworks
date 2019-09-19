package n5domaci;
import java.util.Scanner;
public class Zadatak_1_08212019 {

	public static void main(String[] args) {
		// Korisnik ucitava niz od n elemenata niza, kao i neki broj br. 
		//Program ispisuje elemente niza deljive brojem br.
		Scanner sc=new Scanner(System.in);
		System.out.println("Koliko elemenata treba da ima niz: ");
		int n=sc.nextInt();
		int[] niz=new int[n];
		
		System.out.println("Upisite broj kojim zelite da se deli element niza: ");
		int zaDelj=sc.nextInt();
		
		System.out.print("Unesite elemente u niz: ");
		for(int i=0; i<niz.length; i++) {
			niz[i]=sc.nextInt();
		}
		System.out.print("Brojevi koji su deljivi su: ");
		for(int i=0; i<niz.length; i++) {
			int broj=niz[i];
			if (broj%zaDelj==0)
			System.out.print(broj+" ");}
		
		
		}}

