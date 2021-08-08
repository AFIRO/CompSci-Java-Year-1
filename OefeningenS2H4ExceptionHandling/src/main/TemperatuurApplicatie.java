package main;


import java.util.InputMismatchException;
import java.util.Scanner;

import domain.thermometer;
import exceptions.BuitenBereikException;

public class TemperatuurApplicatie {

	public static void main(String[] args) {
		thermometer t = new thermometer();
		Scanner s = new Scanner(System.in);
		boolean loopflag = true;
		
		do {
			try {
				System.out.printf("Geef een temperatuur (Fahrenheit) in het interval [%d,%d]: ", t.getONDERGRENS(), t.getBOVENGRENS());
				int input = s.nextInt();
				t = new thermometer(input);
				loopflag = false;
				System.out.printf("De temperatuur is %d", t.converteerNaarCelsius());

			} catch (BuitenBereikException e) {
				System.err.println(e.getMessage());

			} catch (InputMismatchException exception) {
				System.err.println("Foutieve invoer! Moet numeriek zijn!");
				s.nextLine();
			} 
		} while (loopflag);
		

	}

}
