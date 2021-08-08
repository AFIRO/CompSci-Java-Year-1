package domain;

public class Sleutel extends Voorwerp {
 private int deur;
 private static int aantalInOmloop;
 
 public Sleutel(String naam,double gewicht, int niveau, int deur) {
	 super(naam, gewicht, niveau);
	 setDeur(deur);
	 aantalInOmloop++;
	 
 }
 
 private void setDeur(int deur) {
	 if (deur <=0) throw new IllegalArgumentException("Nummer deur moet positief zijn");
	 else this.deur=deur;
 }
 
 public int getDeur() {
	 return deur;
 }
 
 public int getAantalInOmloop() {
	 return aantalInOmloop;
 }
 
 public boolean pastOpDeur(int deur) {
	 if (deur == this.deur) return true;
	 else return false;
 }

public String toString() {
	return super.toString() + " past op deur " + this.getDeur()+"." +"\n" + "Er zijn " + this.getAantalInOmloop() + " sleutel(s) in omloop."; 
			
}
}
