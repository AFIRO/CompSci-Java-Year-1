package cui;
import Domein.Rekening;

public class RekeningApplicatie {
	
		public static void main(String[] args) 
		{

double[] bedragen = {100,777.77,287.15,-350,399.99,123.45,987.65,-68.18,413.26};
final int aantalRekeningen = bedragen.length;
Rekening[] rekeningen = new Rekening[aantalRekeningen];
long rekeningnummer = 0;
String houder = "A";

for (int count = 0; count < aantalRekeningen; count++) {
	houder = String.format("%c", 'A' + count);
	rekeningen[count] = new Rekening(rekeningnummer,houder);
	++rekeningnummer;
	rekeningen[count].stortOp(bedragen[count]);}

for (Rekening r: rekeningen)
{
	double saldo = r.getSaldo();
	String uitvoer = String.format("Rekening %d van %s bevat %.2f%n", r.getRekeningnummer(), r.getHouder(), saldo);
	double gemiddelde = saldo;}

}
		

	}


