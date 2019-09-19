package fax;

public class Student extends Covek {
	/*Covek ima ime, prezime i godinu rodjenja. 
 	Ime i prezime mogu da se i dohvate i postave, dok godina rodjenja moze samo da se dohvati.
	Coveka ispisati u formatu: Ime_Prezime[godina rodjenja].
	Student je covek koji se kreira sa brojem indeksa i ima  trenutnu godinu studija i trenutni prosek. 
	Sva polja mogu samo da se dohvate. 
	Studenta ispisati u formatu: 
	Ime_Prezime[godina rodjenja] je student ___ (god studija) godine studija sa prosekom____ (trenutni prosek).
	Profesor je covek koji ima titulu i listu predmeta na kojima drzi nastavu. Predmeti mogu da se dodaju i oduzimaju iz liste.
	Profesora ispisati u formatu: Ime_Prezime[godina rodjenja] je ___(titula)  koji drzi nastavu na: <lista predmeta>.

	Napisati glavni program koji ce imati bar tri studenta i dva profesora.
 	*/
	
	private String brInd;//get
	private int trGS;//get
	private double tPro;//get
	
	public Student(String ime, String prezime, int godRodj, String brInd, int trGS, double tPro) {
		super(ime, prezime, godRodj);
		this.brInd = brInd;
		this.trGS = trGS;
		this.tPro = tPro;
	}
	public String getBrInd() {
		return brInd;
	}
	public int getTrGS() {
		return trGS;
	}
	public double gettPro() {
		return tPro;
	}
	public String ispisi() {
		String S="";
		S+=super.ispisi()+" je student "+trGS+" godina studija sa prosekom "+tPro;
		return S;
	}
	
	
	//Studenta ispisati u formatu: Ime_Prezime[godina
	//rodjenja] je student ___ (god studija) godine studija sa prosekom____
	// (trenutni prosek).
	
}
	
