package apstraktneKlase;

public class Suma extends Parcela{
	/*Suma je parcela koja ima zadate povrsinu koju zauzimaju stabla, prinos po zrelom stablu i period sazrevanja od zasada 
	do sece izrazen u celom broju godina. Oznaka vrste je S. 
	Prinos se ostvaruje formulom povrsina_parcele/povrsina_stabla*prinos_stabla*(godine/sazrevanje). 
	Tekstualni oblik je *Parcela:(povrsStabla,prinosSt,Period).
	Ovo se ostvaruje pozivom super.toString();
	*/
	
	public double poSt;//povrsina stabla
	private double prSt;//prinos stabla
	private double sazr;//sazrevanje
	public Suma(double povrsina, double poSt, double prSt, double sazr) {
		super(povrsina);
		this.poSt = poSt;
		this.prSt = prSt;
		this.sazr = sazr;
	}
	
	public char vrsta() {
		return 'S';
	}

	public double prinos (int godine) {
		return getPo()/poSt*prSt*(godine/sazr);
	}
	public String toString() {
		return super.toString()+":("+poSt+", "+prSt+", "+sazr+")";
	}
}
