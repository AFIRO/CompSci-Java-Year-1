package domein;

public enum Soort {
	XC,EN,FR,DH;
	
	private String omschrijving;
	
	private Soort(String omschrijving) {
		
		
		
		this.omschrijving = omschrijving;
	}
	
	Soort() {
		
	}

	public String getOmschrijving() {
		return omschrijving;
	}

}
