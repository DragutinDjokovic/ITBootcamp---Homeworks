package apstraktneKlase;

public class Njiva extends Parcela {
	/*Njiva je parcela koja ima zadat godisnji prinos po kvadratnom metru. Prinos po kvadratnom metru moze da se promeni. 
	Oznaka vrste je N. Prinos njive se racuna po formuli: povrsina_parcele*prinosPoKvM. Tekstualni oblik je Parcela:PrinosPoKvM.
	*/
	
	private double prKvm;

	public Njiva(double povrsina, double prKvm) {
		super(povrsina);
		this.prKvm = prKvm;
	}
	public void promPrKvm(double prinos) {
		prKvm = prinos;
	}
	
	public char vrsta() {
		return 'N';
	}
	
	public double prinos(int godine) {
		return getPo()*prKvm*godine;
	}
	public String toString() {
		return super.toString()+":"+prKvm;
	}
	
}
