package domain;

public class TemperatuurBewerking {
	private static String[] maand = {"januari","februari","maart","april","mei","juni","juli","augustus","september","oktober","november", "december"};
	
	public String berekenGemiddeldenPerMaand(int[] t) {
		double gemiddelde = 0;
		
		for (int element: t) {
			gemiddelde += element;}
		return String.format("%.2f", gemiddelde/t.length);
		
	}
	
	public int bepaalMaximumTemperatuur(int[] temp) {
		int max = 0;
		for (int element: temp) {
			if (element > max) {max = element;}
		}
		return max;
		
	}
	public String formateerGemiddeldenPerMaand(int[][] t) {
		String output="";
		for (int i = 0; i < t.length;i++) {
			output = output + String.format("in %s: %s\n", maand[i], this.berekenGemiddeldenPerMaand(t[i]));
		}
		return output;
		
	}
	
	public String formateerMaximumTemperatuurDecember(int[] temp) {
		
		return  String.format("\nDe maximum temperatuur in december is %d", this.bepaalMaximumTemperatuur(temp));
	}
	
}
