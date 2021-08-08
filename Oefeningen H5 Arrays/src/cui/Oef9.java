package cui;

import Domein.Rekening;
import java.util.Scanner;

public class Oef9 
{
	public static void main(String[] args) 
	{
	Rekening[][] rekeningArray;
	rekeningArray = new Rekening[3][];
	Scanner S = new Scanner (System.in);
	
	System.out.print("Geef aantal kolommen in voor rij 1: ");
	int a = S.nextInt();
	System.out.print("Geef aantal kolommen in voor rij 2: ");
	int b = S.nextInt();
	System.out.print("Geef aantal kolommen in voor rij 3: ");
	int c = S.nextInt();
	
	rekeningArray[0] = new Rekening[a];
	rekeningArray[1] = new Rekening[b];
	rekeningArray[2] = new Rekening[c];
	double startBedrag = 10.00;
	int i = 0;
	int y = 0;
	
	for (Rekening[] row: rekeningArray) {
		for (Rekening element: row) {
			rekeningArray[i][y] = new Rekening();
			rekeningArray[i][y].stortOp(startBedrag);
			startBedrag=startBedrag + 10.00;
			y++;
		}
		i++;
	startBedrag = (startBedrag - (10.00*(row.length-1)));
	startBedrag++;
		
	}
	
	for (Rekening[] row: rekeningArray) {
		for (Rekening element: row) {
			System.out.printf("%2.f  ", element.getSaldo());
		}
	
	}

	
		
	} }
