package domein;

public class Uitgave implements Comparable<Uitgave> {
		
	private int jaar;
	private String titel;
	private String isbn;
	private String categorie;
	
	public Uitgave(int jaar, String titel, String isbn, String categorie) {
		this.jaar = jaar;
		this.titel = titel;
		this.isbn = isbn;
		this.categorie = categorie;
	}

	public int getJaar() {
		return jaar;
	}

	public void setJaar(int id) {
		this.jaar = id;
	}

	public String getTitel() {
		return titel;
	}

	public void setTitel(String titel) {
		this.titel = titel;
	}

	public String getISBN() {
		return isbn;
	}

	public void setISBN(String isbn) {
		isbn = isbn;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((isbn == null) ? 0 : isbn.hashCode());
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
		Uitgave other = (Uitgave) obj;
		if (isbn == null) {
			if (other.isbn != null)
				return false;
		} else if (!isbn.equals(other.isbn))
			return false;
		return true;
	}

	public String getCategorie() {
		return categorie;
	}

	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}

	@Override
	public String toString() {
		return "titel: " + titel + ", ISBN: " + isbn + ", categorie: " + categorie + ", Jaar: " + jaar;
	}

	@Override
	public int compareTo(Uitgave o) {
		return Integer.valueOf(this.jaar).compareTo(o.getJaar());
		
	}
}