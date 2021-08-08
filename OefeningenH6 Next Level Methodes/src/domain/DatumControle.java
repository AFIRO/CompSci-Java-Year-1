package domain;

public class DatumControle {
	
	private final int AANTALDAGEN[] = {0,31,28,31,30,31,30,31,31,30,31,30,31};
	
	public boolean controleerDatumDDMM(int datum) {
		int maand = datum%100;
		int dag = datum/100;
		boolean antwoord = true;
		if (maand <=0 || maand >12) {antwoord = false;}
		else if (dag<=0 || dag>AANTALDAGEN[maand-1]) {antwoord = false;}
		return antwoord;
		
	}

}
