package testen;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

import domein.Atleet;

public class AtleetTest {
	Atleet test;
	
	@BeforeEach
	public void reset() {
		test = null;
	}
	
	 @ParameterizedTest
	 @NullAndEmptySource
     @ValueSource(strings = {""," ",})
	 public void naamMagNietLeegZijnExceptionTest(String naam) {
		 
		 assertThrows(IllegalArgumentException.class, () -> {test= new Atleet(naam);});
	 }
	 
	 @ParameterizedTest
	 @ValueSource(ints = {-1, 6000})
	 public void doeLoopOefeningExceptionTest(int afstand) {
		 test = new Atleet("Bob");
		 assertThrows(IllegalArgumentException.class, () -> {test.doeLoopOefening(afstand);;});
		 
	 }
	 
	 @Test
	 public void doeLoopOefeningSuccesvolBij5Km() {
		 test = new Atleet("Bob");
		 test.doeLoopOefening(5);
		 int resultaat = (int) test.getEnergie();
		 assertEquals(5250, resultaat);
	 }

}
