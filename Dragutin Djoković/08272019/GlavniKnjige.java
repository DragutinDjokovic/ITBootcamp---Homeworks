package domaciN61;

public class GlavniKnjige {

	public static void main(String[] args) {
		// Napisati glavni program koji kreira tri knjige i ispisuje sve njihove
		// podatke.

		Knjige k1 = new Knjige("Majstor i Margarita", "Vladimir Nobokov", 357);
		Knjige k2 = new Knjige("Fama o biciklistima", "Svetislav basara", 301);
		Knjige k3 = new Knjige("Pinokio", "Karlo Kolodi", 96);
		k1.setGodIzd(1956);
		k2.setGodIzd(1986);
		k3.setGodIzd(1883);

		System.out.println(k1.getNaziv() + " | " + k1.getAutor() + " | " + k1.getBrStr() + " | " + k1.getGodIzd());
		System.out.println(k2.getNaziv() + " | " + k2.getAutor() + " | " + k2.getBrStr() + " | " + k2.getGodIzd());
		System.out.println(k3.getNaziv() + " | " + k3.getAutor() + " | " + k3.getBrStr() + " | " + k3.getGodIzd());
	}

}
