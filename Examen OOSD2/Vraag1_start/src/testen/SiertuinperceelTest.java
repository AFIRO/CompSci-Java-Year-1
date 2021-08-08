package testen;

import java.util.Arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import domein.Siertuinperceel;
import exceptions.BloemenperkException;

public class SiertuinperceelTest {

	private Siertuinperceel perceel;

	@BeforeEach
	public void before() throws BloemenperkException {
		perceel = new Siertuinperceel(20, 10, Arrays.asList("Gladiool", "Roos", "Distel"), true);
	}

	@Test
	public void maakSiertuinperceel_geldigeWaarden_maaktSiertuinperceel() {
		Assertions.assertEquals(20, perceel.getLengte());
		Assertions.assertEquals(10, perceel.getBreedte());
		Assertions.assertEquals(Arrays.asList("Gladiool", "Roos", "Distel"), perceel.getBloemenperken());
		Assertions.assertTrue(perceel.isVijverAanwezig());
	}

	@Test
	public void maakSiertuinperceel_defaultLengteEnBreedte_maaktSiertuinperceel() throws BloemenperkException {
		perceel = new Siertuinperceel(Arrays.asList("Gladiool", "Roos", "Distel"), false);
		Assertions.assertEquals(5, perceel.getLengte());
		Assertions.assertEquals(5, perceel.getBreedte());
		Assertions.assertEquals(Arrays.asList("Gladiool", "Roos", "Distel"), perceel.getBloemenperken());
		Assertions.assertFalse(perceel.isVijverAanwezig());
	}

	@Test
	public void maakSiertuinperceel_nullBloemenperken_maaktSiertuinperceel() throws BloemenperkException {
		perceel = new Siertuinperceel(null, false);
		Assertions.assertEquals(5, perceel.getLengte());
		Assertions.assertEquals(5, perceel.getBreedte());
		Assertions.assertEquals(0, perceel.getBloemenperken().size());
		Assertions.assertFalse(perceel.isVijverAanwezig());
	}

	@Test

	public void maakSiertuinperceel_teveelBloemenperken_werptException() {
		Assertions.assertThrows(BloemenperkException.class,
				() -> new Siertuinperceel(1, 1, Arrays.asList("Gladiool", "Roos"), false));
	}

	@ParameterizedTest
	@ValueSource(ints = { -5, 0 })
	public void maakSiertuinperceel_ongeldigeLengte_werptException(int lengte) {
		Assertions.assertThrows(IllegalArgumentException.class,
				() -> new Siertuinperceel(lengte, 1, Arrays.asList("Gladiool", "Roos", "Distel"), false));
	}

	@ParameterizedTest
	@ValueSource(ints = { -5, 0 })
	public void maakSiertuinperceel_ongeldigeBreedte_werptException(int breedte) {
		Assertions.assertThrows(IllegalArgumentException.class,
				() -> new Siertuinperceel(1, breedte, Arrays.asList("Gladiool", "Roos", "Distel"), false));
	}

	@Test
	public void maakSiertuinperceel_lengteKleinerDanBreedte_werptException() {
		Assertions.assertThrows(IllegalArgumentException.class,
				() -> new Siertuinperceel(5, 10, Arrays.asList("Gladiool", "Roos", "Distel"), false));
	}

	@Test
	public void geefWaarde_SiertuinperceelZonderVijver_retourneertWaarde() throws BloemenperkException {
		perceel = new Siertuinperceel(20, 10, Arrays.asList("Gladiool", "Roos", "Distel"), false);
		Assertions.assertEquals(500, perceel.geefWaarde().doubleValue(), 0.01);
	}

	@Test
	public void geefWaarde_SiertuinperceelMetVijver_retourneertWaarde() {
		Assertions.assertEquals(550, perceel.geefWaarde().doubleValue());
	}

}
