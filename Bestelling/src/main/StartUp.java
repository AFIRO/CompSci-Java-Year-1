package main;


import cui.BestellingsApplicatie;
import domein.DomeinController;

public class StartUp {

	public static void main(String[] args) {
		new BestellingsApplicatie(new DomeinController()).start();

	}

}
