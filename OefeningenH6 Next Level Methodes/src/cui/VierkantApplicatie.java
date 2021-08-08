package cui;

import java.util.Scanner;

import domain.Vierkant;

public class VierkantApplicatie {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int input;
		System.out.print("Geef de x-coordinaat van de linkerbovenhoek: ");
		int x = s.nextInt();
		System.out.print("Geef de y-coordinaat van de linkerbovenhoek: ");
		int y = s.nextInt();
		System.out.print("De zijden van de vierkant hebben ook een lengte. Geef deze lengte in: ");
		int zijde = s.nextInt();
		Vierkant vk = new Vierkant(x, y, zijde);
		System.out.printf("%s",vk.toString());
		
		
		do {
			input = maakKeuzeinMenu();
			if (input == 1) {vk.krimp(); System.out.printf("%s",vk.toString());}
			if (input == 2) {vk.groei(); System.out.printf("%s",vk.toString());}
			if (input == 3) {System.out.print("Geef de x-coordinaat van de linkerbovenhoek: ");
							int x2 = s.nextInt();
							System.out.print("Geef de y-coordinaat van de linkerbovenhoek: ");
							int y2 = s.nextInt();
							vk = new Vierkant(x2, y2, zijde);
							System.out.printf("%s",vk.toString());}
			
		} while (input<4);
				
		}

	

private static int maakKeuzeinMenu() {
	Scanner s = new Scanner(System.in);
	System.out.print("\nMenu:\n");
	System.out.print("1) Krimpen van het bestaande bestaande vierkant\n");
	System.out.print("2) Groeien van het bestaande vierkant\n");
	System.out.print("3) Een nieuwe linkerbovenhoek definiëren\n");
	System.out.print("4) Applicatie afsluiten ");
	return s.nextInt();
}
}
