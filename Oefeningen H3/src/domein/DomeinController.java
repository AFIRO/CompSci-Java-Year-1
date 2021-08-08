package domein;

import java.util.List;

public class DomeinController {
	TrekkingRepository TR;
	
	public void registeerTrekking(String naam, List<Integer> nummers) {
		TR = new TrekkingRepository();
		TR.RegistreerTrekking(naam, nummers);
	}
    public String toonRegistratie() {
    	return TR.toonRegistratie();
    }
}
