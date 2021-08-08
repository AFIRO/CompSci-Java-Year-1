package cui;
import domein.DomeinController;
import domein.Sleutel;
import domein.Voorwerp;
import domein.Wapen;

public class VoorwerpApplicatie {
	
	private DomeinController dc;
	
	public VoorwerpApplicatie(DomeinController dc) {
		this.dc=dc;}
		
	
	public void start() {
		System.out.printf("Beginsituatie:\n%s\n\n\n", dc.geefOverzicht());
		dc.voegWapenToe("Colt", 1.5, 3, 6, false);
		dc.voegSleutelToe("Voordeur", 0.5, 3, 1);
		dc.voegWapenToe("Brown", 0.5, 1, 23, true);
		dc.voegSleutelToe("Achterdeur", 0.5, 1, 2);
		
		System.out.printf("Na het toevoegen van voorwerpen:\n%s", dc.geefOverzicht());
		
			
		}
	
	}


