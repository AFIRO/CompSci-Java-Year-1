package domein;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class DomeinController {
	private final UitgaveRepository repository;

	public DomeinController() {
		this.repository = new UitgaveRepository();
	}

	
	
	// Zet een willekeurige collectie van Uitgaven om 
	// naar een lijst van String objecten. De parameter van deze methode
	// dien je ook nog aan te vullen.
	private List<String> zetUitgavenOmNaarTekst(Collection<Uitgave> list) {
		
		return list.stream().map(e-> e.toString()).collect(Collectors.toList());
		
	}

	
	
	// Onderstaande methodes hoef je niet meer aan te passen!
	public List<String> geefAlleUitgaven() {
		return zetUitgavenOmNaarTekst(repository.getUitgaveLijst());
	}

	public List<String> geefGeordendOpTitelCategorie() {
		return zetUitgavenOmNaarTekst(repository.geefGeordendOpTitelCategorie());
	}

	public List<String> geefZonderDubbels() {
		return zetUitgavenOmNaarTekst(repository.geefZonderDubbels());
	}

	public List<String> geefTitels() {
		return repository.geefTitels();
	}

	public String geefTitelMetISBN(String isbn) {
		return repository.geefTitelMetISBN(isbn);
	}

	public long geefAantalCategorie(String woord) {
		return repository.geefAantalCategorie(woord);
	}
}
