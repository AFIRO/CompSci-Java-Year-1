package domein;

public class Atleet {
    private static final double ENERGIE_VERBRUIK_PER_KM = 150.0;
    private static final double INITIELE_ENERGIE = 6000.0;

    private final String naam;
    private double energie;

    public Atleet(String naam) {
        controleerNaam(naam);
        this.naam = naam;

        setEnergie(INITIELE_ENERGIE);
    }

    private void controleerNaam(String naam) {
        if (naam == null || naam.isBlank()) {
            throw new IllegalArgumentException("Naam mag niet leeg zijn.");
        }
    }

    public String getNaam() {
        return naam;
    }

    public double getEnergie() {
        return energie;
    }

    private void setEnergie(double energie) {
        this.energie = energie;
    }

    public void doeLoopOefening(int afstand) {
        if (afstand <= 0) {
            throw new IllegalArgumentException("Ongeldige afstand");
        }

        if (afstand > berekenResterendeAfstand()) {
            throw new IllegalArgumentException("Onvoldoende energie");
        }

        energie -= ENERGIE_VERBRUIK_PER_KM * afstand;
    }

    public double berekenResterendeAfstand() {
        return energie / ENERGIE_VERBRUIK_PER_KM;
    }
}

