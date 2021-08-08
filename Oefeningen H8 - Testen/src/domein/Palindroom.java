package domein;

public class Palindroom {
	
	public boolean isPalindroom(String tekst) {
		if (tekst.length()==1) {throw new IllegalArgumentException("Tekst moet langer zijn dan 1 karakter");}
		if (tekst.isBlank()||tekst.isEmpty()) {throw new IllegalArgumentException("Ongeldige tekst");}
		String omgekeerd = new StringBuilder(tekst).reverse().toString();
		return (tekst.equalsIgnoreCase(omgekeerd));
	}

}
