//Dit is de repository
package domein;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import persistentie.BierMapper;

public class BierWinkel {

    private final List<Bier> bieren;
    private BierMapper bm = new BierMapper();

    public BierWinkel() {
        bieren = bm.geefLijstBieren();
    }

    public List<Bier> getBieren() {
        return bieren;
    }

    //VOOR APP1
    public long geefAantalBierenMetMinAlcoholPercentage(double percentage) {
    	return bieren.stream().filter((e)-> e.getAlcoholgehalte()>=percentage).count();
    }

    public List<Bier> geefAlleBierenMetMinAlcoholPercentage(double percentage) {
    	return bieren.stream().filter((e)-> e.getAlcoholgehalte()>=percentage).collect(Collectors.toList()); 
    	}

    public List<String> geefNamenBieren() {
    	return bieren.stream().map((e)-> e.getNaam()).collect(Collectors.toList());
    }
        
    //Bier met hoogst aantal graden
    public Bier geefBierMetHoogsteAlcoholPercentage() {
    	
    	return bieren.stream().sorted(Comparator.comparing(Bier::getAlcoholgehalte).reversed()).findFirst().orElse(null);
    	
    }

    //Bier met laagst aantal graden
    public Bier geefBierMetLaagsteAlcoholPercentage() {
    	return null;
    }

    /*Zorg ervoor dat het resultaat gesorteerd wordt op alcoholgehalte van hoog naar laag, 
     en bij gelijk aantal graden op naam (alfabetisch).
     */
    public List<Bier> sorteerOpAlcoholGehalteEnNaam() {
    	return null;
    }

    //Alle brouwerijen
    public List<String> geefAlleNamenBrouwerijen() {
    	return null;
    }

    //Alle brouwerijen die het woord "van" bevatten
    public List<String> geefAlleNamenBrouwerijenMetWoord(String woord) {
    	return null;
    }

}
