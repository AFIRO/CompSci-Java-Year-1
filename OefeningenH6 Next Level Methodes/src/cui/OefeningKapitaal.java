package cui;
import domain.Kapitaal;
import java.util.Scanner;

public class OefeningKapitaal {

	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.print("Geef het startkapitaal (0 om te stoppen): ");
	double beginBedrag = s.nextDouble();
	System.out.print("Geef het aantal jaar: ");
	int n = s.nextInt();
	
	while (n<0) {
		System.out.print("Geef het aantal jaar: ");
		n = s.nextInt();}
	
	System.out.print("Geef het interestpercentage: ");
	double intrest = s.nextDouble();
	Kapitaal kap = new Kapitaal(beginBedrag, intrest);
	System.out.printf("Het kapitaal van €%.2f groeit bij een intrest van %.2f na %d jaar aan tot %.2f.", beginBedrag, intrest, n,kap.berekenKapitaalNaNJaar(n));
	

	}

}
