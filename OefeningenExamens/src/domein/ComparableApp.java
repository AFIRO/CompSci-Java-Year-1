
package domein;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparableApp {

    public ComparableApp() {
        List<Movie> list = new ArrayList<Movie>();
        
        list.add(new Movie("Force Awakens", 8.3, 2015));
        list.add(new Movie("Star Wars", 8.7, 1977));
        list.add(new Movie("Empire Strikes Back", 8.8, 1980));
        list.add(new Movie("Empire Strikes Back", 8.8, 1979));
        list.add(new Movie("Return of the Jedi", 8.4, 1983));

        System.out.println("Initial list:");
        for (Movie movie : list) {
            System.out.println(movie);
        }
        
        Collections.sort(list);

        System.out.printf("%nMovies after sorting through name and year: %n");
        for (Movie movie : list) {
            System.out.println(movie);
        }
        
        Collections.sort(list, Movie::compareRating);

			
        
        System.out.printf("%nMovies after sorting using Rating Comparator: %n");
        for (Movie movie : list) {
            System.out.println(movie);
        }
    }
}

