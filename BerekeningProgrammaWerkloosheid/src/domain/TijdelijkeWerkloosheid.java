package domain;



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
				double a = ((Math.round(aantalUitkeringen*100.00))% 100) / 100;
				
				if (a <= 0.24) Math.floor(aantalUitkeringen);
				if  (a >= 0.25 && a <= 0.74) aantalUitkeringen = (Math.round(aantalUitkeringen*2))/2.0;
					else  Math.ceil(aantalUitkeringen);
				
			}
			
			if (type == 4) {
				aantalUitkeringen = Math.round((P*12)/S);
			
					
			}
			
			if (type == 57) {
				aantalUitkeringen = (P*6)/S;
				if (aantalUitkeringen%100 >= 0.25 && aantalUitkeringen%100 <= 0.74) aantalUitkeringen = Math.round(aantalUitkeringen*2)/2.0;
				else  Math.ceil(aantalUitkeringen);	
			}
			
			if (type == 58) {
				aantalUitkeringen = Math.round((P*12)/S);
				
				}
		
			return aantalUitkeringen;
			}
		
		
		public double berekenUitkering() {
			return aantalUitkeringen * dagbedrag;

		}
		

	}


