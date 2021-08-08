package domain;

public class Domaincontroller {
	private VoorwerpRepository voorwerpRepo;

public Domaincontroller() {
	voorwerpRepo = new VoorwerpRepository();
}

public void voegWapenToe(String naam, double gewicht, int niveau, int kracht, boolean gebruikt) {
	Wapen voorwerp = new Wapen(naam, gewicht, niveau, kracht, gebruikt);
	voorwerpRepo.voegVoorWerpToe(voorwerp);
}

public void voegSleutelToe(String naam, double gewicht, int niveau, int deur) {
	Sleutel voorwerp = new Sleutel(naam, gewicht, niveau, deur);
	voorwerpRepo.voegVoorWerpToe(voorwerp);
}

public String geefOverzicht() {
	return voorwerpRepo.geefOverzicht();
}


}
