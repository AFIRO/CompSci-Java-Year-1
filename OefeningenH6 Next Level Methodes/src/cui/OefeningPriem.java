package cui;

import java.security.SecureRandom;
import java.util.Scanner;

public class OefeningPriem {

	public static void main(String[] args) {
		
	drukRes(isPriemGetal(geefRandomGetal(leesInteger())));
		
}

private static boolean isPriemGetal (int getal) {
	 boolean antwoord = true;
	 if (getal <=1) {antwoord=false;}
	 for (int i = 2; i<=getal/2;i++) {
		 if (getal%i == 0) {antwoord = false;}
	 }
	 return antwoord;
}

private static int leesInteger() {
	Scanner s = new Scanner(System.in);
	int input = 0;
	do {System.out.println("Geef strikt positief getal in: ");
	    input=s.nextInt();
	} while (input <=0);
	return input;
}

private static int geefRandomGetal(int n) {
	SecureRandom sr = new SecureRandom();
	int random=sr.nextInt(n);
	System.out.printf("Het random bepaalde getal tussen 0 en %d is %d.",n, random);
	return random;
}

private static void drukRes(boolean janee) {
	if (janee) {System.out.println("\nDit getal is een priem getal.");}
	else System.out.println("\nDit getal is geen priem getal.");
}

}
 