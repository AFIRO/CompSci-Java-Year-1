package domein;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;

import persistentie.StripFiguurMapper;
import sun.security.provider.SecureRandom;

public class Repository 
{
	private final List<StripFiguur> lijstStripFiguren;
	private final StripFiguurMapper mapper;

	public Repository() 
	{
		this.mapper = new StripFiguurMapper();
		lijstStripFiguren = new ArrayList<>(Arrays.asList(mapper.geefStripfiguren()));
		
	}	
	
	public List<StripFiguur> getLijstStripFiguren() {
		
		return lijstStripFiguren;
	}
	
	public List<StripFiguur> getLijstStripFigurenGesorteerdOpNaam() {
		
		//Collections.sort(getLijstStripFiguren(), (o1,o2) -> o1.getNaam().compareTo(o2.getNaam()));
		//return  lijstStripFiguren;
		
		
		return  lijstStripFiguren	.stream()
									.sorted(Comparator.comparing(StripFiguur::getNaam))
									.collect(Collectors.toList());
	}


	public List<StripFiguur> getLijstStripFigurenGesorteerdOpAflopendeGrootte() {
		
		//Collections.sort(getLijstStripFiguren(), (o1,o2) -> -1 * Double.valueOf(o1.getGrootte()).compareTo(o2.getGrootte()));
		
		return  lijstStripFiguren	.stream()
									.sorted((o1,o2) -> -1 * Double.valueOf(o1.getGrootte()).compareTo(o2.getGrootte()))
									.collect(Collectors.toList());
	}

	public Set<StripFiguur> haalDubbelsEruit() 
	{	
		//Set<StripFiguur> output = new HashSet<>(getLijstStripFiguren());
		
		return lijstStripFiguren.stream().distinct().collect(Collectors.toSet());
	}
	
	public List<StripFiguur> pick3()
	{	//List<StripFiguur> output = getLijstStripFiguren();
		//Collections.shuffle(output);
		//return output.subList(0, 3);
		
		Comparator<StripFiguur> comp = (o1,o2) -> {
			ArrayList<Integer> list = new ArrayList<>(Arrays.asList(-1,0,1));
			Collections.shuffle(list);
			return list.get(0);
			
		};
		
		
		
		return lijstStripFiguren.stream().sorted(comp).limit(3).collect(Collectors.toList());
	}

	public void voegStripFiguurToe(String naam, double grootte) {
		StripFiguur nieuw = new StripFiguur(naam, grootte);
		lijstStripFiguren.add(nieuw);
		
	}
	
	public void voegExtraStripfigurenToe() {
		lijstStripFiguren.addAll(Arrays.asList(mapper.geefExtraStripfiguren()));
		
		
	}




}
