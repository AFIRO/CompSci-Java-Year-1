package domein;

public class Mountainbike extends Fiets{
	private Soort soort;
	
	public void setSoort(Soort soort) {
		this.soort = soort;
	}

	public Mountainbike() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Mountainbike(int bandenmaat, boolean elektrisch, Soort soort) {
		super(bandenmaat, elektrisch);
		setSoort(soort);
	}

	@Override
	public double berekenMilieubijdrageVoorTweewieler() {
		
		double returnwaarde = 0;
		
		if (this.soort == Soort.XC || this.soort == Soort.FR) {
			if (isElektrisch())
				returnwaarde = 20.0*1.33;
			else returnwaarde = 20.0;}
		
		if (this.soort == Soort.EN || this.soort == Soort.DH) {
			if (isElektrisch())
				returnwaarde = 30.0*1.33;
			else returnwaarde = 30.0;}
		
		return returnwaarde;
		
	}
	
	@Override
	public String toString() {
		String type = "";
		
		if (this.soort == Soort.XC)
			type = "Cross-Country";
		if (this.soort == Soort.EN)
			type = "Enduro";
		if (this.soort == Soort.DH)
			type = "Die-Hard";
		
		if (this.soort == Soort.FR)
			type = "France";
		
		
		
			
		return String.format("%s met soort %s",super.toString(), type);
	}
	

		
		
	

}
