package domein;

import java.util.ArrayList;
import java.util.List;



public class DomeinController {
	private BestellingRepository br;
	
	public DomeinController() {
		br = new BestellingRepository();
	}
	
	public void voegBestellingToe(int printers, int laptops, int scanners) {
		br.voegToe(new Bestelling(printers, laptops, scanners));
		
	}
	
	public List<String> geefBestellingen() {
		
		List<String> output = new ArrayList<>();
		
		for (Bestelling bestelling : br.getBestellingen())
			output.add(bestelling.toString());
		
		return output;
		
	}

}
