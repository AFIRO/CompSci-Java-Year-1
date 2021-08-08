package ui;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import domein.DomeinController;


public class ConsoleApplicatie 
{
    public ConsoleApplicatie(DomeinController dc) 
    {
    	System.out.println("ALLE UITGAVEN"); 
    	System.out.println(zetLijstOmNaarTekst(dc.geefAlleUitgaven()));
    	System.out.println();
    	
    	System.out.println("GEORDEND OP TITEL - CATEGORIE:"); 
    	System.out.println(zetLijstOmNaarTekst(dc.geefGeordendOpTitelCategorie()));
    	System.out.println();
    	
    	System.out.println("ZONDER DUBBELS (Let op: volgorde kan afhangen van de implementatie):");
    	System.out.println(zetLijstOmNaarTekst(dc.geefZonderDubbels()));
    	System.out.println();
    	
		System.out.println("ENKEL TITELS GEORDEND VOLGENS DALEND JAAR:");
    	System.out.println(zetLijstOmNaarTekst(dc.geefTitels()));
    	System.out.println();
    	
    	System.out.println("AANTAL UITGAVES BINNEN EEN CATEGORIE:");
    	System.out.println("Aantal = " + dc.geefAantalCategorie("Java"));
    	System.out.println();
    	
    	System.out.println("GEEF TITEL OP BASIS VAN ISBN NUMMER:");
    	System.out.println(formatteerTitel(dc.geefTitelMetISBN("9789059056749")));
    	System.out.println();
    	
		System.out.println("TITEL VAN ONBEKEND ISBN NUMMER:");
		System.out.println(dc.geefTitelMetISBN("xxx"));
    }
    
    // Zet een willekeurige collectie van String objecten om naar een String,
 	// de beschrijving van elke element uit de collectie komt op een nieuwe lijn.
 	private String zetLijstOmNaarTekst(Collection<String> collectie) {
 		
 		return collectie.stream().map(e-> String.format("%s%n", e)).collect(Collectors.joining(""));
 		
 	}
 	
 	// Een titel opgevraagd via het ISBN nummer wordt getoond op het scherm.
 	// Een titel is echter niet altijd correct ingegeven, soms staan er meerdere
 	// spaties of tabs tussen de woorden.
 	// Om een titel mooi te presenteren koos men ervoor om elk woord in een titel
 	// te laten starten met een hoofletter. De methode formatteerTitel zorgt hiervoor.
 	// Voorbeeld:
 	// De titel: 	"Python    crash	course" ziet er na formattering zo uit:
 	//				"Python Crash Course"
 	private String formatteerTitel(String titel) {
 		
 		String output;
 		List<String> list = new ArrayList<>(Arrays.asList(titel.split("[ ]*")));
 		List <StringBuilder> sblist = new ArrayList<>();
 		
 		list.stream().forEach(e-> sblist.add(new StringBuilder(e)));
 		
 		//sblist.stream().forEach(e-> System.out.println(e));
 		
 		sblist.stream().forEach(e-> e.setCharAt(0, Character.toUpperCase(e.charAt(0))));
 		
 		output = sblist.stream().map(e-> e.toString()).collect(Collectors.joining(" "));
 		output = output.trim();
 		
 		return output;
		
	}	
}
