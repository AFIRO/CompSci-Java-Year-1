package cui;
import domain.KopOfMunt;
import java.util.Scanner;

public class KopOfMuntSpel {

	public static void main(String[] args) {
		
//init var		
		int score;
		
System.out.println("Welkom bij het spel \"Kop of munt\"");
System.out.println("Raad 10 keer of een worp kop of munt zal opleveren.");
System.out.println("Uw score wordt bepaald door het aantal juiste voorspellingen");

KopOfMunt[] spel = new KopOfMunt[10];
Scanner S = new Scanner(System.in);
//populate array
for (int i=0; i<=9;i++) {
	spel[i]= new KopOfMunt();}
speelSpel(spel);
geefOverzichtSpel (spel);
}
		
	private static void speelSpel(KopOfMunt[] spel) {
		//create array and scanner
		int keuze;
		Scanner S = new Scanner(System.in);
		//game loop
		for (int y=1;y<=10;y++) {
			System.out.printf("Worp %d: wordt het kop (1) of munt (2)? ",y);
			keuze=S.nextInt();
			if (keuze==1) spel[y-1].setGeraden(true);
			else spel[y-1].setGeraden(false);}}
	
	private static void geefOverzichtSpel(KopOfMunt[] spel) {
		int score=0;
		System.out.println();
		System.out.print("WORP    GERADEN    EVALUATIE\n");
		for (KopOfMunt i: spel) {
			System.out.printf("%s\n",i.geefInfoWorp());
			if (i.isJuistGeraden()) score++;}
		System.out.println();
		System.out.printf("Je behaalt %d op 10.",score);
	}

	}
	

