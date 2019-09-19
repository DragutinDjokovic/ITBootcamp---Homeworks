package apstraktneKlase;

public class GlavniParcela {

	/*
	 * Napisati i glavni program koji kreira niz parcela koje mogu da budu ili sume
	 * ili njive i ispisuje njihov prinos u toku 3 godine.
	 */
	public static void main(String[] args) {
		Suma s1 = new Suma(40, 2, 5, 8);
		Suma s2 = new Suma(70, 2.5, 6, 7);
		Suma s3 = new Suma(65, 2.8, 6.5, 7);
		
		Njiva n1 = new Njiva(80, 5);
		Njiva n2 = new Njiva(75, 6);
		Njiva n3 = new Njiva(70, 5);
		
		System.out.println("Prinos parcele "+s1 + " iznosi "+s1.prinos(3)+" za 3 godine.");
		System.out.println("Prinos parcele "+s2 + " iznosi "+s2.prinos(3)+" za 3 godine.");
		System.out.println("Prinos parcele "+s3 + " iznosi "+s3.prinos(3)+" za 3 godine.");
		System.out.println("Prinos parcele "+n1 + " iznosi "+n1.prinos(3)+" za 3 godine.");
		System.out.println("Prinos parcele "+n2 + " iznosi "+n2.prinos(3)+" za 3 godine.");
		System.out.println("Prinos parcele "+n3 + " iznosi "+n3.prinos(3)+" za 3 godine.");

	}

}
