package domein;



public class Voorwerp {
	private final String naam;
	private double gewicht;
	private int niveau;
	
	public Voorwerp(String naam, double gewicht, int niveau) {
		this.setGewicht(gewicht);
		this.setNiveau(niveau);
		if (this.controleerNaam(naam)) {this.naam=naam;}
		else {throw new IllegalArgumentException("Naam mag niet leeg zijn");}
	}
	
	public Voorwerp(String naam, double gewicht) {
		this.setGewicht(gewicht);
		this.setNiveau(1);
		if (this.controleerNaam(naam)) {this.naam=naam;}
		else {throw new IllegalArgumentException("Naam mag niet leeg zijn");}
	}
	
	private boolean controleerNaam(String naam) {
		if (naam == null || naam == "") {return false;}
		else return true;
		
	}
	
	
	private void setGewicht(double gewicht) {
		if (gewicht<=0 || gewicht>1000) {throw new IllegalArgumentException("Gewicht klopt niet");}
		this.gewicht = gewicht;
	}
	
	private void setNiveau(int niveau) {
		if (niveau<=0 || niveau>10) {throw new IllegalArgumentException("Niveau klopt niet");}
		this.niveau = niveau;

	}
	
	public double getGewicht() {
		return gewicht;
	}
	
	public String getNaam() {
		return naam;
	}
	
	public int getNiveau() {
		return niveau;
	}

	public String toString() {
		String output= this.getClass().getSimpleName() + " "+ this.getNaam() + " met een gewicht " + String.format("%.3f kg", this.getGewicht()) + " uit niveau " + this.getNiveau();
		return output;
	}
	
}
