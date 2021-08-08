package domain;

import java.security.SecureRandom;
import java.util.Arrays;

public class KopOfMunt {
	
	private boolean worp,geraden;
	SecureRandom random = new SecureRandom();
	
	public KopOfMunt() {
		worp= random.nextBoolean();}
	
	public boolean getWorp() {
		return worp;}
	
	public void setGeraden(boolean geraden) {
		this.geraden = geraden;}
	
	public boolean isJuistGeraden() {
		if (this.worp==this.geraden)
			return true;
		else return false;}
	
	private String zetOmNaarKopOfMunt(boolean trueOfFalse) {
		if (trueOfFalse) return "kop";
		else return "munt";}
	
	public String geefInfoWorp() {
	String[] m = new String[3];
		m[0]= this.zetOmNaarKopOfMunt(worp);
		m[1]= this.zetOmNaarKopOfMunt(geraden);
		if (isJuistGeraden())
			m[2]="juist";
			else m[2]="fout";
		String f= Arrays.toString(m);
		return f;}
	
	
	}
	


