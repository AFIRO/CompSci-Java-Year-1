package ui;


import domein.DomeinController;

public class BeheersKostenApplicatie {
	DomeinController dc;
	
	public BeheersKostenApplicatie(DomeinController dc) {
		this.dc = dc;
		String [] output = dc.geefTitelsBeheersKosten();
		
		for (int i = 0; i <=3; i++) {
			System.out.println(output[i]);
			System.out.println(dc.geefDetailBeheersKost(i));
			System.out.println(dc.geefBeheersKostWaarde(i));
			}
			
			
		}
		
	}


