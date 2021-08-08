package domain;

public class Voorwerp {
private final String naam;
private double gewicht;
private int niveau;

public Voorwerp(String naam,double gewicht, int niveau) {
	if (naam=="" || naam==null) throw new IllegalArgumentException("Naam mag niet leeg zijn.");
	else this.naam = naam;
	setGewicht(gewicht);
	setNiveau(niveau);
}

public Voorwerp(String naam,double gewicht) {
	if (naam=="" || naam==null) throw new IllegalArgumentException("Naam mag niet leeg zijn.");
	else this.naam = naam;
	setGewicht(gewicht);
	this.niveau=1;
}

public String getNaam() {
	return naam;
}

public double getGewicht() {
	return gewicht;
}

public int getNiveau() {
	return niveau;
}

private void setGewicht(double gewicht) {
	if (gewicht<0||gewicht>1000) throw new IllegalArgumentException("Gewicht moet positief en lager dan 1000kg zijn");
	else this.gewicht=gewicht;
}

private void setNiveau(int niveau) {
	if (niveau<=0 ||niveau>10) throw new IllegalArgumentException("Niveau moet tussen 1 en 10 zijn");
	else this.niveau=niveau;
}

public String toString() {
	
	String gewicht = String.format("%.3f", this.getGewicht());
	return this.getClass().getSimpleName() +" "+ this.getNaam()+" met een gewicht van "+ gewicht + " kg uit niveau " + this.getNiveau() + "." ;
	
}
}
