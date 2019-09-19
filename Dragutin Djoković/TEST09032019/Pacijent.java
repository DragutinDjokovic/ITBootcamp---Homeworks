package cikaZuba;

public class Pacijent extends Covek{
	//Pacijent je covek kojeg je moguce ispisati u formatu: P_COVEK
		
	
	public Pacijent(String naziv, String jmbg) {
		super(naziv, jmbg);
	}
	
		
	public char getOznaka() {
		return 'P';
	}
	
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getOznaka()).append(super.toString());
		return sb.toString();
	}
}
