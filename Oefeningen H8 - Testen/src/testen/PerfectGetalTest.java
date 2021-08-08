package testen;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import domein.PerfectGetal;

public class PerfectGetalTest {
	PerfectGetal test;
	
	@BeforeEach
	public void reset() {
		test = new PerfectGetal();
	}
	
	@ParameterizedTest
	@ValueSource(ints = {0,1})
	public void PerfectGetal0en1ReturnsFalse(int getal) {
		boolean resultaat = test.isPerfectGetal(getal);
		assertFalse(resultaat);
	}
	
	@Test
	public void PerfectGetalThrowsExceptionBijNegatief() {
		
		assertThrows(IllegalArgumentException.class, ()->{test.isPerfectGetal(-1);});
	}
	
	@Test
	public void PerfectGetalAssertTrueBij6() {
		boolean resultaat = test.isPerfectGetal(28);
		assertTrue(resultaat);
	}
	

}
