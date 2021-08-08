package persistentie;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import domein.Siertuinperceel;
import domein.Speeltuinperceel;
import domein.Tuinperceel;
import exceptions.BloemenperkException;

public class TuinperceelMapper {

	public Collection<Tuinperceel> geefTuinpercelen(int id) throws BloemenperkException {
		switch (id) {
		case 1: {
			return geefGeldigeTuin();
		}
		case 2: {
			return geefTuinMetProbleemMetBloemperken();
		}
		case 3: {
			return geefTuinMetProbleemMetToestellen();
		}
		case 4: {
			return geefTuinMetProbleemMetAfmetingen();
		}
		default:
			throw new IllegalArgumentException("Ongeldig id");
		}
	}

	private Collection<Tuinperceel> geefGeldigeTuin() throws BloemenperkException {
		List<Tuinperceel> tuinpercelen = new ArrayList<>();
		tuinpercelen.add(new Siertuinperceel(Arrays.asList("Gladiool", "Roos", "Distel"), true));
		tuinpercelen.add(new Siertuinperceel(20, 20, Arrays.asList("Gladiool", "Roos", "Distel"), true));
		tuinpercelen.add(new Siertuinperceel(20, 20, Arrays.asList("Zonnebloem", "Margriet", "Distel"), false));
		tuinpercelen.add(new Siertuinperceel(3, 3, Arrays.asList("Sneeuwvlokje", "Roos", "Tulp"), false));
		tuinpercelen.add(new Speeltuinperceel(20, 10, 3));
		return tuinpercelen;
	}

	private Collection<Tuinperceel> geefTuinMetProbleemMetBloemperken() throws BloemenperkException {
		List<Tuinperceel> tuinpercelen = new ArrayList<>();
		tuinpercelen.add(new Siertuinperceel(1, 1, Arrays.asList("Sneeuwvlokje", "Roos", "Tulp", "Gladiool"), false));
		tuinpercelen.add(new Speeltuinperceel(20, 10, 3));
		return tuinpercelen;
	}

	private Collection<Tuinperceel> geefTuinMetProbleemMetToestellen() throws BloemenperkException {
		List<Tuinperceel> tuinpercelen = new ArrayList<>();
		tuinpercelen.add(new Speeltuinperceel(20, 10, 333));
		return tuinpercelen;
	}

	private Collection<Tuinperceel> geefTuinMetProbleemMetAfmetingen() throws BloemenperkException {
		List<Tuinperceel> tuinpercelen = new ArrayList<>();
		tuinpercelen.add(new Siertuinperceel(10, 20, Arrays.asList("Gladiool", "Roos", "Distel"), true));
		return tuinpercelen;
	}

}
