package domein;

import java.math.BigDecimal;

public class Fiets {
	protected static String[]TYPES = {"Herenfiets","Damesfiets","Kinderfiets"};
	private String kleur;
	private int aantalVernsellingen;
	private BigDecimal prijs;
	
	public Fiets() {
		// TODO Auto-generated constructor stub
	}
	
	public String toString() {
		return "fiets";
	}

	
}
