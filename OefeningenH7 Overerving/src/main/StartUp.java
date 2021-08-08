package main;
import domain.Domaincontroller;
import ui.VoorwerpApplicatie;

public class StartUp {

	public static void main(String[] args) {
		Domaincontroller dc = new Domaincontroller();
		VoorwerpApplicatie vw = new VoorwerpApplicatie();
		vw.start(dc);

	}

}
