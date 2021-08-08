package domain;

import exceptions.BuitenBereikException;

public class thermometer {
	private int aantalGraden;
	private final static int  ONDERGRENS = 14;
	private final static int  BOVENGRENS = 104;
	private final static int  NULWAARDE = 32;

	

	private void setAantalGraden(int aantalGraden) throws BuitenBereikException {
		if (aantalGraden < ONDERGRENS || aantalGraden > BOVENGRENS) 
			throw new BuitenBereikException();
		this.aantalGraden = aantalGraden;
	}



	public thermometer(int aantalGraden) {
		setAantalGraden(aantalGraden);
	}

	
	public int getAantalGraden() {
		return aantalGraden;
	}



	public thermometer() {
		setAantalGraden(NULWAARDE);
	}
	
	public int converteerNaarCelsius() {
		
		return 5 * (this.getAantalGraden()-32) /9 ;
		
	}
	
	public int getBOVENGRENS() {
		return BOVENGRENS;
	}
	
	public int getONDERGRENS() {
		return ONDERGRENS;
	}
	
	public static int getNulwaarde() {
		return NULWAARDE;
	}

	
	
}
