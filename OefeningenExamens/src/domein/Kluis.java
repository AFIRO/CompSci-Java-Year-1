package domein;

public class Kluis implements BeheersKost {
	private int kluisnummer;
	private String houder;
	private static final double JAARLIJKSE_KOST = 29;
	public int getKluisnummer() {
		return kluisnummer;
	}
	public void setKluisnummer(int kluisnummer) {
		this.kluisnummer = kluisnummer;
	}
	public String getHouder() {
		return houder;
	}
	private void setHouder(String houder) {
		this.houder = houder;
	}
	private static double getJaarlijkseKost() {
		return JAARLIJKSE_KOST;
	}
	public Kluis(int kluisnummer, String houder) {
		super();
		this.kluisnummer = kluisnummer;
		this.houder = houder;
	}
	@Override
	public double geefJaarlijkseKost() {
		return JAARLIJKSE_KOST;
	}
	@Override
	public String toString() {
		return "Kluis [kluisnummer=" + kluisnummer + ", houder=" + houder + "]";
	}
	
	
	
	

}
