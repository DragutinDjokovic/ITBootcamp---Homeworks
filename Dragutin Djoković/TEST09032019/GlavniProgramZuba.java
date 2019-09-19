package cikaZuba;

public class GlavniProgramZuba {

	public static void main(String[] args) {

		Covek c1 = new Pacijent("Pera Peric", "0001");
		Covek c2 = new Pacijent("Milan Milanic", "0002");
		Covek c3 = new Pacijent("Svetozar Miletic", "0003");
		Covek c4 = new Pacijent("Janko Jancic", "0004");
		Covek c5 = new Stomatolog("Teo Jan", "0005");
		Covek c6 = new Stomatolog("Obren Obrenic", "0006");
		Covek c7 = new Stomatolog("Cane Lazic", "0007");
		Covek c8 = new Stomatolog("Dusan Lazic", "0008");

		Covek grupaPacijenti[] = { c1, c2, c3, c4 };
		Covek grupaStomatolozi[] = { c5, c6, c7, c8 };

		// System.out.println(p1.getId());

		Ordinacija o1 = new Ordinacija("Zubarstvo", 4500);
		{

		}
		o1.dodajPacijenta(c1);
		o1.dodajPacijenta(c2);
		o1.dodajPacijenta(c3);
		o1.dodajPacijenta(c4);
		o1.dodajStomatologa(c5);
		o1.dodajStomatologa(c6);
		o1.dodajStomatologa(c7);
		o1.dodajStomatologa(c8);
		
		
		
		//for (Covek p : grupaPacijenti) {
		//	o1.dodajPacijenta(c);
		//}

		//for (Covek s : grupaStomatolozi) {
		//	o1.dodajStomatologa(c);
		//}
		
		
		System.out.println(o1);	
		}
}
