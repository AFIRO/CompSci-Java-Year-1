package domein;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Vliegmaatschappij
{
    @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((naam == null) ? 0 : naam.hashCode());
		result = prime * result + ((partners == null) ? 0 : partners.hashCode());
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
		Vliegmaatschappij other = (Vliegmaatschappij) obj;
		if (naam == null) {
			if (other.naam != null)
				return false;
		} else if (!naam.equals(other.naam))
			return false;
		if (partners == null) {
			if (other.partners != null)
				return false;
		} else if (!partners.equals(other.partners))
			return false;
		return true;
	}

	private final String naam;
    private final List<String> partners;
    
    public Vliegmaatschappij(String[] data) {
		if (data == null || data.length == 0) {
			throw new IllegalArgumentException("Data om een vliegmaatschappij te maken onvolledig!");
		}
		naam = data[0];
		if (naam == null || naam.isEmpty()) {
			throw new IllegalArgumentException("Geen geldige naam!");
		}
		partners = new ArrayList<>(Arrays.asList(data));
		partners.remove(0);
	}

    public List<String> getPartners()
    {
        return partners;
    }

    public boolean isPartner(String naam)
    {
        return partners.contains(naam);
    }

    public String getNaam()
    {
        return naam;
    }

    @Override
    public String toString()
    {
        return String.format("%s met partners %s", naam, partners);
    }
}
