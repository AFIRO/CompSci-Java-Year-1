package cui;

import java.util.Scanner;

import domein.Boek;

public class BoekApplicatie {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Boek[] boeken = new Boek[3];
		BoekApplicatie hulp = new BoekApplicatie();
		maakBoekenCollectieAan();
		System.out.printf("%d", geefOverzichtBoekenCollectie(boeken));
		
		System.out.printf("\n Geef het aantal verkopers van boeken in: ");
		int aantalverkopers = s.nextInt();
		int[][] verkoopcijfers = new int[aantalverkopers][boeken.length];
		hulp.vulVerkoopcijfersVanAlleVerkopersAan(verkoopcijfers, boeken);
		System.out.println();hulp.geefOverzichtVerkoopcijfers(verkoopcijfers);
		System.out.printf("%s",hulp.geefOverzichtVerkoopcijfers(verkoopcijfers));
		}

	private void vulVerkoopcijfersVanAlleVerkopersAan(int[][] verkoopcijfers, Boek[] boeken) {
		Scanner s = new Scanner(System.in);
		for (int i = 0; i < verkoopcijfers.length; i++) {
			System.out.printf("Verkoper %d", i+1);
			this.vulVerkoopcijfersVanVerkoperAan(verkoopcijfers[i], boeken);}
	}
	
	private void vulVerkoopcijfersVanVerkoperAan (int[] verkoopcijfersEénVerkoper, Boek[] boeken) {
		Scanner s = new Scanner(System.in);
		for (int i = 0; i < verkoopcijfersEénVerkoper.length; i++) {
			System.out.printf("\nGeef het aantal verkochte exemplaren voor %s: ", boeken[i]);
			verkoopcijfersEénVerkoper[i]= s.nextInt();}
		}
	
	private String geefOverzichtVerkoopcijfers(int[][]verkoopcijfers) {
		String output = String.format("Overzicht van de verkoopcijfers: \n");
		for (int i = 0; i< verkoopcijfers.length; i++) {
			output = output + String.format("Verkoper %d",i+1);
			int somverkoper = 0;
			for (int y = 0; y < verkoopcijfers[i].length; y++)
			{output = output + String.format("   %d   ", verkoopcijfers[i][y]);
			somverkoper = somverkoper + verkoopcijfers[i][y];}
			output = output + String.format("=>    %d", somverkoper);}
			
	return output;}
	
	private static Boek[] maakBoekenCollectieAan() {
		Boek[] boeken = new Boek[3];
		String[] titels = { "Het diner", "Gran Canaria", "Steve Jobs" };
		String[] auteurs = { "Herman Koch", "Michelin", "Walter Isaacson" };
		double[] prijzen = { 15.95, 9.95, 15.99 };
		
		for (int i=0; i<boeken.length;i++)
			{boeken[i] = new Boek(prijzen[i], titels[i], auteurs[i]);}
		return boeken;
		
	}
	
	private static String geefOverzichtBoekenCollectie(Boek[] boeken) {
		String output = "";
		
		for (Boek element:boeken) {
			output = String.format("%s\n", element.toString());}
		return output;
		
		}
	}


