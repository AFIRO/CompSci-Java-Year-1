package domein;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import persistentie.UitgaveMapper;

public class UitgaveRepository {

	private List<Uitgave> uitgaveLijst;
	private final UitgaveMapper uitgaveMapper;

	public UitgaveRepository() {
		uitgaveMapper = new UitgaveMapper();

		// Maak een lijst van Uitgave objecten aan op basis van
		// de elementen vanuit de mapper (uitgaveMapper.geefUitgaven())
		// Deze lijst van Uitgave objecten MOET uitbreidbaar zijn.
		uitgaveLijst =  new ArrayList<>(Arrays.asList(uitgaveMapper.geefUitgaven()));
		
		// Sorteer hier de uitgaveLijst volgens 'natuurlijke orde' (= volgens het jaar, oud naar nieuw) 
		// (--> hiervoor dien je ook ook de klasse Uitgave aan te passen).
		
		uitgaveLijst = uitgaveLijst.stream().sorted().collect(Collectors.toList());
		
	}

	public List<Uitgave> getUitgaveLijst() {
		return uitgaveLijst;
	}
	
	// Geef een gesorteerde lijst van de uitgaven terug,
	// alfabetisch gesorteerd op titel en bij gelijke titel op categorie.
	public List<Uitgave> geefGeordendOpTitelCategorie() {
		
		Comparator<Uitgave> comp = new Comparator<Uitgave>() {

			@Override
			public int compare(Uitgave o1, Uitgave o2) {
				if (o1.getTitel().compareTo(o2.getTitel()) ==0)
					return o1.getCategorie().compareTo(o2.getCategorie());
				else return o1.getTitel().compareTo(o2.getTitel());
			}
		};
		
		return uitgaveLijst.stream().sorted(comp).collect(Collectors.toList());
		
	}

	// Als twee uitgave objecten hetzelfde isbn nummer hebben, dan gaat het om dezelfde uitgave. 
	// Pas de Uitgave klasse zodanig aan dat je twee Uitgave objecten met elkaar kan vergelijken.

	// Haal de dubbels (uitgaves met hetzelfde isbn) uit de lijst
	public Collection<Uitgave> geefZonderDubbels() {
		
		return uitgaveLijst.stream().distinct().collect(Collectors.toList());
		
	}


	// Tel het aantal uitgaves waarvan de categorie het opgegeven woord bevat. 
	// Let op: Bij het zoeken of een woord voorkomt in een categorie moet je 
	// weten dat de categorie van een uitgave altijd in hoofdletters staat.
	public long geefAantalCategorie(String woord) {
		String nieuwwoord = woord.toUpperCase();
		
		return uitgaveLijst.stream().filter(e-> e.getCategorie().contains(nieuwwoord)).count();
	}

	// Geef een lijst van de unieke titels van alle uitgaven, de recentste bovenaan
	public List<String> geefTitels() {
		
		return uitgaveLijst.stream().sorted(Comparator.comparing(Uitgave::getJaar).reversed()).distinct().map(e-> e.getTitel()).collect(Collectors.toList());
		
		
	}

	// Geef de titel van de uitgave met een bepaald isbn nummer. Als er geen
	// resultaat gevonden wordt, geef je "GEEN RESULTAAT" terug.
	public String geefTitelMetISBN(String isbn) {
		
		return uitgaveLijst.stream().filter(e-> e.getISBN() == isbn).map(e-> e.getTitel()).collect(Collectors.joining(""));
		
	}
}
