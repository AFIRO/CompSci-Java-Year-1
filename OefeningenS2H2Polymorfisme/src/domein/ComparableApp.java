
package domein;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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
         
        
      /*  //1. comparator met anonymous inner class
         Comparator h1 = new Comparator<Movie>() {

			@Override
			public int compare(Movie o1, Movie o2) {
				  int res = ((Movie) o1).getRating().compareTo(((Movie) o2).getRating());
		      		if (res != 0) {
		      			if (res == 1) return -1;
		      			else return 1;
		      		}
		      		
		      		return res;
			}
		};
		
		Collections.sort(list, h1); */
		
        
        
        
       /* //2. Comparator met lambda
        Comparator h2 = (o1, o2) -> {
        	  int res = ((Movie) o1).getRating().compareTo(((Movie) o2).getRating());
      		if (res != 0) {
      			if (res == 1) return -1;
      			else return 1;
      		}
      		
      		return res;
        }; */
        
       /* //3. met method reference 
        
        Comparator<Movie> h3 = ComparableApp::compare;
        Collections.sort(list, h3); */
     
        
	/*	//4. rechtstreeks in de sort gelijk een baller anonieme inner klasse
        Collections.sort(list, new Comparator<Movie>() {

			
				@Override
				public int compare(Movie o1, Movie o2) {
					  int res = ((Movie) o1).getRating().compareTo(((Movie) o2).getRating());
			      		if (res != 0) {
			      			if (res == 1) return -1;
			      			else return 1;
			      		}
			      		
			      		return res;
				}
		});
        */
        
        
   /*   //5. rechtstreeks in de sort gelijk een baller met lambda
        
        Collections.sort(list, (o1, o2) -> {
        	int res = o1.getRating().compareTo(o2.getRating());
      		if (res != 0) {
      			if (res == 1) return -1;
      			else return 1;
      		}
      		
      		return res;
	});
        
        
        */ //6. rechtstreeks met method reference in de sort
        
        Collections.sort(list, ComparableApp::compare);     
        
        for (Movie movie : list)
        	
        System.out.printf("%.1f %s %d %n", movie.getRating(), movie.getName(), movie.getYear());
          
        
	
        
    }
    
    //static class voor method reference
	static int compare(Movie o1, Movie o2) {		
	    int res = o1.getRating().compareTo(o2.getRating());
		if (res != 0) {
			if (res == 1) return -1;
			else return 1;
		}
		
		return res;
		}
}

