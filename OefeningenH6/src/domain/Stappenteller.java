package domain;

public class Stappenteller {
	private String activiteit;
	private int hoeveelheid,soort;
	
	
	public Stappenteller(String activiteit, int hoeveelheid, int soort) {
		this.activiteit=activiteit;
		setHoeveelheid(hoeveelheid);
		setSoort(soort);
		
	}
	
	private void setHoeveelheid(int hoeveelheid) {
		if (hoeveelheid <=0 || hoeveelheid >1000) {throw new IllegalArgumentException("Hoeveelheid klopt niet.");}
		this.hoeveelheid = hoeveelheid;
	}
	
	private void setSoort(int soort) {
		if (soort!=1|soort!=2|soort!=3) {throw new IllegalArgumentException("Soort klopt niet.");}
		this.soort = soort;
	}

	public String getActiviteit() {
		return activiteit;
	}
	
	public int getHoeveelheid() {
		return hoeveelheid;
	}
	
	public int getSoort() {
		return soort;
	}

    public int geefAantalStappen() {
    	int stappen = 0;
    	if (this.soort==1) {stappen= hoeveelheid;}
    	if (this.soort==2) {stappen= hoeveelheid*2;}
    	if (this.soort==3) {stappen= hoeveelheid/2;}
    	return stappen;
    }
   public String toString() {
	   return String.format("%40s%10d", this.getActiviteit(), this.geefAantalStappen());
   }
}
