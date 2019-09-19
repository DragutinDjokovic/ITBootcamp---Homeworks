package cikaZuba;

import java.util.ArrayList;
import java.util.List;

public class Ordinacija {
	/*
	 * Ordinacija poseduje naziv, listu stomatologa, listu pacijenata, cenu usluge
	 * kao i stanje racuna. Naziv i cena se zadaju prilikom kreiranja i mogu samo da
	 * se dohvate. Moze da se dohvati/ukloni doktor. Moze da se dohvati/ukloni
	 * pacijent. Moze da se dohvati broj pacijenata/doktora.
	 * 
	 * Moze da se naplati usluga pacijentima, ali ukoliko neki pacijent ne poseduje
	 * dovoljno novca ispisuje se poruka: “PACIJENT ide u zatvor”. Ordinacija
	 * takodje moze da isplati platu stomatolozima u zadatom iznosu, a povratna
	 * vrednost je indikator da li je plata uspesno isplacena. Moze da se sastavi
	 * tekstualni opis: NAZIV:CENA DOKTORI Doktor 0 Doktor 1
	 */
	private String naziv;
	private List<Covek> stomatolozi = new ArrayList<>();
	private List<Covek> pacijenti= new ArrayList<>();
	private int racun;

	public Ordinacija(String naziv, int racun) {
		this.naziv = naziv;
		this.racun = racun;
		this.pacijenti = pacijenti;
		this.stomatolozi= stomatolozi;
		
	}

	public String getNaziv() {
		return naziv;
	}

	public void dodajPacijenta(Covek p) {

		pacijenti.add(p);

	}

	public void izbaciPacijenta(Covek p) {
		pacijenti.remove(p);

	}

	public void dodajStomatologa(Covek s) {

		stomatolozi.add(s);

	}

	public void izbaciStomatologa(Covek s) {
		stomatolozi.remove(s);

	}
	
	public int getRacun() {
		return racun;
	}

	public void naplati() {
		for (Covek p : pacijenti) {
			p.oduzmiNovac(racun);
		}
	}

	public int getBrPac() {
		return pacijenti.size();
	}
	public int getBrStomatologa() {
		return stomatolozi.size();
	}
	
}
