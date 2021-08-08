package domain;

public class BerekeningGGD {
	
	public int berekenGrootsteGemeneDeler(int getal1, int getal2) {
		int ggd = 0;
		getal1=Math.abs(getal1);
		getal2=Math.abs(getal2);
		for (int i=1; i <=getal1 && i<=getal2;i++) {
			if (getal1%i==0 && getal2%i==0) {
				ggd=i;}
			}
		System.out.printf("De grootste gemene deler van %d en %d is %d.", getal1, getal2, ggd);
			return ggd;
		
		
	}

}
