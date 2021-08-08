package domain;

public class IsPriemGetal {

	private boolean isPriemGetal (int getal) {
		 boolean antwoord = true;
		 if (getal <=1) {antwoord=false;}
		 for (int i = 2; i<=getal/2;i++) {
			 if (getal%i == 0) {antwoord = false;}
		 }
		 return antwoord;
	}	
	
}
