package domein;

public class Auto implements Comparable<Auto>{
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nummerplaat == null) ? 0 : nummerplaat.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Auto other = (Auto) obj;
		if (nummerplaat == null) {
			if (other.nummerplaat != null)
				return false;
		} else if (!nummerplaat.equals(other.nummerplaat))
			return false;
		return true;
	}

	private String nummerplaat;
	private String merk;
	private String model;

	public Auto(String nummerplaat, String merk, String model) {
		setNummerplaat(nummerplaat);
		setMerk(merk);
		setModel(model);
	}

	public String getMerk() {
		return merk;
	}

	private void setMerk(String merk) {
		this.merk = merk;
	}

	public String getModel() {
		return model;
	}

	private void setModel(String model) {
		this.model = model;
	}

	public String getNummerplaat() {
		return nummerplaat;
	}

	private void setNummerplaat(String nummerplaat) {
		this.nummerplaat = nummerplaat;
	}

	@Override
	public String toString() {
		return String.format("%s %s met nummerplaat %s", merk, model, nummerplaat);
	}

	@Override
	public int compareTo(Auto o) {
		return this.getNummerplaat().compareTo(o.getNummerplaat());
	}

	// Twee auto zijn gelijk als dezelfde nummerplaat hebben
	// Override de methodes equals en hashCode uit Object
	// Zorg ook dat deze klasse de interface Comparable implementeert,
	// auto worden op natuurlijke wijze gesorteerd op nummerplaat (alfabetisch)
	//OK

}
