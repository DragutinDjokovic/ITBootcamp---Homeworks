package domaci4n;

import java.util.Scanner;

public class Zadatak_1_08152019 {

	public static void main(String[] args) {
		// Napisati program - meni - za izracunavanje i ispis povrsina 
		//geometrijskih tela (kocke, kvadra, valjka, lopte). Koristiti do while 
		//petlju i switch grananje. Za izlaz koristiti nulu (0).
		Scanner sc = new Scanner(System.in);
		double kocka,kvadar,valjak,lopta, a, b, c, r, h;
		
		
		
		
		int izbor;
		do {
		System.out.println("Ukucajte:");
		System.out.println("1 - Za izracunavanje povrsine kocke.");
		System.out.println("2 - Za izracunavanje povrsine kvadra.");
		System.out.println("3 - Za izracunavanje povrsine valjka.");
		System.out.println("4 - Za izracunavanje povrsine lopte.");
		System.out.println("0 - Za izlaz.");
		izbor = sc.nextInt();
		switch(izbor) {
		case 1:
			System.out.println("Unesite duzinu stranice kocke - a");
			a=sc.nextDouble();
			kocka = a * a * 6;
			System.out.println("Povrsina kocke je"+kocka);
			break;
			
		case 2: 
			System.out.println("Unesite duzinu prve stranice kvadra - a");
			a=sc.nextDouble();
			System.out.println("Unesite duzinu druge stranice kvadra - b");
			b=sc.nextDouble();
			System.out.println("Unesite duzinu trece stranice kvadra - c");
			c=sc.nextDouble();
			kvadar = a*b*2+a*c*2+b*c*2;
			System.out.println("Povrsina kocke je"+kvadar);
			break;
			
		case 3: 
			System.out.println("Unesite poluprecnik valjka  - r");
			r=sc.nextDouble();
			System.out.println("Unesite visinu valjka - h");
			h=sc.nextDouble();
			valjak = r * r * 3.14 * h+2*(r*r*2*3.14);
			System.out.println("Povrsina kocke je"+valjak);
			break;
			
		case 4:			
			System.out.println("Unesite poliprecnik lopte  - r");
			r=sc.nextDouble();
			lopta = r * r * 4 * 3.14;
			System.out.println("Povrsina kocke je"+lopta);
			break;
		default:
			System.out.println("Los je unos!");
			break;
		case 0:
			System.out.println("Izlaz iz programa!");
			break;
		}		
		}while(izbor != 0);
	

}
}