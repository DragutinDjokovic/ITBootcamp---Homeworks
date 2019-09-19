package ucionica;

public class GlavniUcionica {

	private static int id;

	public static void main(String[] args) {
		Polaznik p1 = new Polaznik("Prvi", "Prvic", id);
		Polaznik p2 = new Polaznik("Drugi", "Drugic", id);
		Polaznik p3 = new Polaznik("Treci", "Trecic", id);

		Laptop m1 = new Laptop("Toshiba ");
		Laptop m2 = new Laptop("HP ");
		Laptop m3 = new Laptop("Asic ");

		m1.setVlasnik(p1);
		m2.setVlasnik(p2);

		/*System.out.println(p1.getIme() + "_" + p1.getPrezime() + "{" + p1.getId() + "}");
		System.out.println(p2.getIme() + "_" + p2.getPrezime() + "{" + p2.getId() + "}");
		System.out.println(p3.getIme() + "_" + p3.getPrezime() + "{" + p3.getId() + "}");
		System.out.println();
		System.out.println(m1.getMarka() + "{" + m1.getPolaznik() + "}");
		System.out.println(m2.getMarka() + "{" + m2.getPolaznik() + "}");
		System.out.println(m3.getMarka() + "{" + m3.getPolaznik() + "}");
		*/
		
		System.out.println(p1.ispisi());
		System.out.println(p2.ispisi());
		System.out.println(p3.ispisi());
		System.out.println();
		System.out.println(m1.ispisi());
		System.out.println(m2.ispisi());
		System.out.println(m3.ispisi());
	}

}
