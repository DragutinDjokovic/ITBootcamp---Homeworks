package ucionica;

public class Laptop {

	/*
	 * Laptop poseduje polaznika i marku koji se zadaju prilikom kreiranja. Marka
	 * moze samo da se dohvati. Laptop takdje moze da menja polaznika ili da ostane
	 * bez polaznika. Moze da se ispise u obliku: MARKA{POLAZNIK}
	 */

	private String marka; // get,
	private Polaznik polaznik;// get set

	public Laptop(String marka) {
		this.marka = marka;
		polaznik = null;
	}

	public String getMarka() {
		return marka;
	}

	public Polaznik getPolaznik() {
		return polaznik;
	}

	public void setVlasnik(Polaznik polaznik) {
		this.polaznik = polaznik;
	}

	public void resetPolaznik() {
		polaznik = null;
	}

	public String ispisi() {

		String p;
		if (polaznik == null) {
			p = "nema polaznika";
		} 
		else {
			p = polaznik.ispisi();
		}
		return marka + "{" + p + "}";
	}

}
