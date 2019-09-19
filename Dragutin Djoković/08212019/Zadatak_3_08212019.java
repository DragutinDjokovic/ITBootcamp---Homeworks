package n5domaci;

import java.util.Scanner;

public class Zadatak_3_08212019 {

	public static void main(String[] args) {
		// Napisati program koji ucitava duzinu niza, niz i proverava da li je niz
		// rastuci.
		// Primer1 niza: 3 54 123 18
		// Ispis: Niz nije rastuci.
		// Primer2 niza: 71 422 1001 5050
		// Ispis: Niz je rastuci.
		Scanner sc = new Scanner(System.in);
		boolean rast=true;
		System.out.println("Unesite zeljenu duzinu niza: ");
		int n = sc.nextInt();
		int[] niz = new int[n];

		System.out.println("Unesite vrednosti elemenata niza: ");
		for (int i = 0; i < niz.length; i++) {
			niz[i] = sc.nextInt();
		}
		for (int j = 0; j < niz.length-1; j++) {
			if (niz[j] >= niz[j + 1]) {
				rast = false;
				break;
			}

		}
		if (rast) {
			System.out.println("Niz je rastuci.");
		}
		else {
			System.out.println("Niz nije rastuci.");
		}
	}
}
