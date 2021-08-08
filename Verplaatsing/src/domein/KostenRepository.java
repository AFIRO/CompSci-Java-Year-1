package domein;

import java.util.List;

import Persistentie.Kostenmapper;

public class KostenRepository {
	private final Kostenmapper km;
	List<Kosten> lijstje;
	
	public KostenRepository() {
		km = new Kostenmapper();
		lijstje = km.geefKostenLijst();
		if (lijstje.isEmpty()) System.out.println("Lol repo");
	}
	
	public String GeefOverzichtAantalDocumenten() {
		int x = 0, y = 0, z = 0;
		
		for (Kosten kosten : lijstje) {
			if (kosten instanceof Ticket)
				x++;
			if (kosten instanceof VerplaatsingPerAuto)
				y++;
			else z++;}
			
		return String.format("Volgende documenten werden ingediend: %d tickets,%d verplaatsingen auto, %d verplaatsingen openbaar vervoer" , x,y,z);
		}
	
	public String geefKostenLijst() {
		String output = String.format("%n%70s %95s", "Kostenpost", "Prijs");
		double totaleprijs = 0;
		for (Kosten kosten: lijstje)
			if (kosten instanceof Ticket) {
				output += String.format("%n%70s",kosten.toString());
				totaleprijs += kosten.berekenPrijs();}
			else {
				output += String.format("%n%70s %95.02f", kosten.toString(), kosten.berekenPrijs()*0.79);
				totaleprijs += kosten.berekenPrijs()*0.79;
				}
		output += String.format("%n%nDe totale prijs van de ingediende stukken is: %.2f", totaleprijs);
		return output;
		
	}
		
	}


