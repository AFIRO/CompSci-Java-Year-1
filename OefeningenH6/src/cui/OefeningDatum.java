package cui;

import java.util.Scanner;

import domain.DatumControle;

public class OefeningDatum {

	public static void main(String[] args) {
		int datum = 0;
		Scanner s = new Scanner(System.in);
		while (datum !=1313) {
		System.out.printf("\ngeef datum (DDMM) (STOP met 1313): ");
        DatumControle dc = new DatumControle();
        datum = s.nextInt();
        boolean geldig = dc.controleerDatumDDMM(datum);
        if (geldig) {System.out.printf("\nDe datum %d is geldig.", datum);}
        else {System.out.printf("\nDe datum %d is ongeldig.", datum);} } 
	}}


