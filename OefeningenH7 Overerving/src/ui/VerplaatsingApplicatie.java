package ui;
import domain.VerplaatsingPerAuto;
import domain.VerplaatsingPerBusTram;

public class VerplaatsingApplicatie {
	
	public void start() {
		VerplaatsingPerAuto[] v1 = new VerplaatsingPerAuto[2];
		VerplaatsingPerBusTram[] v2 = new VerplaatsingPerBusTram[2];
		
		v1[0]= new VerplaatsingPerAuto("HoGent Campus Schoonmeersen Gent", "EFFI Waregem", 35, 0.75, 0.5);
		v1[1]= new VerplaatsingPerAuto("HoGent Campus Aalst", "Brenso NV Affligem", 59, 1.25, 0.5);
		v2[0]= new VerplaatsingPerBusTram("HoGent Campus Schoonmeersen Gent", "Techpark Zwijnaarde", 14, 70, true, false);
		v2[1]=  new VerplaatsingPerBusTram("Gent Sint Pieters", "Random Straat", 23, 22, false, true);
		
		double totaalprijs = 0;
	    for (VerplaatsingPerAuto element:v1) {
	    	System.out.println(element.toString());
	    	totaalprijs = totaalprijs + element.berekenPrijs();
	    }
	    
	    for (VerplaatsingPerBusTram element:v2) {
	    	System.out.println(element.toString());
	    	totaalprijs = totaalprijs + element.berekenPrijs(); 
	    }
	    
	    System.out.printf("Total kosen voor alle verplaatsingen samen: € %.2f", totaalprijs);
	}

}
