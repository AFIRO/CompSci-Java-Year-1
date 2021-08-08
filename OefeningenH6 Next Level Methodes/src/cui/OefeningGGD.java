package cui;
import java.util.Scanner;

import domain.BerekeningGGD;

public class OefeningGGD {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		BerekeningGGD ggd = new BerekeningGGD();
	    int getal1,getal2;
		System.out.print("Geef een geheel getal voor de teller van de breuk: ");
	    getal1= s.nextInt();
	    do {System.out.print("Geef een geheel getal verschillend van nul voor de noemer van de breuk: ");
		getal2=s.nextInt();} while (getal2==0);
	    int deler = ggd.berekenGrootsteGemeneDeler(getal1, getal2);
	    
	    if (Math.abs(deler)==1) {System.out.printf("\nWe kunnen de breuk %d / %d dus niet vereenvoudigen", getal1, getal2);}
	    else {System.out.printf("\nWe kunnen de breuk %d / %d dus vereenvoudigen tot %d / %d", getal1, getal2,getal1/deler,getal2/deler);}

	}

}
