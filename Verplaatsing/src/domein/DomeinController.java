package domein;

public class DomeinController {
	KostenRepository kr;
	
	public DomeinController() {
		kr = new KostenRepository();
		
	}
	
	public String geefOverzichtAantalDocumenten() {
		return kr.GeefOverzichtAantalDocumenten();
		
	}
	
	public String geefKostenLijst() {
		return kr.geefKostenLijst();
		
	}

}
