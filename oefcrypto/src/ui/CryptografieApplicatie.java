package ui;

import java.util.Scanner;

import domein.DomeinController;

public class CryptografieApplicatie {
	
	private final DomeinController dc;
	
	public CryptografieApplicatie(DomeinController dc) {
		this.dc = dc;
	}

	public void start() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Geef te coderen bericht: ");
		String input = sc.nextLine();
		dc.codeerBericht(input);
		System.out.printf("%nGecodeerd bericht is: %s", dc.geefGecodeerdeBericht());
		
		
	}
}
