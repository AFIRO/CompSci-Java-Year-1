package domein;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Shortest {
	
	public static int findShort(String s) {
        List<String> list = new ArrayList<>(Arrays.asList(s.split(" ")));
        // list.stream().sorted(Comparator.comparing(String::length)).findFirst().get().length();
       return Arrays.stream(s.split(" ")).sorted(Comparator.comparing(String::length)).findFirst().get().length();
      
    }
}


