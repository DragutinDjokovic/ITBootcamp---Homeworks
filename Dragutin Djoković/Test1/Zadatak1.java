package test;

import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
		/*
		 * Napisati program na programskom jeziku Java koji ima sledece funkcionalnosti
		 * za potrebe ugostiteljskog objekta: Program sadrzi meni koji ima sledece
		 * opcije: 0 - Izlaz 1 - Dodavanje cene na racun 2 - Naplata racuna
		 * 
		 * Ukoliko korisnik unese opciju 0 program se zavrsava. Ukoliko korisnik unese
		 * opciju 1 program pita korisnika da unese cenu proizvoda i ta cena se dodaje
		 * na racun korisnika. Ukoliko korisnik unese opciju 2 program pita korisnika da
		 * unese kolicinu novca za naplatu racuna. Ukoliko korisnik unese vrednost manju
		 * od vrednosti racuna, potrebno je da se ispise greska, bez umanjenja racuna i
		 * da se ponovo ispise meni. Ukoliko korisnik unese vrednost vecu ili jednaku od
		 * cene racuna ispisuje se kusur i racun se stornira to jest postavlja na nulu.
		 * Zatim se ponovo ispisuje meni.
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		int opcija;
		double cena, naplata, sum = 0.0, kusur;
		do {
			System.out.println("0 - Izlaz");
			System.out.println("1 - Dodavanje cene na racun");
			System.out.println("2 - Naplata racuna");
			System.out.println("Unesite opciju koju zelite:");
			opcija = sc.nextInt();
			switch (opcija) {
			case 1:
				System.out.println("Unesite cenu koju zelite dodati na racun:");
				cena = sc.nextDouble();
				if (cena > 0) {
					sum += cena;
					System.out.println("Trenutno zaduzenje je: " + sum);
					System.out.println();
				} else {
					System.out.println("Cena mora biti veca od 0. Hvala!");
				}
				System.out.println();
				break;
			case 2:
				System.out.println("Unesite kolicinu novca kojom placate racun od " + sum);
				naplata = sc.nextDouble();
				if (naplata < sum) {
					System.out.println("Greska!");
				} else {
					kusur = naplata - sum;
					sum = 0;
					System.out.println("Hvala, vas kusur iznosi: " + kusur);
				}
				System.out.println();
				break;
			default:
				System.out.println("Pogresan unos");
				break;
			case 0:
				System.out.println("Izlaz iz programa!");

			}
		} while (opcija != 0);
	}

}
