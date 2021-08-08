package domein;

import java.util.Comparator;

//public class RatingCompare implements Comparator<Movie> {

	@Override
	public int compare(Movie o1, Movie o2) {
		int res = o1.getRating().compareTo(o2.getRating());
		if (res != 0) {
			if (res == 1) return -1;
			else return 1;
		}
		
		return res;
	}
	

}
