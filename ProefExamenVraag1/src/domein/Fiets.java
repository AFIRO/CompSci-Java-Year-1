package domein;

import java.io.Serializable;

import Exceptions.BandException;

public abstract class Fiets implements Tweewieler, Serializable{

	private int bandenmaat;
	private boolean elektrisch;
	
	public Fiets() {
		setBandenmaat(28);
		setElektrisch(false);
	}

	public Fiets(int bandenmaat, boolean elektrisch) {
		super();
		setBandenmaat(bandenmaat);
		setElektrisch(elektrisch);
	}
	
	public boolean isElektrisch() {
		return elektrisch;
	}
	
	private void setElektrisch(boolean elektrisch) {
		this.elektrisch = elektrisch;
	}
	
	private void setBandenmaat(int bandenmaat) {
		if (bandenmaat <12 || bandenmaat >=29)
			try {
				throw new BandException("Bandmaat is niet conform");
			} catch (BandException e) {
				throw new IllegalArgumentException();
				
			}
		else this.bandenmaat = bandenmaat;
	}
	
	@Override
	public String toString() {
		String output;
		
		output = String.format("Mechanische fiets met bandenmaat %d", this.getBandenmaat());
		if (elektrisch)
			output.replaceFirst("Mechanische", "Elektrische");
		
		return output;
	}

	public int getBandenmaat() {
		return bandenmaat;
	}
	
}
