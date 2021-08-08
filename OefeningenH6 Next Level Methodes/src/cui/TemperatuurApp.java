package cui;
import domain.TemperatuurBewerking;

public class TemperatuurApp {

	public static void main(String[] args) {
		int temp[][]={{4,-3,2,0,-5},{-1,8,3},{11,3,7,9},{10,14,7,5},{10,9,17,14,21},{18,10,24,27,14,22},{17,32,27,24,25},{31,28,22,30,17},{22,24,17,14,12,11},{12,14,9,7,12},{7,11,14,11,6,0,7},{3,-1,-3,5}};
		TemperatuurBewerking tb = new TemperatuurBewerking();
		System.out.printf("%s", tb.formateerGemiddeldenPerMaand(temp));
		System.out.printf("%s",tb.formateerMaximumTemperatuurDecember(temp[temp.length-1]));
	}

}
