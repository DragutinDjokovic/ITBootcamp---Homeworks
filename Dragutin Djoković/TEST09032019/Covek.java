package cikaZuba;

public abstract class Covek {
	/*  Covek poseduje naziv, jedinstveni automatski identifikator, JMBG i novac. 
	 * Naziv i JMBG se zadaju prilikom kreiranja. Svi sadrzani podaci mogu samo da se dohvate. 
	 * Novac moze da se doda i da se oduzme, gde je povratna vrednost indikator uspesnosti oduzimanja/dodavanja novca. 
	 *  Moze da se sastavi tekstualni zapis u obliku: NAZIV[ID:JMBG:NOVAC]

				
		Stomatolog je covek kojeg je moguce ispisati u formatu: S_COVEK
		
		Ordinacija poseduje naziv, listu stomatologa, listu pacijenata, cenu usluge kao i stanje racuna. 
		Naziv i cena  se zadaju prilikom kreiranja i mogu samo da se dohvate. Moze da se dohvati/ukloni doktor. 
		Moze da se dohvati/ukloni pacijent. Moze da se dohvati broj pacijenata/doktora. 
		Moze da se naplati usluga pacijentima, ali ukoliko neki pacijent ne poseduje dovoljno 
		novca ispisuje se poruka: “PACIJENT ide u zatvor”. Ordinacija takodje moze da isplati platu stomatolozima u 
		zadatom iznosu, a povratna vrednost je indikator da li je plata uspesno isplacena. Moze da se sastavi 
		tekstualni opis:
		NAZIV:CENA
		DOKTORI
		Doktor 0
		Doktor 1
		.
		.
		PACIJENTI
		Pacijent 0
		Pacijent 1
		Pacijent 2
		
		..
		
		Napisati i glavni program koji prikazuje sve funkcionalnosti klasa.
		.

	 */
			private String naziv;
			private int UID=1;
			private  String jmbg;
			private int novac;
			private int id;
			public Covek(String naziv, String jmbg) {
				this.naziv = naziv;
				id=UID++;
				this.jmbg = jmbg;
				
			}
			public String getNaziv() {
				return naziv;
			}
			public String getJmbg() {
				return jmbg;
			}
			public int getNovac() {
				return novac;
			}
			public int getId() {
				return id;
			}
			
			public void dodajNovac(int novac) {
				if (novac > 0) {
					this.novac += novac;
				}
			}

			public void oduzmiNovac(int naplata) {
				if (novac > 0 && novac > naplata) {
					this.novac -= novac;
				}
			}
			
			@Override
			public String toString() {
				StringBuilder sb = new StringBuilder();
				sb.append(getNaziv()).append("[").append(getId()).append(":").append(getJmbg()).append(":").append(getNovac()).append("]");
				return sb.toString();
			}
			
			
}
/*
	public void dodajNovac(int novac) {
		if(novac>0) {
			pare+=novac;
		}
	}
	public void oduzmiNovac(double novac) {
		if(novac>0 && pare>=novac) {
			pare-=novac;
		}
*/