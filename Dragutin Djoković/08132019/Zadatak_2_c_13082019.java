package n42;

import java.util.Scanner;

public class Zadatak_2_c_13082019 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k, z = 0, n;
		System.out.println("Unesi k");
		k = sc.nextInt();
		System.out.println("Unesi n");
		n = sc.nextInt();

		if (k >= n) {
			System.out.println("k mora biti manje od n");
		} else {
			while (k < n) {
				z += k;
				k++;
			}
			System.out.println("Zbir od k do n je " + z);
		}

	}

}

/*
 * c) Napisati program sabrati sve brojeve od k do n (k i n uneti preko
 * konzole). Program treba da ispise zbir.
 */