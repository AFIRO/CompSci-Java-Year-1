package testen;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import domein.Siertuinperceel;
import domein.Speeltuinperceel;
import domein.Tuin;
import domein.Tuinperceel;
import exceptions.BloemenperkException;

public class TuinTest {

	private Tuin tuin;
	private Tuinperceel perceel1, perceel2, perceel3, perceel4;

	@BeforeEach
	public void before() throws BloemenperkException {
		perceel1 = new Speeltuinperceel(10, 5, 8);
		perceel2 = new Siertuinperceel(20, 10, Arrays.asList("Gladiool", "Roos", "Distel"), false);
		perceel3 = new Speeltuinperceel(10, 5, 0);
		perceel4 = new Siertuinperceel(20, 10, Arrays.asList("Gladiool", "Roos", "Distel"), true);
		tuin = new Tuin(Arrays.asList(perceel1, perceel2, perceel3, perceel4));
	}

	@Test
	public void maakTuin_geldigePercelen_maaktTuin() {
		Assertions.assertEquals(4, tuin.geefAlleTuinpercelenGesorteerd().size());
	}

	@Test
	public void geefAlleTuinpercelenGesorteerd_retourneertDeGesorteerdeTuinpercelen() {
		List<Tuinperceel> percelen = tuin.geefAlleTuinpercelenGesorteerd();
		Assertions.assertEquals(perceel3, percelen.get(0));
		Assertions.assertEquals(perceel1, percelen.get(1));
		Assertions.assertEquals(perceel2, percelen.get(2));
		Assertions.assertEquals(perceel4, percelen.get(3));
	}

	@Test
	public void geefAlleSiertuinpercelen_retourneertDeSiertuinpercelen() {
		List<Siertuinperceel> percelen = tuin.geefAlleSiertuinpercelen();
		Assertions.assertEquals(perceel2, percelen.get(0));
		Assertions.assertEquals(perceel4, percelen.get(1));
	}

	@Test
	public void geefOppervlakte_retourneertDeOppervlakte() {
		double oppervlakte = tuin.geefOppervlakte();
		Assertions.assertEquals(500, oppervlakte, 0.01);
	}

	@Test
	public void geefVrijeOppervlakte_retourneertDeVrijeOppervlakte() {
		double oppervlakte = tuin.geefVrijeOppervlakte();
		Assertions.assertEquals(465, oppervlakte, 0.01);
	}

}
