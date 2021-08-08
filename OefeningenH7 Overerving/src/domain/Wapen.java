package domain;

public class Wapen extends Voorwerp {
	private int kracht;
	private boolean gebruikt;
	
  public Wapen(String naam, double gewicht, int niveau, int kracht, boolean gebruikt) {
	    super(naam, gewicht, niveau);
	  	controleerNiveau(niveau);
	    setKracht(kracht);
	  	setGebruikt(gebruikt);
}

private void setGebruikt(boolean gebruikt) {
     this.gebruikt=gebruikt;
	
}

private void setKracht(int kracht) {
	if (kracht<0) throw new IllegalArgumentException("Kracht moet positief zijn");
	else this.kracht=kracht;
	}

private void controleerNiveau(int niveau) {
	if (niveau<=0||niveau >5) throw new IllegalArgumentException("Niveau van wapen moet tussen 1 en 5 zijn");
}

public boolean getGebruikt() {
	return gebruikt;
}

public int getKracht() {
	return kracht;
}

public String toString() {
	String t;
	if (this.getGebruikt()) t = "al gebruikt";
	else t = "nog niet gebruikt";
	return super.toString() + " en met kracht " + this.getKracht() + " " + t +"." ;
}


}