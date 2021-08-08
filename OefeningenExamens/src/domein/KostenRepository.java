package domein;

import java.util.List;

import persistentie.BeheersKostenMapper;

public class KostenRepository {
	private List<BeheersKost> kostenLijst;
	private BeheersKostenMapper bk;
	
	public KostenRepository() {
		super();
		kostenLijst = new BeheersKostenMapper().geefBeheerskosten();
	}
	
	public BeheersKost geefBeheersKost(int index) {
		return kostenLijst.get(index);
		
		
	}
	

}
