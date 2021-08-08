package domein;

public class MijnString {
	private String inhoud;
	
	
	public MijnString() {
		// TODO Auto-generated constructor stub
	}
	
	public MijnString(String inhoud) {
		setInhoud(inhoud);
	}
	
	public char bepaalMiddeldsteKar() {
		return inhoud.charAt(inhoud.length()/2);
		
	}
	
	public boolean isPalindroom() {
		
		return inhoud.equals(new StringBuilder(inhoud).reverse().toString());
		
	}
	
	private void setInhoud(String inhoud) {
		this.inhoud=inhoud;
		
	}
	
	public String keerOm() {
		return new StringBuilder(this.inhoud).reverse().toString();
		
	}
	
	public String maakWartaal(char oud, char nieuw) {
		return inhoud.replace(oud, nieuw);
		
	}

}
