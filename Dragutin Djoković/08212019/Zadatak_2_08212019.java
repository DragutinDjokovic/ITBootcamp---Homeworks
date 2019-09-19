package domaci;
import java.util.Scanner;
public class Zadatak_2_08212019 {

	public static void main(String[] args) {
		// Napisati program koji ucitava duzinu niza, niz i ispisuje niz inverznim redosledom.
		//Primer niza: 3 54 123 18
		//Ispis: 18 123 54 32
		Scanner sc=new Scanner(System.in);
		System.out.println("Upisite duzinu niza n: ");
		int n=sc.nextInt();
		int[] niz=new int[n];
		int broj;
		System.out.print("Unosite vrednosti elemenata niza: ");
		for(int i=0; i<niz.length; i++) {
			niz[i]=sc.nextInt();
		}
			
		System.out.println("Obrnut redosled brojeva niza je: ");
		//--------
		for(int i=niz.length-1; i>-1; i--) {
			broj=niz[i];
			System.out.print(broj+" ");
		}
		
		
	}

}
