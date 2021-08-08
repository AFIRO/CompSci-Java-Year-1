package domein;

import java.math.BigDecimal;

import exceptions.ToestelException;

public class Speeltuinperceel extends Tuinperceel {
	private final int aantalToestellen;
	
	
	

	public Speeltuinperceel(int aantalToestellen) {
		super();
		
		if (aantalToestellen > ((this.DEFAULT_LENGTE_BREEDTE*DEFAULT_LENGTE_BREEDTE))/3)
			throw new ToestelException("Er past niet meer dan 1 toestel per 3 vierkante meter");
		else this.aantalToestellen = aantalToestellen;
	}




	public Speeltuinperceel(double lengte, double breedte, int aantalToestellen) {
		super(lengte, breedte);
		if (aantalToestellen > ((lengte*breedte))/3)
			throw new ToestelException("Er past niet meer dan 1 toestel per 3 vierkante meter");
		else this.aantalToestellen = aantalToestellen;
		
	}


	public BigDecimal geefWaarde() {
		return this.geefWaarde().add(new BigDecimal(10*this.aantalToestellen));
		
	}

	@Override
	public double geefVrijeOppervlakte() {
		
		
		return (this.geefOppervlakte() - (1 * this.aantalToestellen));
	}
	
	@Override
	public String toString() {
		
		return String.format("%s en met %d toestellen om te spelen", super.toString(), this.aantalToestellen);
	}
	

}
