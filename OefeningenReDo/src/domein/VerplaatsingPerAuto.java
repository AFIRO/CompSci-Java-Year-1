package domein;

public class VerplaatsingPerAuto extends Verplaatsing{
	private double benzineprijs,verbruik;
	
	public VerplaatsingPerAuto(String van, String naar, double aantalKm, double bezineprijs, double verbruik) {
		super(van, naar, aantalKm);
		this.setBenzineprijs(bezineprijs);
		this.setVerbruik(verbruik);
		
	}
	
	public double getBenzineprijs() {
		return benzineprijs;
	}
	
	public double getVerbruik() {
		return verbruik;
	}
	
	private void setBenzineprijs(double benzineprijs) {
		if (benzineprijs <0.5 || benzineprijs > 2.00) {throw new IllegalArgumentException("BZ moet tussen 0.5 en 2 euro per liter liggen");}
		this.benzineprijs = benzineprijs;
	}
	
	private void setVerbruik(double verbruik) {
		if (verbruik <0.02 || verbruik > 0.07 )  {throw new IllegalArgumentException("VB moet tussen 0.02 en 0.07 liter per km liggen");}
		this.verbruik = verbruik;
	}
	
	public double berekenPrijs() {
		return this.getVerbruik() * this.getBenzineprijs() * this.getAantalKm() * 2;
	}
	
	public String toString() {
		return String.format("%s per auto.\nKosten voor deze verplaatsing: € %.2f", super.toString(), this.berekenPrijs());
	}

}
