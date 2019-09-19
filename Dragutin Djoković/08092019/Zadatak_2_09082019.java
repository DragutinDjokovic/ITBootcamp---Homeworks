package dp;

import java.util.Scanner;

public class Zadatak_2_09082019 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a, b, r;
		String x;
		System.out.println("Ukoliko zelite da izracunate povrsinu:");
		System.out.println(" -pravougaonika, unesite 'pravougaonik'.");
		System.out.println(" -kvadrata, unesite 'kvadrat'.");
		System.out.println(" -kruga, unesite 'krug'.");

		x = sc.nextLine();
		switch (x) {
		case "kvadrat":
			System.out.println("Unesite duzinu stranice a");
			a = sc.nextDouble();
			if (a > 0) {
				System.out.println("Povrsina kvadrata je " + a * a);
			} else {
				System.out.println("Duzina stranice mora biti veca od 0 ");
			} break;

		case "pravougaonik":
			System.out.println("Unesite duzinu stranice a");
			a = sc.nextDouble();
			System.out.println("Unesite duzinu stranice b");
			b = sc.nextDouble();
			if (a > 0 && b > 0) {
				System.out.println("Povrsina pravougaonika je " + a * b);
			} else {
				if (a <= 0) {
					System.out.println("Duzina stranice a mora biti veca od 0 ");
				} else if (b <= 0) {
					System.out.println("Duzina stranice b mora biti veca od 0 ");
				}
			} break;

		case "krug":
			System.out.println("Unesite poluprecnik r");
			r = sc.nextDouble();
			if (r > 0) {
				System.out.println("Povrsina kruga je " + r * r * 3.14);
			} else {
				System.out.println("Poluprecnik mora biti veci od 0 ");
			} break;
		default:
			System.out
					.println("Uneli ste nepredvidjenu vrednost.Unesite " + "'pravougaonik' ili 'kvadrat' ili 'krug'.");
			break;
		}

	}
}

/*
 * Napisati program koji u zavisnosti od unesenog stringa racuna povrsine
 * kvadrata, kruga ili pravougaonika. Ukoliko se unese “pravougaonik” nek pita
 * korisnika za 2 stranice i ispise povrsinu. Ukoliko se unese “krug” nek pita
 * korisnika za poluprecnik kruga i izracuna povrsinu. Ukoliko se unese
 * “kvadrat” nek pita korisnika za unos stranice i izracuna povrsinu kvadrata.
 */
