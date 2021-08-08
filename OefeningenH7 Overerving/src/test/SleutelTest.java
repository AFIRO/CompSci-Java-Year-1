package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.experimental.theories.internal.ParameterizedAssertionError;

import domain.Sleutel;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;



class SleutelTest {

private Sleutel sleutel;	
	
	@BeforeEach
	public void Before() {
		sleutel = new Sleutel("voordeur",0.500,3,1);
	}

	
	@Test
public void aantalInOmLoop_Is1_ReturnsTrue() {
		boolean resultaat = false;
		if (sleutel.getAantalInOmloop() !=0) resultaat = true;
		assertTrue(resultaat);
	}

	@Test
	public void Naam_IsVoordeur(){
		assertEquals("voordeur",sleutel.getNaam());
	}
	
	@ParameterizedTest
	@ValueSource(ints= {1,2,3,4})
	
	public void PastOpDeur_Para(int 
			deur) {
		assertTrue(sleutel.pastOpDeur(deur));
	}
	
	@Test
	
	public void getDeurwerkt() {
		assertEquals(1, sleutel.getDeur());
	}
	
	@Test
	public void werktToString() {
		assertEquals("Sleutel voordeur met een gewicht van 0,500 kg uit niveau 3. past op deur 1.", sleutel.toString());
	}
	
	@Test
	public void testthrow() {
		Assertions.assertThrows(IllegalArgumentException.class,() -> {sleutel=new Sleutel("voordeur",0.500,3,-1);});
	}
}
