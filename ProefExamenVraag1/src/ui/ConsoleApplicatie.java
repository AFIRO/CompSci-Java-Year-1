package ui;

import domein.DomeinController;

public class ConsoleApplicatie {
	private DomeinController dc;
	
	public ConsoleApplicatie(DomeinController dc) {
		this.dc = dc;
	}

	public void drukOverzichtenAf() {
		System.out.println("Overzicht tweewielers: ");
		System.out.println();
		System.out.println(dc.geefOverzichtTweewielers());
		System.out.println();
		System.out.println("Overzicht elektrische tweewielers: ");
		System.out.println();
		System.out.println(dc.geefOverzichtElektrischeTweewielers());
	}
	
}
