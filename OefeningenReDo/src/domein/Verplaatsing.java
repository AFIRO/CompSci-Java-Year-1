package domein;

public class Verplaatsing {
	private String van, naar;
	private double aantalKm;
	
	public Verplaatsing(String van, String naar, double aantalKm) {
		this.setNaar(naar);
		this.setVan(van);
		this.setAantalKm(aantalKm);
	}
	
	private void setVan(String van) {
		if (van.isEmpty()) {throw new IllegalArgumentException("Van moet ingevuld zijn.");}
		this.van = van;
	}
	
	private void setNaar(String naar) {
		if (naar.isEmpty()) {throw new IllegalArgumentException("Naar moet ingevuld zijn.");}
		this.naar = naar;
	}
	
	public String getVan() {
		return van;
	}
	
	public String getNaar() {
		return naar;
	}
	
	private void setAantalKm(double aantalKm) {
		if (aantalKm<0) {throw new IllegalArgumentException("Aantal KM moet positief zijn");}
		this.aantalKm = aantalKm;
	}
	
	public double getAantalKm() {
		return aantalKm;
	}
	
	public String toString() {
		return String.format("Verplaatsing van %s naar %s", this.getVan(), this.getNaar());
	}

}
