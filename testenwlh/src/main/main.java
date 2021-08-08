package main;

import java.util.Scanner;

import gui.TijdelijkeWerkloosheid;

public class main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Q?");
		double Q=scanner.nextDouble();
		System.out.println(Q);
		System.out.println("S?");
		double S=scanner.nextDouble();
		System.out.println(S);
		System.out.println("Dagbedrag?");
		double Dagbedrag=scanner.nextDouble();
		System.out.println(Dagbedrag);
		System.out.println("Uren?");
		double P=scanner.nextDouble();
		System.out.println(P);
		System.out.println("Type?");
		int type=scanner.nextInt();
		System.out.println(type);
		
		TijdelijkeWerkloosheid tw = new TijdelijkeWerkloosheid(Q, S, Dagbedrag, type, P);
		System.out.println(tw.berekenAantalUitkeringen());
		System.out.println(tw.berekenUitkering());
		
		}
	
}