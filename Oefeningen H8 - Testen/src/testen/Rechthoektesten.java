package testen;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import domein.Rechthoek;

public class Rechthoektesten {
	Rechthoek test;
	@BeforeEach
	public void startUp() {
		test = null;
	}
	
	@Test
	public void constructormaaktobjectTrue() {
		test = new Rechthoek(2, 2);
		assertNotNull(test);
	}
	
	@Test
	public void ConstructorThrowsExceptionAtNegLength() {
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {test = new Rechthoek(-1, 2);});
	}
	
	@Test
	public void ConstructorThrowsExceptionAtNegWidth() {
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {test = new Rechthoek(2, -2);});
	}
	
	
	@Test
	public void geefOmtrekWerkt() {
		test= new Rechthoek(2, 2);
		double resultaat= test.geefOmtrek();
		assertEquals(8, resultaat, 0.1);
	}
	
	
	@Test
	public void geefOppervlakteWerkt() {
		test= new Rechthoek(2, 2);
		double resultaat= test.geefOppervlakte();
		assertEquals(4, resultaat, 0.1);
	}
	
	@Test
	public void testSchaalNeg() {
		test=new Rechthoek(2, 2);
		assertThrows(IllegalArgumentException.class, () -> {test.schaal(-1);});
	}
	
	@ParameterizedTest
	@ValueSource(ints = {-1, 201})
	public void testSchaalOver200(int percentage) {
		test=new Rechthoek(2, 2);
		assertThrows(IllegalArgumentException.class, () -> {test.schaal(percentage);});
	}
	
	@Test
	public void testSchaalGrenswaarde() {
		test=new Rechthoek(2, 2);
		assertDoesNotThrow(()->{test.schaal(50);});
	}

}
