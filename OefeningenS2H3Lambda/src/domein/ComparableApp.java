
package domein;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import domein.Movie.RatingCompare;

public class ComparableApp {

    public ComparableApp() {
        List<Movie> list = new ArrayList<Movie>();
        
        list.add(new Movie("Force Awakens", 2.5, 2015));
        list.add(new Movie("Star Wars", 8.7, 1977));
        list.add(new Movie("Empire Strikes Back", 8.8, 1980));
        list.add(new Movie("Return of the Jedi", 8.4, 1983));

        
        System.out.println("Movies before sorting : ");
        for (Movie movie : list) {
            System.out.println(movie);
        }
        
        Collections.sort(list);

        System.out.printf("%nMovies after sorting with Comparable : %n");
        for (Movie movie : list) 
        { System.out.println(movie);  }
            
        
        System.out.printf("%nMovies after sorting with Comparator : %n");
            
        RatingCompare h = new RatingCompare(); //static class in movie ipv aparte class
        Collections.sort(list, h);
        
        for (Movie movie : list)
        	
        System.out.printf("%.1f %s %d %n", movie.getRating(), movie.getName(), movie.getYear());
          
        
    }
}

