package domein;

import java.util.List;

public class DomeinController 
{
	private final RekeningRepository rr;
	private final KostenRepository kr;
	
	public DomeinController() 
	{
		rr = new RekeningRepository();
		kr = new KostenRepository();
	}

	public String geefRekeningen() 
	{
		// zet lijst van Rekeningen om in een String
		List<Rekening> lijst = rr.geefGewijzigdeRekeningen();
		String uitvoer = "";
		for (Rekening r : lijst)
			uitvoer += String.format("%s%n", r/*.toString()*/);
		return uitvoer;
	}

	public String geefCodes() {
		List<Rekening> lijst = rr.geefGewijzigdeRekeningen();
		String output = "";
		for (Rekening r : lijst)
			output += String.format("%s%n", r.geefCodes());
		return output;
		
		
	}
	
	public String[] geefTitelsBeheersKosten() {
		String[] output = new String[4];
		
		for (int i = 0; i <=3; i++) {
		
					
			if (kr.geefBeheersKost(i) instanceof Kluis )
				output[i] = kr.geefBeheersKost(i).toString();
			
			if (kr.geefBeheersKost(i) instanceof ZichtRekening)
				output[i] = String.format("Type: %s met houder: %s", kr.geefBeheersKost(i).getClass().getSimpleName(), ((ZichtRekening) kr.geefBeheersKost(i)).getHouder());
			
			if (kr.geefBeheersKost(i) instanceof SpaarRekening)
				output[i] = String.format("Type: %s met houder: %s", kr.geefBeheersKost(i).getClass().getSimpleName(), ((SpaarRekening) kr.geefBeheersKost(i)).getHouder());
		}
		
		return output;
		
	}
	
	public String geefDetailBeheersKost(int index) {
		
		return kr.geefBeheersKost(index).toString();
		
	}
	
	public double geefBeheersKostWaarde(int index) {
		return kr.geefBeheersKost(index).geefJaarlijkseKost();
		
	}
}
