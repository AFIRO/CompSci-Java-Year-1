package testen;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import domein.Speeltuinperceel;
import exceptions.ToestelException;

public class SpeeltuinperceelTest {

	private Speeltuinperceel perceel;

	@BeforeEach
	public void before() {
		perceel = new Speeltuinperceel(10, 5, 8);
	}

	@Test
	public void maakSpeeltuinperceel_geldigeWaarden_maaktSpeeltuinperceel() {
		Assertions.assertEquals(10, perceel.getLengte());
		Assertions.assertEquals(5, perceel.getBreedte());
		Assertions.assertEquals(8, perceel.getAantalToestellen());
	}

	@Test
	public void maakSpeeltuinperceel_defaultLengteEnBreedte_maaktSpeeltuinperceel() {
		perceel = new Speeltuinperceel(6);
		Assertions.assertEquals(5, perceel.getLengte());
		Assertions.assertEquals(5, perceel.getBreedte());
		Assertions.assertEquals(6, perceel.getAantalToestellen());
	}

	@Test

	public void maakSpeeltuinperceel_teveelToestellen_werptException() {
		Assertions.assertThrows(ToestelException.class, () -> new Speeltuinperceel(1, 1, 1));
	}

	@ParameterizedTest
	@ValueSource(ints = { -5, 0 })
	public void maakSpeeltuinperceel_ongeldigeLengte_werptException(int lengte) {
		Assertions.assertThrows(IllegalArgumentException.class, () -> new Speeltuinperceel(lengte, 1, 0));
	}

	@ParameterizedTest
	@ValueSource(ints = { -5, 0 })
	public void maakSpeeltuinperceel_ongeldigeBreedte_werptException(int breedte) {
		Assertions.assertThrows(IllegalArgumentException.class, () -> new Speeltuinperceel(1, breedte, 0));
	}

	@Test
	public void maakSpeeltuinperceel_lengteKleinerDanBreedte_werptException() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> new Speeltuinperceel(5, 10, 0));
	}

	@Test
	public void geefWaarde_SpeeltuinperceelZonderToestellen_retourneertWaarde() {
		perceel = new Speeltuinperceel(10, 9, 0);
		Assertions.assertEquals(225, perceel.geefWaarde().doubleValue(), 0.01);
	}

	@Test
	public void geefWaarde_SpeeltuinperceelMetToestellen_retourneertWaarde() {
		Assertions.assertEquals(205, perceel.geefWaarde().doubleValue());
	}

}
