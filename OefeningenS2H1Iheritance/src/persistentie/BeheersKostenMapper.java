package persistentie;

import java.util.ArrayList;
import java.util.List;

import domein.BeheersKost;
import domein.Kluis;
import domein.SpaarRekening;
import domein.ZichtRekening;

public class BeheersKostenMapper {
	
	public List<BeheersKost> geefBeheerskosten() {
		List<BeheersKost> lijst = new ArrayList<>();
		Kluis k1, k2;
		ZichtRekening z1;
		SpaarRekening s1;
		
		k1 = new Kluis(100, "Tania");
		k2 = new Kluis(250, "Steve");
		z1 = new ZichtRekening(303L, "Nick", -50);
		s1 = new SpaarRekening(101L, "Maxime");
		
		s1.stortOp(200);
		z1.stortOp(500);
		z1.setMaxKredietOnderNul(-50);
		
		lijst.add(k1);
		lijst.add(k2);
		lijst.add(z1);
		lijst.add(s1);
		
		return lijst;
		
		
		
	}

}
