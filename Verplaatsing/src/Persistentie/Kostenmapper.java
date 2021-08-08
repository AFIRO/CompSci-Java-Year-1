package Persistentie;

import java.util.ArrayList;
import java.util.List;

import domein.Kosten;
import domein.Ticket;
import domein.Verplaatsing;
import domein.VerplaatsingPerAuto;
import domein.VerplaatsingPerBusTram;

public class Kostenmapper {
	List<Kosten> list;
	
 public Kostenmapper() {
		List<Kosten> list = new ArrayList<>();
		
		list.add(new VerplaatsingPerBusTram("Voskenslaan Gent", "Veldstraat", 4.2, 1, false, true));
		list.add(new Ticket("Parkeerticket Flanders Expo", 5));
		list.add(new VerplaatsingPerAuto("Gent", "Oudenaarde", 29.4, 1.591, 0.0538));
		list.add(new Ticket("Toegangsticket beurs", 10));
		list.add(new VerplaatsingPerBusTram("Laarne dorp", "Gent Sint-Pieters", 14.6, 34, true,false));
		list.add(new VerplaatsingPerAuto("Gent", "Brussel", 53.7, 1.488, 0.0692));		
	 this.list = list;
}
		
 public List<Kosten> geefKostenLijst() {
	
	return list;
}	

	
	
}
	

		


