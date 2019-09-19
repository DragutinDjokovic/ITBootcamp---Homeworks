package ucionica;

public class Polaznik {
	/*Napraviti paket ucionica.
	*Unutar paketa ucionica, pisati klase.

	*Polaznik  ima ime i prezime koje se zadaje prilikom kreiranja polaznika. 
	*Polaznik poseduje i identifikacioni broj  koji se moze dohvatiti. 
	*Ime i prezime polaznika se moze dohvatiti ali ne i postaviti. Vozac se ispisuje u obliku: IME_PREZIME{ID}.	
	*/		
	private static int UID=0;
	
	private String ime, prezime; //get
	private int id=++UID; //get
	
	public Polaznik(String ime, String prezime, int id) {
		this.ime=ime;
		this.prezime=prezime;
		id=UID;
	}
	
	public String getIme() {
		return ime;
	}
	
	public String getPrezime() {
		return prezime;
	}
	public int getId() {
		return id;
	}
	
	public String ispisi() {
		return ime + " " + prezime + " " + "{" + id + "}";
	}
}
