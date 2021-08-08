package domein;

public class Sleutel extends Voorwerp {
	private static int aantalInOmloop;
	private int deur;
	
	public Sleutel(String naam, double gewicht, int niveau, int deur) {
		super(naam, gewicht, niveau);
		setDeur(deur);
		aantalInOmloop++;
	}
	
	public int getDeur() {
		return deur;
	}
	
	public static int getAantalInOmloop() {
		return aantalInOmloop;
	}
	
	public void setDeur(int deur) {
		if (deur > 0) this.deur = deur;
		else throw new IllegalArgumentException("Een deur kan niet negatief zijn");
	}
	
	public boolean pastOp(int deur) {
		if (deur == this.deur) {return true;}
		else return false;
	}
	
	public String toString() {
		return super.toString() + " past op deur " + this.getDeur() + "\nEr zijn " + this.getAantalInOmloop() + " sleutels in omloop.";
	}
}
