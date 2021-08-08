package domain;

public class Jackpot {
	private int score;
	private Wiel wiel;
	private int getal1;
	private int getal2;
	private int getal3;
	
 public Jackpot() {
	 wiel = new Wiel();
 }

 public int draaiWiel() {
	this.getal1= wiel.draaiWiel();
	this.getal2= wiel.draaiWiel();
	this.getal3= wiel.draaiWiel();
	
	if (getal1 == 9 && getal1 == getal2 && getal1 == getal3) 
	 this.score= 50;
	if (getal1 == getal2 && getal1 == getal3)
	 this.score=10;
	if (getal1 == getal2 | getal1==getal3 | getal2==getal3)
		this.score=5;
	else this.score=0;
	return this.score;
 }
 
 public String toonWeergave() {
	return String.valueOf(getal1) + " " + String.valueOf(getal2) + " " + String.valueOf(getal3);
	 
 }
 
}
