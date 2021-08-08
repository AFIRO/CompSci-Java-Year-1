package ui;

import domein.DomeinController;

public class BeheersKostenApplicatie {

	public BeheersKostenApplicatie(DomeinController dc) {
		
		int i = 0;
		for (String tekst : dc.geefTitelsBeheersKosten()) {
			
		System.out.println(tekst);
		System.out.println(dc.geefDetailBeheersKost(i));
		System.out.println(dc.geefBeheersKostWaarde(i));
		i++;
		
		}
	}
	

}
	


