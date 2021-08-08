package domain;

public class Vierkant {
	private int zijde;
	private Punt linkerBovenhoek;
	
	public Vierkant(int x, int y, int zijde) {
		linkerBovenhoek = new Punt(x,y);
		this.setZijde(zijde);
	}
	
	public void setZijde(int zijde) {
		if (zijde <1 || zijde > 500) {throw new IllegalArgumentException("Zijde mag niet kleiner zijn dan 1 of groter dan 500");}
		this.zijde = zijde;
	}
	
	public Punt getLinkerBovenhoek() {
		return linkerBovenhoek;
	}
	
	public int getZijde() {
		return zijde;
	}
	
	public int geefOmtrek() {
		return (this.zijde*4);
	}
	
	public int geefOppervlakte() {
		return (this.getZijde() * this.getZijde());
	}
	
	public void groei() {
		if (this.getZijde()+5 > 500) {this.setZijde(this.getZijde());}
		else this.setZijde(this.getZijde()+5);
	}
	
	public void krimp() {
		if (this.getZijde()-5 < 1) {this.setZijde(this.getZijde());}
		else this.setZijde(this.getZijde()-5);
	}
	
	public String toString() {
		return String.format("Het vierkant heeft:\nZijn linkerbovenhoek op: %s\nEen zijde van: %d\nEen omtrek van: %d\nEen oppervlakte van: %d", this.linkerBovenhoek.toString(), this.getZijde(), this.geefOmtrek(), this.geefOppervlakte());
	}

}
