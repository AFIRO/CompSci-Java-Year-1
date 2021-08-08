package cui;
import domein.Verplaatsing;
import domein.VerplaatsingPerAuto;
import domein.VerplaatsingPerBusTram;

public class VerplaatsingApplicatie {
	 public void start() {
		 VerplaatsingPerAuto[] auto = new VerplaatsingPerAuto[2];
		 VerplaatsingPerBusTram[] ov = new VerplaatsingPerBusTram[2];
		 
		 auto[0] = new VerplaatsingPerAuto("Hogent Campus Schoonmeersen", "EFFIX", 25, 0.6, 0.04);
		 auto[1] = new VerplaatsingPerAuto("Aalst", "Brenso", 30, 1.30, 0.05);
		 ov[0] = new VerplaatsingPerBusTram("Schoonmeersen", "Zwijnaarde", 7, 70, false, true);
		 ov[1] = new VerplaatsingPerBusTram("Gent", "Vijfgaten", 3, 22, false, true);
		 
		 double tk = 0;
		 for (VerplaatsingPerAuto element: auto) {
			 System.out.printf("%s\n", element.toString());
			 tk=tk+ element.berekenPrijs();
		 }
		 
		 for (VerplaatsingPerBusTram element: ov) {
			 System.out.printf("%s\n", element.toString());
			 tk=tk+ element.berekenPrijs();
		 }
		 
		 System.out.printf("De totale kosten van deze verplaatseingen samen: €%.2f", tk);
	 }

}
