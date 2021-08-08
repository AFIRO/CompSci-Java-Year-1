package ui;

import domein.DomeinController;

public class VerplaatsingApplicatie
{
	
	DomeinController dc;
	
	public VerplaatsingApplicatie() {
		dc = new DomeinController();
	}
	
    public void start(){
    	
    	System.out.println(dc.geefOverzichtAantalDocumenten());
    	System.out.println("Overzicht gemaakte kosten: ");
    	System.out.println(dc.geefKostenLijst());
        
    	
    }

}
