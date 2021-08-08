package cui;

import java.util.InputMismatchException;
import java.util.Scanner;


import domein.DomeinController;

public class BestellingsApplicatie {
	private DomeinController dc;
	
	public BestellingsApplicatie(DomeinController dc) {
		this.dc = dc;
	}
	
	
	public void start() {
		int input = 0;
		do {
			input = geefKeuzeUitMenu();
			if (input == 1)
				maakNieuweBestelling();
			if (input == 2) {
				for (String string : dc.geefBestellingen())
					System.out.println(string);
				
			try {
				if (input > 3 | input <=0) new IllegalArgumentException();
			} catch (IllegalArgumentException e) {
				System.out.println("Gelieve een getal in te geven tussen 1 en 3");
			}
			
			} 
		} while (input !=3);
		
	}
	
	private int geefKeuzeUitMenu() {
		int input = 0;
		Scanner sc = new Scanner(System.in);
		
		try {
		
			System.out.println("Kies uit: ");
			System.out.println("1. Nieuwe Bestelling ");
			System.out.println("2. Overzicht Bestellingen ");
			System.out.println("3. Beeindig deze applicatie ");
			System.out.print("Je keuze is: ");
			input = sc.nextInt();
			
			
		} catch (IllegalArgumentException e) {
			System.out.println("Gelieve een getal in te geven tussen 1 en 3");
			
		}catch (InputMismatchException e) {
			System.out.println("Gelieve een getal in te geven.");
		} 
		
		return input;
		
	}
	
	private void maakNieuweBestelling() {
		Scanner sc = new Scanner(System.in);
		int printers, laptops, scanners;
		System.out.println("Geef aantal printers");
		printers = sc.nextInt();
		System.out.println("Geef aantal laptops");
		laptops = sc.nextInt();
		System.out.println("Geef aantal scanners");
		scanners = sc.nextInt();
		dc.voegBestellingToe(printers, laptops, scanners);
		

		
	}
	
	

}
