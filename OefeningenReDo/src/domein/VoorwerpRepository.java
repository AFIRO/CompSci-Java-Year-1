package domein;


import java.util.ArrayList;
import java.util.List;

public class VoorwerpRepository {
	private List<Voorwerp> collectie;
	
	public VoorwerpRepository() {
		collectie= new ArrayList<>();
	}
	
	public void voegVoorwerpToe(Voorwerp voorwerp) {
		collectie.add(voorwerp);
	}
	
	public String geefOverzicht() {
		
		String output = "";
		if (collectie.isEmpty()) {output = "Collectie is leeg!";}
		
		for (Voorwerp element: collectie) {
			output +=  element.toString() + "\n";
		}
		
		return output;
	}


}
