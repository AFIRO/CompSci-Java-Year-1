package cui;

import java.util.Scanner;

public class BriefApplicatie {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int input, lengte, gewicht, breedte;
		String output =  String.format("NR BRIEF  GEWICHT IN GRAM  GEWICHTSCATEGORIE GENORMALISEERD?  PRIJS IN EURO\n");
		String categorie = "";
		Boolean isGenormaliseerd = false;
		int counter = 0;
		double prijs = 0;
		do {
		System.out.print("Geef het gewicht in gram (-10 om te stoppen): ");
		input = s.nextInt();
		gewicht = input;
		System.out.print("Geef de lengte in cm: ");
		lengte = s.nextInt();
		System.out.print("Geef de breedte in cm: ");
		breedte = s.nextInt();
		if (gewicht >0 || gewicht <=100) {categorie = "A";}
		if (gewicht >100 || gewicht <=350) {categorie = "B";}
		if (gewicht >350 || gewicht <=1000) {categorie = "C";}
		if (gewicht >1000 || gewicht <=2000) {categorie = "D";}
		
		switch (categorie)
		{
		case "A": {prijs = 5.4;	break;}
		case "B": {prijs = 3.9;	break;}
		case "C": {prijs = 2.3;	break;}
		case "D": {prijs = 1.5;	break;}
		default: break;};
		counter++;
		
		if (lengte<22&& breedte < 11) {isGenormaliseerd = true;}
		String norm;
		if (isGenormaliseerd) {norm = "ja";}
		else norm = "nee";
		output = output + String.format("%d%d%s%s%.02f", counter, gewicht, categorie, norm, prijs);
		
		} while (input !=-10);
		
		System.out.printf("%s",output);
			
		}

	}


