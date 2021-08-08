package equalsExample;

public class EqualsApp {

    public EqualsApp() {
        Movie firstMovie = new Movie("Force Awakens", 8.3, 2015);
        Movie SecondMovie = new Movie("Force Awakens", 8.3, 2015);

        System.out.println("Are the movies equal? ");
        
        // print yes 

        if (firstMovie.equals(SecondMovie))
        	System.out.println("Yes.");
        else System.out.println("No.");
    }
}

