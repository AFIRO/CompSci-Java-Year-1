package domein;

import java.util.Comparator;

public class GrootteEnWaardeVergelijker implements Comparator<Tuinperceel> {

	@Override
	public int compare(Tuinperceel tp1, Tuinperceel tp2) {
		if (Double.valueOf(tp1.geefOppervlakte()).compareTo(tp2.geefOppervlakte()) == 0)
			return tp1.geefWaarde().compareTo(tp2.geefWaarde());
		else return Double.valueOf(tp1.geefOppervlakte()).compareTo(tp2.geefOppervlakte());
	}

}
