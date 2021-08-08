package domein;

import java.math.BigDecimal;

public abstract class Tuinperceel implements Opmeetbaar{
	private static final BigDecimal EENHEIDSWAARDE = new BigDecimal(2.5);
	protected static final int DEFAULT_LENGTE_BREEDTE = 5;
	
	private final double lengte, breedte;
	
	public Tuinperceel() {
		this.lengte = DEFAULT_LENGTE_BREEDTE;
		this.breedte = DEFAULT_LENGTE_BREEDTE;
	}

	public Tuinperceel(double lengte, double breedte) {
		controleerLengteEnBreedte(lengte, breedte);
		this.lengte = lengte;
		this.breedte = breedte;
	}
	
	
	public double geefOppervlakte() {
		return (double) this.lengte*this.breedte;
		
	}
	
	public BigDecimal geefWaarde() {
		return EENHEIDSWAARDE.multiply(new BigDecimal(geefOppervlakte()));
		
	}
	
	private void controleerLengteEnBreedte(double lengte, double breedte) {
		if (lengte < 1.0 || breedte < 1.0)
			throw new IllegalArgumentException("De lengte en breedte moeten strikt positief zijn");
		if (lengte < breedte)
			throw new IllegalArgumentException("Lengte moet groter dan of gelijk zijn aan breedte");	
		
	}
	
	@Override
	public String toString() {
		
		return String.format("Tuinperceel van %.1f op %.1f met een waarde van %.2f", this.lengte, this.breedte, this.geefWaarde().doubleValue());
	}
	
	

}
