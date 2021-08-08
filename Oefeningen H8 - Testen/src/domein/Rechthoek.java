package domein;

public class Rechthoek {
	 private double lengte,breedte;
	 
	 public void setLengte(double lengte) {
		 if (lengte <=0) {throw new IllegalArgumentException("Lengte moet groter zijn dan 0");}
		 this.lengte = lengte;
	}
	 
	 public void setBreedte(double breedte) {
		 if (breedte <=0) {throw new IllegalArgumentException("Breedte moet groter zijn dan 0");}
		 this.breedte = breedte;
	}
	 
	public Rechthoek(double lengte, double breedte) {
		setBreedte(breedte);
		setLengte(lengte);
	}
	
	public double getLengte() {
		return lengte;
	}
	
	public double getBreedte() {
		return breedte;
	}
	
	public double geefOmtrek() {
		return ((this.getBreedte()+this.getLengte()) *2);
	}
	
	public double geefOppervlakte() {
		return (this.getBreedte()*this.getLengte());
	}
	
	public void schaal (int percentage) {
		if (percentage <1 || percentage > 200) {throw new IllegalArgumentException("Schaal klopt niet.");}
	}

}
