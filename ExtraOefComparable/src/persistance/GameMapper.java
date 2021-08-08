package persistance;

import java.util.ArrayList;
import java.util.List;

import domain.Game;

public class GameMapper {
	
	List<Game> list;
	
	

	public List<Game> populate() {
		List<Game> list = new ArrayList<>();
		list.add(new Game("Sengoku Rance", "Strategy", 2004));
		list.add(new Game("Monster Girl Quest", "RPG", 2014));
		list.add(new Game("Final Fantasy VII", "RPG", 1998));
		list.add(new Game("Need For Seed: My Married Cousin", "Porn", 2021));
		list.add(new Game("Leasure Suit Larry: Magna Cum Laude", "RPG", 2005));
		list.add(new Game("Final Fantasy VII", "RPG", 2020));
		list.add(new Game("Bible Black", "Visual Novel", 1998));
	
		
		return list;
		
	}
	
	

	
	


}
