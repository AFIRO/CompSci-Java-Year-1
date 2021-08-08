package domein;

import java.util.List;

public class DomeinController 
{
	private final RekeningRepository rr;
	private final KostenRepository deKostenRepos;
	
	public DomeinController() 
	{
		rr = new RekeningRepository();
		deKostenRepos = new KostenRepository();
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
		String uitvoer ="";
		for (Rekening r : lijst)
			uitvoer += String.format("%s%n", r.geefCode());
		return uitvoer;
	}
	
	public String[] geefTitelsBeheersKosten() {
		List<BeheersKost> lijst = deKostenRepos.getKostenlijst();
		String[] output = new String[lijst.size()];
		int i = 0;
		
		for (BeheersKost beheersKost: lijst) {
			
			if (beheersKost instanceof Kluis)
			output[i] = beheersKost.toString();
			if (beheersKost instanceof Rekening)
			output[i] = String.format("%s, houder = %s", beheersKost.getClass().getSimpleName(), ((Rekening) beheersKost).getHouder());	
			i++;
		}
		
		return output;					 	
		}
				
			
	public String geefDetailBeheersKost(int index) {
		BeheersKost beheersKost = deKostenRepos.geefBeheersKost(index);
		if (beheersKost instanceof Kluis)
			return beheersKost.toString();
		if (beheersKost instanceof ZichtRekening)
			return String.format("Detail: %s met %d van %s met saldo %.2f", beheersKost.getClass().getSimpleName(), ((ZichtRekening) beheersKost).getRekeningNr(), ((ZichtRekening) beheersKost).getHouder(), ((ZichtRekening) beheersKost).getSaldo());
		if (beheersKost instanceof SpaarRekening)
			return String.format("Detail: %s met %d van %s met saldo %.2f", beheersKost.getClass().getSimpleName(), ((SpaarRekening) beheersKost).getRekeningNr(), ((SpaarRekening) beheersKost).getHouder(), ((SpaarRekening) beheersKost).getSaldo());
		return null;
		
	}
	
	public double geefBeheersKostWaarde(int Index) {
		BeheersKost bk = deKostenRepos.geefBeheersKost(Index);
		return bk.geefJaarlijkseKost();
	}

}
