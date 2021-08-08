package domein;

import java.util.stream.Collectors;

import exceptions.BloemenperkException;

public class DomeinController {
	private Tuin tuin;
	
	public void maakTuin(int id) throws BloemenperkException {
		tuin = new Tuin(new TuinperceelRepository().geefTuinpercelen(id));
		
	}
	
	public String geefGesorteerdeTuinpercelen() {
		
		String lijst = tuin.geefAlleTuinpercelenGesorteerd().stream().map(e-> String.format("%s%n", e.toString())).collect(Collectors.joining(""));
		String output = String.format("Alle tuinpercelen gesorteerd volgens grootte en waarde:%n%s", lijst);
		
		return output;
	}
	
	public String geefSiertuinpercelen() {
		String lijst = tuin.geefAlleSiertuinpercelen().stream().map(e-> String.format("%s%n", e.toString())).collect(Collectors.joining(""));
		String output = String.format("Alle siertuinpercelen:%n%s", lijst);
		
		return output;
	}
	
	public double geefOppervlakte() { 
		
		return tuin.geefOppervlakte();
		
	}
	
public double geefVrijeOppervlakte() { 
		
		return tuin.geefVrijeOppervlakte();
		
	}

}
