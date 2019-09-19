package test;

import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {
		/*
		 * Napisati program koji unosi brojeve K, N, M. Program ispisuje brojeve od K do
		 * N ukljucujuci i N koji nisu deljivi brojem M. Proveriti da li je K manje od
		 * N. Ukoliko nije zameniti K i N tako da prethodni uslov bude tacan.
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Uneti pocetni broj K:");
		int K = sc.nextInt();
		System.out.println("Uneti zavrsni broj N:");
		int N = sc.nextInt();
		System.out.println("Uneti pocetni broj M:");
		int M = sc.nextInt();
		int Z;
		if (K > N) {
			Z = K;
			K = N;
			N = Z;
		}
		if (K < N) {
			for (int i = K; i <= N; i++) {
				if (i % M != 0) {
					System.out.print(i + ", ");
				}
			}
		}
	}
}
