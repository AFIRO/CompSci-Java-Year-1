package gui;



public class VergoedbaarheidsregimeType03 extends Uitkering {
	
	double AantalUitkeringenPerWeek, Q, S, DagBedrag, Uitkering;
	
	public VergoedbaarheidsregimeType03(double Q, double S, double dagbedrag) {
		super(Q, S, dagbedrag);
		
	}

	public VergoedbaarheidsregimeType03(double Q, double S) {
		super(Q, S);
	
	}
	
	@Override
	public double berekenAantalUitkeringen() {
		AantalUitkeringenPerWeek = (this.Q * 12) /this.S;
		if (AantalUitkeringenPerWeek % 100 > 0.5) AantalUitkeringenPerWeek++;
		return AantalUitkeringenPerWeek;

	} 
	
	@Override
	public double berekenUitkering() {
		return AantalUitkeringenPerWeek * DagBedrag * 4.3333;
		

	}
	
	

}
