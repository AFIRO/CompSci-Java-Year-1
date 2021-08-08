package domain;

import java.util.Collections;
import java.util.List;

import persistance.GameMapper;

public class DomeinController {
	
	GameMapper gm;
	List<Game> list;

	public DomeinController() {
		super();
		gm = new GameMapper();
		list = gm.populate();
		
	}
	
	public void printList() {
				
		for (Game e : list)
			System.out.println(e.toString());
	}
	
	public void sortList() {
		System.out.println("");
		System.out.printf("List after sorting List%n");
		System.out.println("");
		Collections.sort(list);
		
	}
	
	

}
