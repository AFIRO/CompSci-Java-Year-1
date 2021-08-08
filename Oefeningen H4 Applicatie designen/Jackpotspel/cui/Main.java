package cui;
import domain.DomainController;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		DomainController DC;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Wenst u te spelen? (Y/N) ");
		String input = s.next();
		if (input.equals("Y")) {
			DC = new DomainController();
			System.out.println("Uw huidige getallen zijn: 0 0 0.\n Wenst u te rollen? (Y/N) ");
			input = s.next();
			while (input.contentEquals("Y")) {
			   System.out.printf("Uw score is %d", DC.Speel());
			   System.out.printf("\nU rolde : %s", DC.toonWeergave());
			   System.out.println("\nWenst u opnieuw te rollen? (Y/N) ");
				input = s.next();}
			System.out.println("\nJa,rot dan op hé!");
		
		}

	}

}
