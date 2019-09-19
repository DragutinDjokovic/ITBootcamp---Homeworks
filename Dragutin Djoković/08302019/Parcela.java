package apstraktneKlase;

public abstract class Parcela {
	/*Parcela ima jedinstven automatski generisan celobrojan identifikator i zadatu povrsinu(u kvadratnim metrima) prilikom kreiranja.
	 Mogu da joj se dohvate sadrzani podaci, kao i jednoslovna vrsta(char). 
	 Moze da joj se odredi prinos u periodu zadatom brojem godina. Moze da se sastavi tekstualni opis u obliku VRSTA-ID[POVRSINA].

		

		

		Napisati i glavni program koji kreira niz parcela koje mogu da budu ili sume ili njive 
		i ispisuje njihov prinos u toku 3 godine.

	 */
	private static int UID=0;
	private int id=++UID;
	private double povrsina;
	
	
	
	public Parcela(double povrsina) {
		this.povrsina=povrsina;
	}
	
	public int getID(){
		return id;
	}
	public double getPo() {
		return povrsina;
	}
	public abstract char vrsta(); 
	public abstract double prinos(int godine);
	public String toString() {
		return vrsta()+"-"+id+"["+povrsina+"]";
	}
}
