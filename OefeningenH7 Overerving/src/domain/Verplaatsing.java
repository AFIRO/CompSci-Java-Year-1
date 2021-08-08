package domain;

public class Verplaatsing {
private String van;
private String naar;
private double aantalKm;

public Verplaatsing(String van,String naar,double aantalKm) {
	  setVan(van);
	  setNaar(naar);
	  setAantalKm(aantalKm);
}

private void setVan(String van) {
	if (van=="") throw new IllegalArgumentException("Van mag niet leeg zijn!");
	else this.van = van;
}

private void setNaar(String naar) {
	if (naar=="") throw new IllegalArgumentException("Naar mag niet leeg zijn!");
	else this.naar = naar;
}

private void setAantalKm(double aantalKm) {
	if (aantalKm<0) throw new IllegalArgumentException("Aantal Kilometer mag niet negatief zijn");
	else this.aantalKm=aantalKm;
}

public String getVan() {
	return van;
}

public String getNaar() {
	return naar;
}

public double getAantalKm() {
	return aantalKm;
}

public String toString() {
	return "Verplaatsing van " + this.van + " naar " + this.naar;
}
}
