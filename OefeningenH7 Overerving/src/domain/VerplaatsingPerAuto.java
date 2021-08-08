package domain;

public class VerplaatsingPerAuto extends Verplaatsing{
	private double benzineprijs;
	private double verbruik;
	
	public double getBenzineprijs() {
		return benzineprijs;
	}
	
	public double getVerbuik() {
		return verbruik;
	}
	
	private void setBenzineprijs(double benzineprijs) {
		if (benzineprijs<0.50||benzineprijs>2.00) throw new IllegalArgumentException("Benzineprijs klopt niet!");
		else this.benzineprijs=benzineprijs; 
	}

	private void setVerbruik(double verbruik) {
		if (verbruik<0.02||benzineprijs<0.07) throw new IllegalArgumentException("Verbruik klopt niet!");
		else this.verbruik=verbruik; 
	}

	public VerplaatsingPerAuto(String van, String naar, double aantalKm, double benzineprijs, double verbruik) {
	super(van, naar, aantalKm);
	setBenzineprijs(benzineprijs);
	setVerbruik(verbruik);
	}
	
	public double berekenPrijs() {
		return this.verbruik*this.benzineprijs*this.getAantalKm()*2;
	}
	
	public String toString() {
		return super.toString() + " per auto.\n" + "Kosten voor deze verplaatsing: € " +this.berekenPrijs();
	}
}
