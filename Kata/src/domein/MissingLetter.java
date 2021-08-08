package domein;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class MissingLetter {
	
	
	public static void main(String[] args) {
		Double[] doubles = {0.1,0.2,0.3,0.4,0.5};
		String[] strings = {"generics", "basically", "change", "everything"};
		printArray(doubles);
		printArray(strings);
		
	}
	
	public static <T> void printArray(T[] input) {
		
	
		for (T t : input)
			System.out.println(t.toString());
		
		  }
			
		
	  
  
				
} 


