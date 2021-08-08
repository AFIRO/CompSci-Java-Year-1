package domein;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import persistentie.VliegmaatschappijMapper;

public class VliegmaatschappijRepository 
{
	private final List<Vliegmaatschappij> maatschappijen;
    private final VliegmaatschappijMapper vm;
    
    public VliegmaatschappijRepository() 
    {
    	vm = new VliegmaatschappijMapper();
        maatschappijen = vm.geefLijstVliegmijen();
	}

	public List<Vliegmaatschappij> getMaatschappijen() {
		return maatschappijen;
	}

	public List<Vliegmaatschappij> geefAlleAirlinesMetMinstensAantalPartners(int aantal) {
		return maatschappijen.stream()	.filter((maatschappij) -> maatschappij.getPartners().size() > aantal+1)
										.collect(Collectors.toList());
		
	}

	public List<Vliegmaatschappij> geefAirlinesAlfabetischGesorteerd() {
		return maatschappijen.stream().sorted((o1,o2) -> o1.getNaam().compareTo(o2.getNaam())).collect(Collectors.toList());
	}

	public List<Vliegmaatschappij> geefAirlinesGesorteerdVolgensAantalPartners() {
		return maatschappijen	.stream()
								.sorted((o1,o2)-> Integer.valueOf(o1.getPartners().size()).compareTo(o2.getPartners().size()))
								.collect(Collectors.toList());
	}

	public Map<Vliegmaatschappij,Integer> geefAirlinesAantalKeerPartner() 
	{
		
		
		return null;
	}
    
	public String geefEersteAirlineStartendMet(String woord)
	{	
		//Vliegmaatschappij output = maatschappijen.stream().filter((e)-> e.getNaam().startsWith(woord) == true).findFirst().orElse(null).getNaam();
		
		return maatschappijen.stream().filter((e)-> e.getNaam().startsWith(woord)).findFirst().map((e)-> e.getNaam()).orElse("Bestaat niet");
	}
	
	public Vliegmaatschappij geefEenAirlineMetPartner(String partner)
	{
		
		return maatschappijen.stream().filter((e)-> e.isPartner(partner)).findAny().orElse(null);
	}

}
