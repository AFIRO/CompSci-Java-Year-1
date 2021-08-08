package domein;

public class Waarneming {
	private double temperatuur;
	private String seizoen;
	
	public Waarneming(String seizoen, double temperatuur) {
		this.setSeizoen(seizoen);
		this.setTemperatuur(temperatuur);
		// TODO Auto-generated constructor stub
	}
	
	
	private void setSeizoen(String seizoen) {
		if (seizoen.equals("winter") |  seizoen.equals("lente") | seizoen.equals("zomer") | seizoen.equals("herfst")) {this.seizoen=seizoen;}
		else {throw new IllegalArgumentException("Seizoen met lente, zomer, herfst of winter zijn");}
	}
	
	private void setTemperatuur(double temperatuur) {
		if (temperatuur < -100 | temperatuur > 100) {throw new IllegalArgumentException("Temperatuur is te hoog of te laag.");}
		else this.temperatuur = temperatuur;
	}
	
	public boolean isUitzonderlijkWarm() {
		if (this.seizoen.contains("herfst") & this.temperatuur>20) return true;
		if (this.seizoen.contains("winter") & this.temperatuur>20) return true;
		else return false;
	}
	
	public void wijzigTemperatuur(boolean warmer, double aantalGraden) {
		double tijdtemp;
		if (warmer) {tijdtemp = this.temperatuur + aantalGraden;}
		else tijdtemp = this.temperatuur - aantalGraden;
		this.setTemperatuur(tijdtemp);
	}


    public double getTemperatuur() {
	return temperatuur;
  }

    public String getSeizoen() {
		return seizoen;
	}
	

}
