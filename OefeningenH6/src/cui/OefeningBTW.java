package cui;

import java.util.Scanner;

public class OefeningBTW {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Geef uw BTW nummer in: ");
		int nr = s.nextInt();
		Oefening1 hulp = new Oefening1();
		if (hulp.isGeldig(nr)) {System.out.println("BTW nummer is geldig.");}
		else System.out.println("BTW nummer is ongeldig.");
		}
		
		
		 private boolean isGeldig(int nr) {
			int controle = nr%100;
			nr=(nr/100)%97;
			controle = controle+nr;
			if (controle == 97) {return true;}
			else return false;
		
	}


		

	
}
