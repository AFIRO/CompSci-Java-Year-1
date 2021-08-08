package ui;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import domein.DomeinController;
import exceptions.BloemenperkException;
import exceptions.ToestelException;

public class TuinApp {
	private DomeinController dc;

	public TuinApp(DomeinController dc) {
		super();
		this.dc = dc;
	}
	
	public void start() {
		try {
			dc.maakTuin(1);
		} catch (IllegalArgumentException e) {
			System.err.printf("Algemeen probleem: %s", e.getMessage());
			System.exit(1);
		} catch (BloemenperkException e) {
			System.err.printf("Probleem met bloemenperken: %s", e.getMessage());
			System.exit(1);
		} catch (ToestelException e) {
			System.err.printf("Probleem met toestellen: %s", e.getMessage());
			System.exit(1);
		}
		
		toonEnReageerOpMenu();
	}
	
	private void toonEnReageerOpMenu() {
		String[] keuzes = { "Toon alle siertuinpercelen", "Toon alle percelen gesorteerd op grootte en waarde",
				"Geef totale oppervlakte van de tuin", "Geef vrije oppervlakte in de tuin", "Stop" };
		int keuze = maakKeuzeUitMenu(keuzes);
		switch (keuze) {
		case 1:
			System.out.println("\nAlle siertuinpercelen:");
			System.out.println(dc.geefSiertuinpercelen());
			break;
		case 2:
			System.out.println("\nAlle tuinpercelen gesorteerd volgens grootte en waarde:");
			System.out.println(dc.geefGesorteerdeTuinpercelen());
			break;
		case 3:
			System.out.printf("%nDe totale oppervlakte van de tuin is %.2f vierkante meter", dc.geefOppervlakte());
			break;
		case 4:
			System.out.printf("%nDe vrije oppervlakte in de tuin is %.2f vierkante meter groot",
					dc.geefVrijeOppervlakte());
			break;
		default:
			break;
		}
		
	}
	
	private int maakKeuzeUitMenu(String[] keuzes) {
		
		List<String> keuzelijst = new ArrayList<>(Arrays.asList(keuzes));
		
		String menu = "";
		
		for (String string :keuzelijst)
			menu += String.format("%s. %s%n", keuzelijst.indexOf(string)+1, string);
		
		Scanner sc = new Scanner(System.in);
		boolean loopflag = true;
	
		int input = 0;
		
		
		do {
			try {
				System.out.println(menu);
				System.out.println("Je keuze (1-5): ");
				input = sc.nextInt();

				if (input < 1 || input > 5)
					throw new IllegalArgumentException();

				else
					loopflag = false;
				
			} catch (InputMismatchException e) {
				System.out.println("Geef een getal in!");
				sc.next();
			} catch (IllegalArgumentException e) {
				System.out.println("Geef een getal tussen 1 en 5.");
			} 
		} while (loopflag);
		
		return input;
	}

}
