package ui;

import java.util.InputMismatchException;
import java.util.Scanner;


import domein.DomeinController;
import domein.Ticket;
import domein.VerplaatsingPerAuto;
import domein.VerplaatsingPerBusTram;

public class VerplaatsingApplicatie
{
    private DomeinController dc;
    Scanner sc = new Scanner(System.in);

    public VerplaatsingApplicatie(DomeinController dc)
    {
        this.dc = dc;
    }

    public void start()
    {
    	System.out.println("Voeg kosten toe (maak een keuze):");
    	
    	optieMenu();
    	
    	String uitvoer = dc.geefOverzichtAantalDocumenten();
        uitvoer += dc.geefKostenLijst();
        System.out.printf(uitvoer);
    	
       
    }

	private void optieMenu() {
		int input = -1;
		boolean loopflag = true;
		do {
			try {
				System.out.println("1. Verplaatsing met eigen vervoer.");
				System.out.println("2. Verplaatsing met Bus/Tram.");
				System.out.println("3. Ticket.");
				System.out.println("4. Programma eindigen en overzicht krijgen.");
				
				input = sc.nextInt();
				switch (input) {
				case 1: {

					System.out.println("Vanwaar kwam u?");
					String van = sc.next();
					System.out.println("Naar waar reed u?");
					String naar = sc.next();
					System.out.println("Hoeveel km?");
					double aantalKm = sc.nextDouble();
					System.out.println("Benzineprijs?");
					double benzineprijs = sc.nextDouble();
					System.out.println("Verbruik? (moet tussen 0.02 en 0.07l per km liggen");
					double verbruik = sc.nextDouble();
					dc.voegKostToe(new VerplaatsingPerAuto(van, naar, aantalKm, benzineprijs, verbruik));
					optieMenu();
				}
				
				case 2: {
					
					System.out.println("Vanwaar kwam u?");
					String van = sc.next();
					System.out.println("Naar waar reed u?");
					String naar = sc.next();
					System.out.println("Hoeveel km?");
					double aantalKm = sc.nextDouble();
					System.out.println("Lijn Nummer?");
					int lijnnr = sc.nextInt();
					System.out.println("Bus?");
					boolean bus = sc.nextBoolean();
					System.out.println("Stadslijn?");
					boolean stadslijn = sc.nextBoolean();
					dc.voegKostToe(new VerplaatsingPerBusTram(van, naar, aantalKm, lijnnr, bus, stadslijn));
					optieMenu();			
				}
				
				case 3: {
					
					System.out.println("Omschrijf de kost:");
					String omschrijving = sc.next();
					System.out.println("Hoeveel kostte deze?");
					double prijs = sc.nextDouble();
					dc.voegKostToe(new Ticket(omschrijving, prijs));
					optieMenu();
				}

				case 4: {
				        loopflag = false;
				        break;
				}
					
				}
			} catch (IllegalArgumentException e) {
				System.out.printf("%n%s", e.getMessage());
				
			} catch (InputMismatchException e) {
				System.out.println("Verkeerde input. Probeer opnieuw van start.");
				sc.next();
			}
		} while (loopflag);
		
	}

}
