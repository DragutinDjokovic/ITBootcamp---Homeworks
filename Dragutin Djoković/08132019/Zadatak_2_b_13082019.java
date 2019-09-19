package n42;

import java.util.Scanner;

public class Zadatak_2_b_13082019 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 1, z = 0, n;
		System.out.println("Unesi n");
		n = sc.nextInt();
		if (a >= n) {
			System.out.println("n mora biti vece od 1");
		} else {

			while (a < n) {
				z += a;
				a++;

			}
			System.out.println("Zbir od 1 do n je " + z);
		}
	}

}
/*
 * b) Napisati program koji ce sabrati sve brojeve od 1 do n (n uneti preko
 * konzole). Program treba da ispise zbir.
 */