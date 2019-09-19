package domaci4n;

import java.util.Scanner;

public class Zadatak_2_08152019 {

	public static void main(String[] args) {
		// Napisati program koji ce ispisati n brojeva Fibonacijevog niza.
		// (Na internetu istraziti sta je Fibo(z)nacijev niz!!!)
		Scanner sc = new Scanner(System.in);
		System.out.println("Koliko brojeva fibonacijevog niza zelite?");
		int n = sc.nextInt();
		int a = 0, b = 1, sum = 0;
		for (int i = 0; i < n ; i++) {
			System.out.print(a + ", ");
			sum = a + b;
			a = b;
			b = sum;
			
		}
	}
}