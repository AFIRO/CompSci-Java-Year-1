package domein;

public class DomeinController {
	private VoorwerpRepository vr;
	
	public DomeinController() {
		vr = new VoorwerpRepository();
	}
	
	public void voegWapenToe(String naam, double gewicht, int niveau, int kracht, boolean gebruikt) {
		Wapen wapen = new Wapen(naam, gewicht, niveau, kracht, gebruikt);
		vr.voegVoorwerpToe(wapen);
	}
	
	public void voegSleutelToe(String naam, double gewicht, int niveau, int deur) {
		Sleutel sleutel = new Sleutel(naam, gewicht, niveau, deur);
		vr.voegVoorwerpToe(sleutel);
	}
	
	public String geefOverzicht() {
		return vr.geefOverzicht();
	}

}
