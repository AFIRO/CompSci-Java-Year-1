package domein;

import java.util.List;
import java.util.stream.Collectors;

public class DomeinController {
	private TwielerRepository tweewielRepository;
	
	public DomeinController() {
		this.tweewielRepository = new TwielerRepository();
	}
	
	public String geefOverzichtTweewielers() {
		return lijstOmzettenNaarTekst(tweewielRepository.getTweewielers());
		
	}
	
	
	public String geefOverzichtElektrischeTweewielers() {
		return lijstOmzettenNaarTekst(tweewielRepository.geefElektrischeTweewielerLijst());
		
	}

	public void serialiseerElektrischeTweeieler() {
		tweewielRepository.serialiseerElektrischeTweewieler();
		
	}
	
	public String lijstOmzettenNaarTekst(List<Tweewieler> tweewielers) {
		return tweewielers.stream().map((e)-> String.format("%s%n", e.toString())).collect(Collectors.joining(""));
	}
}
