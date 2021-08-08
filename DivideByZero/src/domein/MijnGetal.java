package domein;

import Exceptions.NegativeNumberException;

public class MijnGetal {
	private int getal;
	
	public MijnGetal(int getal)   {
		setGetal(getal);
	}

	private void setGetal(int getal)   {
		if (getal <0) throw new NegativeNumberException("getal moet positief zijn");
		this.getal=getal;
	}
	
	public int geefVierkantswortel() {
		return (int) Math.sqrt(getal);
		
	}

}
