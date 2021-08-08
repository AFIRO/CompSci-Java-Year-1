package domein;

public class DomeinController {
	private  Cryptografie crypto;
	private String gecodeerdBericht;
	
	public DomeinController() {
		this.crypto = new Cryptografie();
	}
	
	public void codeerBericht(String bericht) {
		this.gecodeerdBericht = crypto.codeerBericht(bericht);
		
	}
	
	public String geefGecodeerdeBericht() {
		return gecodeerdBericht;
		
	}

}
