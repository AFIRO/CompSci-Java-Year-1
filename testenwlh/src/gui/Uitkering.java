package gui;

public abstract class Uitkering {
	private double Q,S, Dagbedrag, V, aantalUitkeringen;
	
	public Uitkering(double Q, double S) {
		this.setQ(Q);
		this.setS(S);
		this.Dagbedrag = 1;
		
	}
	
	public Uitkering(double Q, double S, double dagbedrag) {
		this.setQ(Q);
		this.setS(S);
		this.setDagbedrag(dagbedrag);
		
	}
	
	public double getQ() {
		return Q;
	}
	
	public double getS() {
		return S;
	}
	
	public double getAantalUitkeringen() {
		return aantalUitkeringen;
	}
	
	private void setQ(double q) {
		if (q <=0) throw new IllegalArgumentException("Q moet groter zijn dan nul");
		else this.Q = q;
	}
	
	private void setS(double s) {
		if (s <=0) throw new IllegalArgumentException("S moet groter zijn dan nul");
		else this.S = s;
	}
	
	private void setDagbedrag(double dagbedrag) {
		if (dagbedrag <= 0) throw new IllegalArgumentException("dagbedrag moet groter zijn dan nul");
		else this.Dagbedrag = dagbedrag;
	}
	
	public abstract double berekenAantalUitkeringen();
	public abstract double berekenUitkering();

}
