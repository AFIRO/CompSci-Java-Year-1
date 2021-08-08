package domain;

public class DomainController {
	Jackpot jackpot;
	
	public DomainController() {
		jackpot = new Jackpot();
	}

	public String toonWeergave() {
	return jackpot.toonWeergave();}
	
	public int Speel() {
		return jackpot.draaiWiel();
		
	}
}
