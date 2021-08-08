package domein;

import Exceptions.BuitenBereikException;

public class Thermometer {
	private static final int	ONDERGRENS = 14, 
								BOVENGRENS = 104, 
								NULWAARDE = 32;
		private int aantalGraden;
	
	public Thermometer() {
		setAantalGraden(NULWAARDE);
	}
	
	public Thermometer(int aantalGraden) {
		setAantalGraden(aantalGraden);
		
	}
	
	private void setAantalGraden(int aantalGraden) {
		if (aantalGraden < ONDERGRENS | aantalGraden > BOVENGRENS)
			throw new IllegalArgumentException();
		this.aantalGraden = aantalGraden;
	}
	
	public int converteerNaarCelcius() {
		return ((this.aantalGraden-32) * 5)/9;
		
	}
	
	public void stelAantalGradenIn(String invoer) {
		Integer tussen = Integer.valueOf(invoer);
		if (tussen.intValue() < 14  | tussen.intValue() >104) throw new BuitenBereikException("Input niet binnen interval");
		setAantalGraden(tussen.intValue());
		
	}

}
