package domein;

import java.math.BigDecimal;

public class Zichtrekening {
	
	private BigDecimal saldo;
	
	public Zichtrekening() {
		BigDecimal newsaldo = new BigDecimal(0);
		this.saldo=newsaldo;
	}
	
	public BigDecimal getSaldo() {
		return saldo;
		
	}
	
	public void storten(BigDecimal bedrag) {
		BigDecimal bg = new BigDecimal(0);
		int compare = bedrag.compareTo(bg);
		if (bedrag.equals(null)) {throw new IllegalArgumentException("Ongeldig bedrag");}
		if (compare==-1) {throw new IllegalArgumentException("Negatief saldo kan not gestort worden.");}
		this.saldo= saldo.add(bedrag);
		
		
	}
	

}
