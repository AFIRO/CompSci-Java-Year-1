package main;
import cui.VerplaatsingApplicatie;
import cui.VoorwerpApplicatie;
import domein.DomeinController;

public class StartUp {

	public static void main(String[] args) {
		DomeinController dc = new DomeinController();
		VoorwerpApplicatie vw = new VoorwerpApplicatie(dc);
		vw.start();

	}

}
