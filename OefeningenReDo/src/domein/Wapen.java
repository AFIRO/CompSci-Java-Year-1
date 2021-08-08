package domein;

public class Wapen extends Voorwerp {
	private int kracht;
	private boolean gebruikt;
	
	public Wapen(String naam, double gewicht, int niveau, int kracht, boolean gebruikt) {
		
		super(naam, gewicht, niveau);
         setKracht(kracht);
	    this.gebruikt=gebruikt;
	
	}
	
	public void setKracht(int kracht) {
		if (kracht <=0) {throw new IllegalArgumentException("Kracht moet positief zijn.");}
		else this.kracht = kracht;
	}

	
	public int getKracht() {
		return kracht;
	}
	
	private boolean getGebruikt() {
		return gebruikt;
		
	}
	
	private boolean controleerNiveau(int niveau) {
		if (niveau<=0 ||niveau >5) {return false;}
		else return true;
	}


public String toString() {
	String gebruiktString;
	if (this.getGebruikt()) {gebruiktString= "al gebruikt";}
	else {gebruiktString= "nog niet gebruikt";}
	return super.toString() + " en met kracht " + this.getKracht() + " " + gebruiktString; 
}

}
