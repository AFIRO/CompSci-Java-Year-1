package domain;

public class VerplaatsingPerBusTram extends Verplaatsing{
	private int lijnnr;
	private boolean bus;
	private boolean stadslijn;
	private static final double PRIJS_PER_HALTE = 0.32;
	
	public VerplaatsingPerBusTram(String van,String naar,double aantalKm,int lijnnr, boolean bus, boolean stadslijn) {
		super(van, naar, aantalKm);
		setLijnnr(lijnnr);
		setBus(bus);
		setStadslijn(stadslijn);
		
	}
	
	public int getLijnnr() {
		return lijnnr;
	}
	
	public boolean getBus() {
		return bus;
	}
	
	public boolean getStadslijn() {
		return stadslijn;
	}
	
	private void setLijnnr(int lijnnr) {
		if (lijnnr <0) throw new IllegalArgumentException("LijnNR klopt niet!");
		else this.lijnnr=lijnnr;
	}

	private void setBus(boolean bus) {
		this.bus=bus;
	}
	
	private void setStadslijn(boolean stadslijn) {
		this.stadslijn=stadslijn;
	}
	
	public double berekenPrijs() {
		int aantalHaltes=(int) Math.ceil(this.getAantalKm());
		if (stadslijn) return (2*aantalHaltes*PRIJS_PER_HALTE)*0.8;
		else return (2*aantalHaltes*PRIJS_PER_HALTE);
	}
	
	public String toString() {
		String t = null;
		if (bus) t= " met bus";
		if (stadslijn) t= " met stadstram";
		return super.toString() + t + " " + this.getLijnnr() +  "\n" + "Kosten voor deze verplaatsing: € " + String.format("%.2f", this.berekenPrijs());
	}
	
}
