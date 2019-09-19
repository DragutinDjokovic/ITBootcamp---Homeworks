package fax;

public class GlavniFax {

	public static void main(String[] args) {
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

		Student s1 = new Student("Petar", "Petrovic", 1989, "A001", 3, 8.1);
		Student s2 = new Student("Mitar", "Mitrovic", 1996, "C073", 2, 9.0);
		Student s3 = new Student("Janko", "Jankovic", 1997, "E077", 4, 8.9);

		Profesor p1 = new Profesor("Jovan", "Jovicic", 1971, "Dr.");
		Profesor p2 = new Profesor("Stojan", "Stojanovic", 1983, "Mr.");
		
		p1.dodajPredmet("Friziranje");
		p1.dodajPredmet("Hemija");
		p2.dodajPredmet("Matematika");
		p2.dodajPredmet("Osnove programiranja");
		p1.dodajPredmet("Fizika");
		p1.oduzmiPredmet("Friziranje");
		

		System.out.println(s1.ispisi());
		System.out.println(s2.ispisi());
		System.out.println(s3.ispisi());

		System.out.println(p1.ispisi());
		System.out.println(p2.ispisi());

	}

}
