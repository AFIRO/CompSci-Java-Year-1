package domein;

import java.util.List;

public class TrekkingRepository {
	Trekking trekking;
	
	public void RegistreerTrekking(String naam, List<Integer> nummers) {
		trekking= new Trekking(naam, nummers);
	}
    public String toonRegistratie() {
    	return String.format("Trekking geregistreerd door %s met de nummers: %d %d %d %d %d %d",trekking.getNaam(),trekking.getNummers().get(0), trekking.getNummers().get(1), trekking.getNummers().get(2), trekking.getNummers().get(3), trekking.getNummers().get(4), trekking.getNummers().get(5));
    }
}
