package cui;

import java.util.Scanner;

public class OefeningTemperatuur {

	public static void main(String[] args) {
	
		Oefening2 hulp = new Oefening2();
		Scanner s = new Scanner(System.in);
		int input = hulp.kiesUitMenu();
		
		while (input!=3)
			if (input==1) {
				System.out.println("Geef temperatuur in ");
				System.out.printf("De omgezette temperatuur is %.1f", hulp.calcFahren(s.nextFloat()));
				hulp.kiesUitMenu();}
			else {System.out.println("Geef temperatuur in ");
				System.out.printf("De omgezette temperatuur is %.1f", hulp.calcCelsius(s.nextFloat()));
				hulp.kiesUitMenu();}
		   }
	         

	private float calcFahren (float celsius) {
		return 32 + (celsius*9)/5;}
	
	private float calcCelsius (float fahren) {
		return (fahren-32)*5/9; }
		
	private int kiesUitMenu() {
	    Scanner s = new Scanner(System.in);
	    System.out.println("\n1) Omzetten naar Fahrenheit\n2) Omzetten naar Celcius\n3) Stoppen ");
		int input= s.nextInt();
		while (input<=0 | input >3) {
	    System.out.println("Verkeerd! Probeer opnieuw. ");
	    input= s.nextInt();}
		if (input ==1) return input;
		if (input ==2) return input;
		else return input;
		

	}

		
	}
