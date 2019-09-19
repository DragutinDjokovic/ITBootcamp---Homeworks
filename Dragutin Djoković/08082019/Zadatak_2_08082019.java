package pp;

import java.util.Scanner;

public class Zadatak_2_08082019 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double O, P, a, b;

		System.out.println("Dobrodosli, hajde da izracunamo obim i povrsinu pravougaonika...");
		System.out.println("Unesite vrednost stranice a: ");
		a = sc.nextDouble();

		System.out.println("Unesite vrednost stranice b:");
		b = sc.nextDouble();
		O = 2*a+2*b;
		P = a * b;
		System.out.println("Obim pravougaonika sa zadatim parametrima je: " + O);
		System.out.println("Povrsina pravougaonika sa zadatim parametrima je: "+P);
	}
}