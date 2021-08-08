package domein;

import java.util.Comparator;

public class RatingCompare implements Comparator<Movie> {

	@Override
	public int compare(Movie o1, Movie o2) {
		return o1.getRating().compareTo(o2.getRating());
	}

}
