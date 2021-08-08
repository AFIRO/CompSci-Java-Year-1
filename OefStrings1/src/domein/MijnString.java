package domein;

public class MijnString {
	private String inhoud;
	
	public MijnString() {
		super();
	}

	public MijnString(String inhoud) {
		super();
		this.inhoud = inhoud;
	}
   
	

	public char bepaalMiddelsteKar() {
		
		return inhoud.charAt(inhoud.length()/2);
		
	}
	
	public boolean isPalindroom() {
		
		
		
		return inhoud.equals(new StringBuilder(inhoud).reverse().toString());
		
	}
}
