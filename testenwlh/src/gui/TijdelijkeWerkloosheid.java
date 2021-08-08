package gui;



public class TijdelijkeWerkloosheid {
	
	double aantalUitkeringen, Q, S, dagbedrag, uitkering, P;
	int type;

	public TijdelijkeWerkloosheid(double Q, double S, double dagbedrag, int type, double P) {
		this.Q = Q;
		this.S = S;
		this.dagbedrag = dagbedrag;
		this.type = type;
		this.P = P;
	}



	public double berekenAantalUitkeringen() {
		
		if (type == 2) {
			aantalUitkeringen = (P*6)/Q;
			if (aantalUitkeringen%100 >= 0.25 && aantalUitkeringen%100 <= 0.74) aantalUitkeringen = aantalUitkeringen + 0.5;
				else  aantalUitkeringen++;
			
		}
		
		if (type == 4) {
			aantalUitkeringen = (P*12)/S;
			if (aantalUitkeringen%100 >= 0.5) aantalUitkeringen++;
				
		}
		
		if (type == 57) {
			aantalUitkeringen = (P*6)/S;
			if (aantalUitkeringen%100 >= 0.25 && aantalUitkeringen%100 <= 0.74) aantalUitkeringen = aantalUitkeringen + 0.5;
			else  aantalUitkeringen++;	
		}
		
		if (type == 58) {
			aantalUitkeringen = (P*12)/S;
			if (aantalUitkeringen%100 >= 0.5)  aantalUitkeringen++;
			
			}
		aantalUitkeringen = 5.0;
		return aantalUitkeringen;
		}
	
	
	public double berekenUitkering() {
		return aantalUitkeringen * dagbedrag;

	}
	

}
