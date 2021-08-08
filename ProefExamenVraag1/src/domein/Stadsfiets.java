package domein;

public class Stadsfiets extends Fiets implements Comparable<Stadsfiets>{
	private String bijzonderheden;

	public Stadsfiets() {
		super(26, false);
		setBijzonderheden("geen bijzonderheden");
		// TODO Auto-generated constructor stub
	}

	public Stadsfiets(int bandenmaat, boolean elektrisch, String bijzonderheden ) {
		super(bandenmaat, elektrisch);
		setBijzonderheden(bijzonderheden);
		// TODO Auto-generated constructor stub
	}
	
	public void setBijzonderheden(String bijzonderheden) {
		this.bijzonderheden = bijzonderheden;
	}

	@Override
	public double berekenMilieubijdrageVoorTweewieler() {
		if (isElektrisch())
			return 10;
		return 0;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("%s en %s",super.toString(), this.bijzonderheden);
	}
	
	
	
	@Override
	public int compareTo(Stadsfiets o) {
		return Integer.valueOf(this.getBandenmaat()).compareTo(o.getBandenmaat());
	}
	
	
}
