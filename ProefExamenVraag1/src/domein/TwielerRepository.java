package domein;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import persistentie.TweewielerMapper;

public class TwielerRepository {
	private List<Tweewieler> tweewielerLijst;
	private TweewielerMapper tweewielerMapper;
	
	public TwielerRepository() {
		this.tweewielerMapper = new TweewielerMapper();
		this.tweewielerLijst = tweewielerMapper.leestTekstBestandTweewielers("tweewielers.txt");
	}
	
	public List<Tweewieler> geefElektrischeTweewielerLijst() {
		

		
		return tweewielerLijst.stream().filter((e)-> e.toString().contains("Elektrisch")).collect(Collectors.toList());		
	}
	
	public void serialiseerElektrischeTweewieler() {
		tweewielerMapper.serialiseerVolledigeLijst(this.geefElektrischeTweewielerLijst(), "ElektrischeTweewielers.ser");
		
	}
	
	public List<Tweewieler> getTweewielers() {
		return tweewielerLijst;
	}

}
