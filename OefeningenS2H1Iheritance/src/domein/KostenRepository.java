package domein;

import java.util.List;

import persistentie.BeheersKostenMapper;

public class KostenRepository {
	private final BeheersKostenMapper beheersKostenMapper;
	private final List<BeheersKost> kostenlijst; 

	public KostenRepository() {
		super();
		beheersKostenMapper = new BeheersKostenMapper();
		kostenlijst = beheersKostenMapper.geefBeheerskosten();
			
		}
	
	
	public BeheersKost geefBeheersKost(int index) {
		 if (index >=0 && index < kostenlijst.size())
			 return kostenlijst.get(index); 
		 else return null;
	}
	
	public List<BeheersKost> getKostenlijst() {
		return kostenlijst;
	}

}
