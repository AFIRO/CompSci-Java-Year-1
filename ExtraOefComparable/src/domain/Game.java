package domain;

public class Game implements Comparable<Game>{
	private String title, genre;
	private Integer year;
	
	public Game(String title, String genre, Integer year) {
		super();
		this.title = title;
		this.genre = genre;
		this.year = year;
	}
	
	
	public String getTitle() {
		return title;
	}
	protected void setTitle(String title) {
		this.title = title;
	}
	public String getGenre() {
		return genre;
	}
	protected void setGenre(String genre) {
		this.genre = genre;
	}
	
	public Integer getYear() {
		return year;
	}
	protected void setYear(Integer year) {
		this.year = year;
	}


	@Override
	public int compareTo(Game o) {
		int res = this.getTitle().compareTo(o.getTitle());
		
		if (res == 0)
			return this.getYear().compareTo(o.getYear());
		
		else return res;
	}


	@Override
	public String toString() {
		return "Game [title=" + title + ", genre=" + genre + ", year=" + year + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((genre == null) ? 0 : genre.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		result = prime * result + ((year == null) ? 0 : year.hashCode());
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
		Game other = (Game) obj;
		if (genre == null) {
			if (other.genre != null)
				return false;
		} else if (!genre.equals(other.genre))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		if (year == null) {
			if (other.year != null)
				return false;
		} else if (!year.equals(other.year))
			return false;
		return true;
	}
	
	
	
	

}
