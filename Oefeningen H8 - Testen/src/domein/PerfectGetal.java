package domein;

public class PerfectGetal {
	
	public boolean isPerfectGetal(int getal) {
		if (getal <0) {throw new IllegalArgumentException("Getal mag niet negatief zijn");}
		if (getal ==0|getal==1) {return false;}
		if (getal==this.somVanDelers(getal)) {return true;}
		else return false;
	}
	
	private int somVanDelers(int x) {
		int som = 0;
		for (int i = 1; i <=x-1 ;i++) {
			if (x%i==0) {som=som+i;}
		}
		System.out.println(som);
		return som;
	}

}
