package testen;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

import domein.Waarneming;

public class WaarnemingTest {
        private static final String BASIS_SEIZOEN = "lente";
        private static final int BASIS_TEMPERATUUR = 50;

        private Waarneming waarneming;

        @BeforeEach
        public void maakBasisWaarneming() {
                 waarneming = new Waarneming(BASIS_SEIZOEN, BASIS_TEMPERATUUR);
        }

        // constructor
        @Test
        public void maakWaarneming_GeldigSeizoenEnTemperatuur_MaaktWaarneming() {
                 Assertions.assertEquals(BASIS_SEIZOEN, waarneming.getSeizoen());
                 Assertions.assertEquals(BASIS_TEMPERATUUR, waarneming.getTemperatuur());
        }

        @ParameterizedTest
        @ValueSource(doubles = { -100, 100 })
        public void maakWaarneming_TemperatuurIsGrenswaarde_MaaktWaarneming(double temperatuur) {
                 Waarneming waarneming = new Waarneming(BASIS_SEIZOEN, temperatuur);
                 Assertions.assertEquals(BASIS_SEIZOEN, waarneming.getSeizoen());
                 Assertions.assertEquals(temperatuur, waarneming.getTemperatuur());
        }

        @ParameterizedTest
        @NullAndEmptySource
        @ValueSource(strings = { "ongeldig" })
        public void maakWaarneming_OnGeldigSeizoen_WerptException(String seizoen) {
                 Assertions.assertThrows(IllegalArgumentException.class, () -> new Waarneming(seizoen, BASIS_TEMPERATUUR));
        }

        @ParameterizedTest
        @ValueSource(doubles = { -101, -120, 101, 120 })
        public void maakWaarneming_OnGeldigeTemperatuur_WerptException(double temperatuur) {
                 Assertions.assertThrows(IllegalArgumentException.class, () -> new Waarneming(BASIS_SEIZOEN, temperatuur));
        }

        // isUitzonderlijkWarm
        @Test
        public void isUitzonderlijkWarm_UitzonderlijkWarmeWaarneming_RetourneertTrue() {
                 waarneming = new Waarneming("herfst", 25);
                 Assertions.assertTrue(waarneming.isUitzonderlijkWarm());
        }

        @Test
        public void isUitzonderlijkWarm_WaarnemingGrenswaardeTemperatuurVoorUitzonderlijkWarm_RetourneertFalse() {
                 waarneming = new Waarneming("herfst", 20);
                 Assertions.assertFalse(waarneming.isUitzonderlijkWarm());
        }

        @Test
        public void isUitzonderlijkWarm_GeenUitzonderlijkWarmeWaarnemingWegensVerkeerdSeizoen_RetourneertFalse() {
                 waarneming = new Waarneming("lente", 25);
                 Assertions.assertFalse(waarneming.isUitzonderlijkWarm());
        }

        @Test
        public void isUitzonderlijkWarm_GeenUitzonderlijkWarmeWaarnemingWegensTeLageTemperatuur_RetourneertFalse() {
                 waarneming = new Waarneming("winter", 15);
                 Assertions.assertFalse(waarneming.isUitzonderlijkWarm());
        }

        // wijzigTemperatuur
        @Test
        public void wijzigTemperatuur_NormaleStijging_VerhoogtTemperatuurVanWaarneming() {
                 waarneming.wijzigTemperatuur(true, 5);
                 Assertions.assertEquals(55, waarneming.getTemperatuur());
        }

        @Test
        public void wijzigTemperatuur_AantalGradenIsBovengrens_VerhoogtTemperatuurVanWaarneming() {
                 waarneming.wijzigTemperatuur(true, 10);
                 Assertions.assertEquals(60, waarneming.getTemperatuur());
        }

        @Test
        public void wijzigTemperatuur_AantalGradenIsOndergrens_VerhoogtTemperatuurVanWaarneming() {
                 waarneming.wijzigTemperatuur(true, 1);
                 Assertions.assertEquals(51, waarneming.getTemperatuur());
        }

        @Test
        public void wijzigTemperatuur_NormaleDaling_VerlaagtTemperatuurVanWaarneming() {
                 waarneming.wijzigTemperatuur(false, 5);
                 Assertions.assertEquals(45, waarneming.getTemperatuur());
        }

        @Test
        public void wijzigTemperatuur_AantalGradenIsBovengrens_VerlaagtTemperatuurVanWaarneming() {
                 waarneming.wijzigTemperatuur(false, 10);
                 Assertions.assertEquals(40, waarneming.getTemperatuur());
        }

        @Test
        public void wijzigTemperatuur_AantalGradenIsOndergrens_VerlaagtTemperatuurVanWaarneming() {
                 waarneming.wijzigTemperatuur(false, 1);
                 Assertions.assertEquals(49, waarneming.getTemperatuur());
        }

        @Test
        public void wijzigTemperatuur_TemperatuurVanWaarnemingWordtTeGroot_WerptException() {
                 waarneming = new Waarneming("lente", 99);
                 Assertions.assertThrows(IllegalArgumentException.class, () -> waarneming.wijzigTemperatuur(true, 10));
        }

        @Test
        public void wijzigTemperatuur_TemperatuurVanWaarnemingWordtTeLaag_WerptException() {
                 waarneming = new Waarneming("lente", -99);
                 Assertions.assertThrows(IllegalArgumentException.class, () -> waarneming.wijzigTemperatuur(false, 10));
        }

        @ParameterizedTest
        @ValueSource(ints = { 0, -10, 11, 20 })
        public void wijzigTemperatuur_StijgingMetOngeldigAantalGraden_WerptException(int aantalGraden) {
                 Assertions.assertThrows(IllegalArgumentException.class, () -> waarneming.wijzigTemperatuur(true, aantalGraden));
        }

        @ParameterizedTest
        @ValueSource(ints = { 0, -10, 11, 20 })
        public void wijzigTemperatuur_DalingMetOngeldigAantalGraden_WerptException(int aantalGraden) {
                 Assertions.assertThrows(IllegalArgumentException.class,
                                  () -> waarneming.wijzigTemperatuur(false, aantalGraden));
        }

}
