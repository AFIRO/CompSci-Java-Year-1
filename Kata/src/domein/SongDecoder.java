package domein;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SongDecoder {
	
	public static void main(String[] args) {
		
		System.out.println(SongDecoder("RWUBWUBWUBLWUB"));
		
	}
	
	
	
	  public static String SongDecoder (String song)
	  {
	     String[] decoded = song.split("WUB");
	      
	     String original = "";
	     
	      List<String> list = new ArrayList<>(Arrays.asList(decoded));
	      
	  
	    
	     
	      for (String string : list)
	    	  if (!string.isBlank())
	    	  original += String.format("%s ",string);
	    	  
	    	 
	      
	      
	      
	      original = original.trim();
	    
	    return original;
	    
	   
	    
	   }
	  
	  

}
