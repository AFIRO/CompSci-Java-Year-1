package ui;

import domain.Domaincontroller;


public class VoorwerpApplicatie {
private Domaincontroller dc;

public void start(Domaincontroller dc) {
	System.out.println("Beginsituatie: ");
	System.out.println(dc.geefOverzicht());
	
	dc.voegWapenToe("Colt",1.500,3, 6, false);
	dc.voegSleutelToe("voordeur",0.500,3,1);
	dc.voegWapenToe("Brown",0.500,1,23,true);
	dc.voegSleutelToe("achterdeur", 0.500,1,2);
	System.out.println(dc.geefOverzicht());
	
}

}

