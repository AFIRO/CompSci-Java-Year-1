package domein;

import persistentie.BeheersKostenMapper;

public class KostenRepository {
	private BeheersKostenMapper bk;
	
	public KostenRepository() {
		bk = new BeheersKostenMapper();
	}
	
	public Beheerskost geefBeheerskost(int index) {
		return bk.geefBeheerskost(index);
	}
	

}
