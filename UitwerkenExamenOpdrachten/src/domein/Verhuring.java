package domein;

import java.time.LocalDateTime;

public class Verhuring {
	private LocalDateTime van,tot;
	private Fiets fiets;

	public boolean bevatElektrischeFiets() {
		if (this.getFiets()) {return true;}
		else return false;
	}
	
	public Fiets getFiets() {
		return fiets;
	}
}
