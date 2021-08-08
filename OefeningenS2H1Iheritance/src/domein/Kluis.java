package domein;

public class Kluis implements BeheersKost {
	
	private final int kluisnummer;
	private final String houder;
	private static final double JAARLIJKSE_KOST = 29;
	
	public Kluis(int kluisnummer, String houder) {
		super();
		this.kluisnummer = kluisnummer;
		this.houder = houder;
	}
	
	
	
	

	public int getKluisnummer() {
		return kluisnummer;
	}

	public String getHouder() {
		return houder;
	}





	@Override
	public String toString() {
		return String.format("kluisnr = %d, houder = %s", this.getKluisnummer(), this.getHouder());
	}

	@Override
	public double geefJaarlijkseKost() {
		return JAARLIJKSE_KOST;
	}
	
	
	
	

}
