package domein;

import java.util.Collection;

import exceptions.BloemenperkException;
import persistentie.TuinperceelMapper;

public class TuinperceelRepository {
	public Collection<Tuinperceel> geefTuinpercelen(int id) throws BloemenperkException {
		return new TuinperceelMapper().geefTuinpercelen(id);
	}
}
