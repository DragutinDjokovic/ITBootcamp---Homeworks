package domaciN61;

public class Knjige {
	// Napisati klasu Knjige koja ima sledeca polja: naziv knjige, autora, broj
	// strana,
	// godinu izdanja. Sva polja mogu da se dohvate, a godina izdanja moze i da se
	// postavi.
	// Napisati glavni program koji kreira tri knjige i ispisuje sve njihove
	// podatke.

	private String naziv, autor; // get, get
	private int brStr, godIzd; // get, get set

	public Knjige(String naziv, String autor, int brStr) {
		this.naziv = naziv;
		this.autor = autor;
		this.brStr = brStr;
	}

	public String getNaziv() {
		return naziv;
	}

	public String getAutor() {
		return autor;
	}

	public int getBrStr() {
		return brStr;
	}

	public int getGodIzd() {
		return godIzd;
	}

	public void setGodIzd(int godIzd) {
		this.godIzd = godIzd;
	}

}
