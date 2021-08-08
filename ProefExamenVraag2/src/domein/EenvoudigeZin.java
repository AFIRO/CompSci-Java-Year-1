package domein;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EenvoudigeZin {
	private String zin;

	public EenvoudigeZin(String zin) {
		super();
		controleerZin(zin);
	}
	
	public void controleerZin(String zin) {
		if (zin.isEmpty())
			throw new IllegalArgumentException("Zin mag niet leeg zijn");
		
		String REGEX = "[A-Z][a-z ,]*[.?!]{1}";
		
		if (zin.matches(REGEX))
			this.zin = zin;
		else throw new IllegalArgumentException("Dit is geen geldige zin!");
	}
	
	public List<String> geefWoordenMetAantalLetters(int aantalLetters) {
		List<String> output = new ArrayList<>();
		
		output = Arrays.asList(zin.split("[ ,.?!]"));
		
		return output.stream().filter((e)->e.length()==aantalLetters).collect(Collectors.toList());
		
	}
}
