package domein;

import java.io.Serializable;

public class Bromfiets implements Tweewieler, Serializable {
	private char klasse;
	private String nummerplaat;
	
	public Bromfiets() {
		setKlasse('A');
		setNummerplaat("S-AAA-001");
	}
	
	
	private void setKlasse(char klasse) {
		this.klasse = klasse;
	}
	
	private void setNummerplaat(String nummerplaat) {
		String REGEX = "";
		
		if (klasse == 'A')
			REGEX = "(S\\-A)[A-Z]{2}[0-9]{3}";
		
		if (klasse == 'B')
			REGEX = "(S\\-B)[A-Z]{2}[0-9]{3}";
		
		else REGEX = "(S\\-P)[A-Z]{2}[0-9]{3}";
		
		if (nummerplaat.matches(REGEX))		
			this.nummerplaat = nummerplaat;
		else throw new IllegalArgumentException("Nummerplaats is niet conform");
	}


	public Bromfiets(char klasse, String nummerplaat) {
		super();
		this.klasse = klasse;
		this.nummerplaat = nummerplaat;
	}
	
	public boolean isElektrische() {
		return false;
	}


	@Override
	public double berekenMilieubijdrageVoorTweewieler() {
		if (klasse == 'A')
			return 30.0;
		
		if (klasse == 'B')
			return 30.0;
		
		else return 20.0;
		
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + klasse;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bromfiets other = (Bromfiets) obj;
		if (klasse != other.klasse)
			return false;
		return true;
	}
	
	
	
}
