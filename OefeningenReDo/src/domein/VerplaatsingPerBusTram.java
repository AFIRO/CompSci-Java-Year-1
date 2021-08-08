package domein;

public class VerplaatsingPerBusTram extends Verplaatsing{
	private int lijnnr;
	private boolean bus, stadslijn;
	private static final double PRIJS_PER_HALTE = 0.32;
	
	public VerplaatsingPerBusTram(String van, String naar, double aantalKm, int lijnnr, boolean bus, boolean stadlijn) {
 	super(van, naar, aantalKm);
 	this.setLijnnr(lijnnr);
 	this.setBus(bus);
 	this.setLijnnr(lijnnr);
 	this.setStadslijn(stadlijn);
	}
	
	public int getLijnrn() {
		return lijnnr;
	}
	
	public boolean getBus() {
		return bus;
	}
	
	public boolean getStadslijn() {
		return stadslijn;
	}
	
	private void setBus(boolean bus) {
		this.bus = bus;
	}
	
	private void setStadslijn(boolean stadslijn) {
		this.stadslijn = stadslijn;
	}
	
	private void setLijnnr(int lijnnr) {
		if (lijnnr <=0) {throw new IllegalArgumentException("Lijnnr moet strikt positief zijn.");}
		this.lijnnr = lijnnr;
	}
	
	public double berekenPrijs() {
		double prijs = Math.ceil(this.getAantalKm()) * PRIJS_PER_HALTE * 2;
		if (this.getStadslijn()) {return (prijs*0.8);}
		else return prijs;
	}
	
	public String toString() {
		String middel;
		if (this.getBus()) {middel = "stadsbus";}
		else  middel = "stadstram";
		return String.format("%s met %s %d.\nKosten voor deze verplaatsing: € %.2f", super.toString(),middel, this.getLijnrn(),this.berekenPrijs());
	}
}
