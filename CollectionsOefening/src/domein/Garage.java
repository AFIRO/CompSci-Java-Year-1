package domein;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.TreeSet;

public class Garage {
	private List<Onderhoud> onderhoudLijst;

	// implementeer:
	// stop alle onderhouden (~parameter) in het attribuut onderhoudLijst
	public Garage(Collection<Onderhoud> onderhouden) {
		onderhoudLijst = new ArrayList<>();
		onderhoudLijst.addAll(onderhouden);
		
	}

	// implementeer:
	// retourneer een Collection met alle unieke auto's uit de onderhoudLijst
	// tip: voeg alle auto's uit de onderhoudLijst toe aan een Set om de unieke
	// auto's te hebben
	public Collection<Auto> geefAutosVoorOnderhoud() {
		Collection<Auto> autos = new HashSet<Auto>();
		
		for (Onderhoud onderhoud: onderhoudLijst)
			autos.add(onderhoud.getAuto());
		
		return autos;
	}

	public Collection<Onderhoud> getOnderhoudLijst() {
		return onderhoudLijst;
	}

	// implementeer:
	// sorteer de onderhoudLijst op Auto (natuurlijk ordening op nummerplaat)
	// vervolgens sorteer je voor gelijke auto's op begindatum van het onderhoud
	public void sorteerOnderhoudLijst() {
		Collections.sort(onderhoudLijst, new Comparator<Onderhoud>() {

			@Override
			public int compare(Onderhoud o1, Onderhoud o2) {
				if (o1.getAuto().getNummerplaat().compareTo(o2.getAuto().getNummerplaat()) == 0)
					return o1.getBegindatum().compareTo(o2.getBegindatum());
				return o1.getAuto().getNummerplaat().compareTo(o2.getAuto().getNummerplaat());
				
			}
		});
		
		

	}

	// implementeer:
	// - indien je dit nog niet deed, implementeer dan eerst de methode
	// isAangrenzendMet in de klasse Onderhoud
	// - roep de hulpmethode sorteerOnderhoudLijst aan om de onderhoudLijst
	// eerst te sorteren, en
	// - voeg dan alle aangrenzende onderhouden samen tot 1 onderhoud
	public void voegAangrenzendeOnderhoudenSamen() {
		sorteerOnderhoudLijst();
				
	   ListIterator<Onderhoud> listIterator = onderhoudLijst.listIterator();
	   Onderhoud anderOnderhoud = null;
	       

	   		while (listIterator.hasNext()) {
				Onderhoud onderhoud = listIterator.next();
				
				
					if (listIterator.hasNext())
						anderOnderhoud = listIterator.next();
							if (onderhoud.isAangrenzendMet(anderOnderhoud))
								anderOnderhoud.setBegindatum(onderhoud.g);
								listIterator.remove();
								listIterator.previous();
								listIterator.remove();
								listIterator.add(onderhoud);
								
							
								
								
					
					
					
				
							
						
				

				
				
						
						
				}
	   					
	

	}
}
	   			
	   		  
	   
			

	


