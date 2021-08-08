package domein;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Tuin implements Opmeetbaar {
	private List<Tuinperceel> tuinpercelen;

	public Tuin(Collection<Tuinperceel> tuinpercelen) {
		super();
		this.tuinpercelen = (ArrayList<Tuinperceel>) tuinpercelen;
	}

	@Override
	public double geefOppervlakte() {
		double returnwaarde = 0;
		
		for (Tuinperceel tuinperceel : tuinpercelen)
			returnwaarde += tuinperceel.geefOppervlakte();
		
		return returnwaarde;
		
		
	}

	@Override
	public double geefVrijeOppervlakte() {
		double returnwaarde = 0;
		
		for (Tuinperceel tuinperceel : tuinpercelen)
			returnwaarde += tuinperceel.geefVrijeOppervlakte();
		
		return returnwaarde;
	}
	
	public List<Tuinperceel> geefAlleTuinpercelenGesorteerd() {
		List<Tuinperceel> returnlist = tuinpercelen;
		
		Collections.sort(returnlist, new GrootteEnWaardeVergelijker());
		
		return returnlist;
		
	}
	
	public List<Siertuinperceel> geefAlleSiertuinpercelen() {
		List<Siertuinperceel> list = new ArrayList<>();
		
		for (Tuinperceel tuinperceel : tuinpercelen)
			if (tuinperceel instanceof Siertuinperceel)
				list.add((Siertuinperceel)tuinperceel);
		
		return list;
		
	}

}
