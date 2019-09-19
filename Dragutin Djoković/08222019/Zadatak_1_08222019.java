package n5domaci;

import java.util.Scanner;

public class Zadatak_1_08222019 {

	public static void main(String[] args) {
		// Napisati program u kom se unose 3 realna broja i
		// poziva i ispisuje dve metode(u mainu).
		// Prva metoda vraca proizvod unetih brojeva.
		// Druga metoda ispisuje najmanji od unesenih brojeva.
		Scanner ucitaj = new Scanner(System.in);

		double[] niz = new double[3];
		System.out.println("Unesite 3 realna broja: ");
		for (int i = 0; i < niz.length; i++) {
			niz[i] = ucitaj.nextDouble();

		}
		System.out.println("Proizvod realnih brojeva niza je"+proizvod(niz));
		System.out.println("Najmanje broj u nizu je: "+minimum(niz));
	}

	public static double proizvod(double[] niz) {
		double a = 1.0;
		for (int i = 0; i < niz.length; i += 1) {

			a *= niz[i];

		}
		return a;
	}

	public static double minimum(double[] niz) {
		double b=0;
		for (int i = 0; i < niz.length-1; i++) {

			if (niz[i] > niz[i + 1]) 
				b = niz[i + 1];
			

		}
		return b;
	}

}
