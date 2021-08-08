package domein;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import exceptions.BloemenperkException;

public class Siertuinperceel extends Tuinperceel {
	private final List<String> bloemenperken;
	private final boolean vijverAanwezig;
	
	public Siertuinperceel(List<String> bloemenperken, boolean vijverAanwezig) throws BloemenperkException {
		super();
		if (bloemenperken == null)
			this.bloemenperken = new ArrayList<>();
		else this.bloemenperken = bloemenperken;
		
		
		if (bloemenperken.size() > (this.DEFAULT_LENGTE_BREEDTE*this.DEFAULT_LENGTE_BREEDTE))
			throw new BloemenperkException("Te veel bloemenperken voor dit perceel");
		
		
		this.vijverAanwezig = vijverAanwezig;
	}

	public Siertuinperceel(double lengte, double breedte,List<String> bloemenperken, boolean vijverAanwezig) throws BloemenperkException {
		super(lengte, breedte);
		if (bloemenperken == null)
			this.bloemenperken = new ArrayList<>();
		else this.bloemenperken = bloemenperken;
		
		if (bloemenperken.size() > (lengte * breedte))
			throw new BloemenperkException("Te veel bloemenperken voor dit perceel");
		this.vijverAanwezig = vijverAanwezig;
	}
	
	public List<String> getBloemenperken() {
		return bloemenperken;
	}
	
	public boolean isVijverAanwezig() {
		return vijverAanwezig;
	}
	
	
	public BigDecimal geefWaarde() {
		if (isVijverAanwezig())
			return this.geefWaarde().add(new BigDecimal(50.0));
		else return this.geefWaarde();
	}
	
	@Override
	public double geefVrijeOppervlakte() {
		double returnvalue = geefOppervlakte();
		double bloemenperkenreductie = 0;
		double vijverreductie = 0;
		
		if (bloemenperken.isEmpty() == false)
			bloemenperkenreductie = 1 * this.bloemenperken.size(); 
		
		if (isVijverAanwezig())
			vijverreductie = 5;
		
		return (returnvalue - bloemenperkenreductie - vijverreductie);
		
		
	}
	
	@Override
	public String toString() {
		String vijver = "";
		if (isVijverAanwezig())
			vijver = "met vijver";
			else vijver = "zonder vijver" ;
		
		
		return String.format("%s %s",super.toString(), vijver);
	}
	

	
	

}
