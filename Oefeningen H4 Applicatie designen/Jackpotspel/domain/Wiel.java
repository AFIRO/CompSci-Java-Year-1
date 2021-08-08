package domain;
import java.security.SecureRandom;

public class Wiel {
	private int getal;
	java.security.SecureRandom sr = new SecureRandom();
	
	public Wiel() {
		this.setGetal(0);
	}
	
	private void setGetal(int getal) {
		if (getal >=0 || getal <=9) this.getal = getal;
	}
	
	public int draaiWiel() {
		this.setGetal(0+ sr.nextInt(9));
		return this.getal;
		
	}
	
	public int getGetal() {return this.getal;}

	

}
