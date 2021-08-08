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
		
		lijst.add(new Kluis(55510, "Daniel"));
		lijst.add(new Kluis(55517, "Gert"));
		lijst.add(new ZichtRekening(101, "Jan", -250));
		lijst.add(new SpaarRekening(0L, "Gerrit"));
		
		return lijst;
				
		}
	}


