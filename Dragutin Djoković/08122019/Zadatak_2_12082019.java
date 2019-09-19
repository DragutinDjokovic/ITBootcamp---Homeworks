package cetvrtanedelja;

import java.util.Scanner;

public class Zadatak_2_12082019 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		int suma = 0;
		int proizvod = 1;
		int brojcanik= 0;

		System.out.println("Unesite n");
		n = sc.nextInt();

		while (brojcanik < n) 
			{
			if (brojcanik % 2 == 0) {
				suma += brojcanik;
				}
			
			else {
				proizvod *= brojcanik;
				
			}
			brojcanik+=1;
		}
		System.out.println("Suma je " + suma);
		System.out.println("Proizvod je " + proizvod);
		
	}

}

/*
 * Napisati program koji racuna sumu parnih brojeva i proizvod neparnih brojeva
 * od 0 do n. Koristiti jednu petlju.
 */
