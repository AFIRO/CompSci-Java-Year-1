package domein;

public class Kluis {
	private String code;
	
	public Kluis(String code) {
		this.controleerCode(code);
		this.code=code;
	}
	
	private void controleerCode(String code) {
		if (code.contains(" ")) {throw new IllegalArgumentException("Code mag geen spaties bevatten");}
		if (code.length()!=4) {throw new IllegalArgumentException("Code moet bestaan uit 4 karakters");}
	}
    
	public boolean valideerCode(String code) {
		if (this.code.equals(code)) {return true;}
		else return false;
	}
}
