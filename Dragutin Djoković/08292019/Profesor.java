package fax;

import java.util.ArrayList;

public class Profesor extends Covek {

	private ArrayList<String> predmeti;// get
	private String titula;// get

	public Profesor(String ime, String prezime, int godRodj, String titula) {
		super(ime, prezime, godRodj);
		this.predmeti = new ArrayList<String>();
		this.titula = titula;

	}

	public String getTitula() {
		return titula;
	}

	public void dodajPredmet(String predmet) {

		predmeti.add(predmet);
	}

	public void oduzmiPredmet(String predmet) {
		predmeti.remove(predmet);

	}

	public String ispisi() {
		String a = "";
		a += super.ispisi();
		a += " je " + "(" + titula + ") " + "koji drzi nastavu na: ";
		for (String b : predmeti) {
			a += b + "|";
		}
		return a;
	}

}

/*
 * Covek ima ime, prezime i godinu rodjenja. Ime i prezime mogu da se i dohvate
 * i postave, dok godina rodjenja moze samo da se dohvati. Coveka ispisati u
 * formatu: Ime_Prezime[godina rodjenja]. Student je covek koji se kreira sa
 * brojem indeksa i ima trenutnu godinu studija i trenutni prosek. Sva polja
 * mogu samo da se dohvate. Studenta ispisati u formatu: Ime_Prezime[godina
 * rodjenja] je student ___ (god studija) godine studija sa prosekom____
 * (trenutni prosek). Profesor je covek koji ima titulu i listu predmeta na
 * kojima drzi nastavu. Predmeti mogu da se dodaju i oduzimaju iz liste.
 * Profesora ispisati u formatu: Ime_Prezime[godina rodjenja] je ___(titula)
 * koji drzi nastavu na: <lista predmeta>.
 * 
 * Napisati glavni program koji ce imati bar tri studenta i dva profesora.
 */
