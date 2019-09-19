package cikaZuba;

public class Stomatolog extends Covek {
	//Stomatolog je covek kojeg je moguce ispisati u formatu: S_COVEK
	public Stomatolog (String naziv, String jmbg) {
		super(naziv, jmbg);
	}		
		
	public char getOznaka() {
		return 'S';
	}
		
		
		@Override
		public String toString() {
			StringBuilder sb = new StringBuilder();
			sb.append(getOznaka()).append(super.toString());
			return sb.toString();
		}

	}


