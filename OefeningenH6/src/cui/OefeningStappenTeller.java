package cui;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import domain.Stappenteller;

public class OefeningStappenTeller {

	public static void main(String[] args) {
		int startuur,einduur;
		Oefening5 hulp = new Oefening5();
		List<Stappenteller> lijst = new ArrayList<>();
		startuur= hulp.voerUurIn("Geef het uur waarop je bent opgestaan", 0, 23);
		einduur= hulp.voerUurIn("Geef het uur waarop je bent gaan slapen", startuur, 23);
		
		
		
		
	}
		
		
		
		private Stappenteller maakStappenteller(int hetUur) {
			Scanner s = new Scanner(System.in);
			System.out.printf("Wat heb je om %d uur gedaan? ", hetUur);
			String activiteit = s.next();
			System.out.print("\nHoeveel stappen heb je gezet (max 1000)? ");
			int hoeveelheid = s.nextInt();
			System.out.print("\nGeef 1 voor vlak, 2 voor bergop, 3 voor bergaf: ");
			int soort = s.nextInt();
			Stappenteller String.format("%d",hetUur) = new Stappenteller(activiteit, hoeveelheid, soort);
			
			
		}
		
		private int voerUurIn (String prompt, int van, int tot) {
			Scanner s = new Scanner(System.in);
			int input;
			do {System.out.printf("\n%s", prompt + "tussen %d en %d", van, tot);
			input = s.nextInt();} while (input < van || input >tot);
			return input;}
			
	

	}


