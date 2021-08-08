
package comparableExample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ComparableApp {

    public ComparableApp() {
        List<Movie> list = new ArrayList<Movie>();
        
        list.add(new Movie("Force Awakens", 8.3, 2015));
        list.add(new Movie("Star Wars", 8.7, 1977));
        list.add(new Movie("Empire Strikes Back", 8.8, 1980));
        list.add(new Movie("Empire Strikes Back", 8.8, 2008));
        list.add(new Movie("Return of the Jedi", 8.4, 1983));

        
        Collections.sort(list);

        System.out.println("Movies after sorting : ");
        for (Movie movie : list) {
            System.out.println(movie);
        }
        
        Collections.shuffle(list);
        
        Collections.sort(list, (o1,o2) -> -1 * Double.valueOf(o1.getRating()).compareTo(o2.getRating()));
        
        System.out.println();
        System.out.println("Movies after on rating : ");
        for (Movie movie : list) {
            System.out.println(movie);
        }
        
        Collections.shuffle(list);
        
        
        
        System.out.println();
        System.out.println("Movies after on name using stream filter : ");
        
        list.stream().distinct().sorted(Comparator.comparing(Movie::getName)).forEach((e)->System.out.println(e));
            
        }
    }


