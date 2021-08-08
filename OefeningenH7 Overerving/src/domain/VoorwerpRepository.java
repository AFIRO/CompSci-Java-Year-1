package domain;
import java.util.ArrayList;
public class VoorwerpRepository {
	
private ArrayList<Voorwerp> collectie; 

public VoorwerpRepository() {
	 collectie = new ArrayList<Voorwerp>();
	
	}

public void voegVoorWerpToe(Voorwerp voorwerp) {
	this.collectie.add(voorwerp);
}

public String geefOverzicht() {
	String t = "";
	if (this.collectie.isEmpty()) return "De collectie is leeg.";
	for (Voorwerp element:this.collectie) {
		t= t + element.toString() + "\n";}
	return t;
}

}
