package persistentie;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

import domein.Bromfiets;
import domein.Mountainbike;
import domein.Soort;
import domein.Stadsfiets;
import domein.Tweewieler;

public class TweewielerMapper {
	
	public TweewielerMapper() {
		
	}
	
	public List<Tweewieler> leestTekstBestandTweewielers(String naamBestand) {
		
		List<Tweewieler> list = new ArrayList<>();
		
		Scanner input = null;
		
		try {
			input = new Scanner(Files.newInputStream(Paths.get(naamBestand)));
		} catch (IOException e) {
			System.err.println("Geen schrijftoegang");
		} catch (InvalidPathException e) {
			System.err.println("Geen pad");
		}
		
		while (input.hasNext()) {
			try {
				if (input.next() == "S")
					leesStadsFietsUitBestand(input, list);
				
				if (input.next() == "M")
					leesMountainBikeUitBestand(input, list);
				
				if (input.next() == "B")
					leesBrommerUitBestand(input, list);
			} catch (InputMismatchException e) {
				System.err.println("element verkeerd");
			} catch (IllegalStateException e) {
				System.err.println("Scanner dicht");
			}
			
		}
		
		input.close();
		return list;
		
		
	}

	private void leesBrommerUitBestand(Scanner input, List<Tweewieler> list) {
		list.add(new Bromfiets(input.next().charAt(0), input.next()));
		
	}

	private void leesMountainBikeUitBestand(Scanner input, List<Tweewieler> list) {
		list.add(new Mountainbike(input.nextInt(), input.nextBoolean(), new Soort(input.next())));
		
	}

	private void leesStadsFietsUitBestand(Scanner input, List<Tweewieler> list) {
		list.add(new Stadsfiets(input.nextInt(), input.nextBoolean(), input.nextLine()));
		
	}
	
	public void serialiseerVolledigeLijst(List<Tweewieler> list, String naamBestand) {
		ObjectOutputStream output = null;
		
	
		try {
			output = new ObjectOutputStream(Files.newOutputStream(Paths.get(naamBestand)));
			
			
			for (Tweewieler tweewieler : list)
				output.writeObject(tweewieler);
			
			output.close();
		} catch (IOException e) {
			System.err.println("Geen schrijftoegang");
		} catch ( InvalidPathException e) {
			System.err.println("Geen pad");
		}
		
		
	}

}
