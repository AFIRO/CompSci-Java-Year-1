package domein;

public class Ticket implements Kosten{
	private String omschrijving;
	private double prijs;
	public Ticket(String omschrijving, double prijs) {
		super();
		setOmschrijving(omschrijving);
		ControleerPrijs(prijs);
	}
	public String getOmschrijving() {
		return omschrijving;
	}
	private void setOmschrijving(String omschrijving) {
		if (omschrijving.isEmpty()) throw new IllegalArgumentException();
		this.omschrijving = omschrijving;
	}
	public double getPrijs() {
		return prijs;
	}
	public void setPrijs(double prijs) {
		this.prijs = prijs;
	}
	
	private void ControleerPrijs(double prijs) {
		if (prijs<=0) throw new IllegalArgumentException();
		this.prijs = prijs;
		
	}
	
	@Override
	public String toString() {
		return String.format("%20s,%10.2f", this.getOmschrijving(), this.getPrijs());
	}
	@Override
	public double berekenPrijs() {
		return this.getPrijs();
	}
	
	

}
