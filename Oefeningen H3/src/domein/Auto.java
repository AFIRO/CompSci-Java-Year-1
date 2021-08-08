package domein;

public class Auto {
	private String kleur;
	private static int aantalautos,grijzeautos;
	
	private void setKleur(String kleur) {
		this.kleur = kleur;
	}
	
	public String getKleur() {
		return kleur;
	}
	
	public Auto() {
		setKleur("Grijs");
		grijzeautos++;
		aantalautos++;
	}
	
	public Auto(String kleur) {
		setKleur(kleur);
		aantalautos++;
	}
	
	public int getAantalautos() {
		return aantalautos;

	}
	
	public int getGrijzeautos() {
		return grijzeautos;

	}
	
	
	
}
	