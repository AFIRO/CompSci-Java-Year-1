package domein;

public class Kluis implements Beheerskost {
	private int kluisnummer;
	private String houder;
	private static final double JAARLIJKSE_KOST = 29;
	
	public Kluis(int kluisnummer, String houder) {
		super();
		this.kluisnummer = kluisnummer;
		this.houder = houder;
	}

	@Override
	public double geefJaarlijkseKost() {
		// TODO Auto-generated method stub
		return JAARLIJKSE_KOST;
	}

	@Override
	public String toString() {
		return "Kluis [kluisnummer=" + kluisnummer + ", houder=" + houder + "]";
	}
	
	

}
