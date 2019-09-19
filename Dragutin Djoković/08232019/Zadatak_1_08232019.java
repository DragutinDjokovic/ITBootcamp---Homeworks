package n5domaci;

import java.util.Scanner;

public class Zadatak_1_08232019 {

	public static void main(String[] args) {
		/*
		 * Napisati program koji ucitava ceo broj n. Taj broj n se prosledjuje metodi
		 * koja formira i vraca ceo broj koji predstavlja inverzan broj. Glavni program
		 * nakon toga ispisuje taj inverzan broj.
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesi n: ");
		int n = sc.nextInt();
		System.out.println("Inverzan broj broju n je broj: " + inver(n));
	}

	public static int inver(int x) {
		int inv = 0;
		
			while (x != 0) {
				
			int c = x % 10;
			inv *= 10;
			inv += c;
			x /= 10;
		}
		return inv;
	}
}
