package domaci4n;

import java.util.Scanner;

public class Zadatak_3_08152019 {

	public static void main(String[] args) {
		// Napravi program koji ce na izlazu izbaciti sliku pravougaonika od zvezdica:
		Scanner sc = new Scanner(System.in);
		System.out.println("Ukucajte koliko redova * hocete:");
		int red = sc.nextInt();
		System.out.println("Ukucajte koliko kolona * hocete:");
		int kolona = sc.nextInt();

		for (int i = 0; i < red; i++) {

			for (int j = 0; j < kolona; j++) {

				System.out.print("*");

			}
			System.out.println();
		}
	}
}
