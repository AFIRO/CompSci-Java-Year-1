package domain;

public class ArrayBewerking {
	
	public double[] deel (int[] rij1, int[]rij2) {
		double[] antwoord = new double[rij1.length];
		for (int i=0;i<=rij1.length; i++) {
			antwoord[i] = rij1[i]/rij2[i];}
		return antwoord;
		}
	
	public void schuifOp (double[]rij, int aantalPlaatsen) {
		for (int i = 0; i<=rij.length-aantalPlaatsen;i++) {
			double tijdelijk = rij[i+aantalPlaatsen];
			rij[i+aantalPlaatsen] = rij[i];
			rij[i+aantalPlaatsen]= tijdelijk;}
		}
		
		public String toonRij(double [] rij) {
			String output = null;
			for (double element: rij) {
				output+= String.format("%10%.2f%", element);}
			return output;
			}
		
		public String toonRij(int [] rij) {
			String output = null;
			for (int element: rij) {
				output+= String.format("%10%d%", element);}
			return output;
			}
		

}
	
	


