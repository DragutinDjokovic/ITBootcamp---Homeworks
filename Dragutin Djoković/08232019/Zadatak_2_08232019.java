package n5domaci;

import java.util.Scanner;

public class Zadatak_2_08232019 {

	public static void main(String[] args) {
		/*
		 * Napisati program koji ucitava tri cela broja i metodu koja ispisuje brojeve
		 * od prvog do drugog (ukljucujuci i njih) koji su deljivi trecim
		 */
		Scanner sc = new Scanner(System.in);

		int[] niz = new int[3];
		System.out.println("Unesite tri cela broja: ");
		for (int i = 0; i < niz.length; i++) {
			niz[i] = sc.nextInt();
		}
		funkce(niz);

	}

	public static void funkce(int[] niz) {
		for (int i = niz[0]; i <= niz[1]; i++) {
			if (i % niz[2] == 0 && niz[2] != 0) {
				System.out.println(i);
			}
		}
	}
}
