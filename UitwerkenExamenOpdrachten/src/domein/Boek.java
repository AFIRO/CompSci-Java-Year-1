package domein;

public class Boek {
	private String titel, auteur;
    private double prijs;

    public Boek(double prijs, String titel, String auteur) {
                   setPrijs(prijs);
                   setTitel(titel);
                   setAuteur(auteur);}

    private void setPrijs(double prijs) {
                   this.prijs = prijs;}

    public double getPrijs() {return prijs;}

    public String getTitel() {return titel;}

    private void setTitel(String titel) {
                   this.titel = titel;}

    public String getAuteur() { return auteur;}

    private void setAuteur(String auteur) { this.auteur = auteur;}

    @Override
    public String toString() {
                   return String.format("Boek %s van %s kost €%.2f", titel, auteur, prijs);}
}


