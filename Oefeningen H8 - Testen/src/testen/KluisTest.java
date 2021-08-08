package testen;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import domein.Kluis;

public class KluisTest {
	Kluis test;
	
	@BeforeEach
	public void reset() {
		test = null;
	}
	
	@ParameterizedTest
	@ValueSource(strings= {"A BC","A B ", "ABC", "ABCDE"})
	public void ThrowExceptionBijSpatiesOfGeenVier(String code) {
		assertThrows(IllegalArgumentException.class, ()-> {test= new Kluis(code);});
	}
	
	@Test
	public void ReturnsTruebijjuistecode() {
		test = new Kluis("ABCD");
		boolean resultaat = test.valideerCode("ABCD");
		assertTrue(resultaat);
	}
	
	@Test
	public void ReturnsFalsebijjuistecode() {
		test = new Kluis("ABCD");
		boolean resultaat = test.valideerCode("AAAA");
		assertFalse(resultaat);
	}
	

}
