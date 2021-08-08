package domein;
import java.util.ArrayList;
import java.util.List;

public class Trekking {
	private String naam;
	private List<Integer> nummers = new ArrayList<>();
	
	public Trekking(String naam,List<Integer> nummers) {
		this.setNaam(naam);
		this.setNummers(nummers);
	}
	
	private void setNummers(List<Integer> nummers) {
		this.nummers = nummers;
	}
	
	private void setNaam(String naam) {
		this.naam = naam;
	}
	
	public String getNaam() {
		return naam;
	}
	
	public List<Integer> getNummers() {
		return nummers;
	}

}
