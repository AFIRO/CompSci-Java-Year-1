package testen;


import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import domein.Palindroom;

public class PalindroomTest {
	
	Palindroom test;
	 
	 @BeforeEach
	 public void reset() {
		 test = null;
	 }
	 
	 @ParameterizedTest
	 @ValueSource(strings = {"a"})
	 public void throwsExceptionBij1karakter(String tekst) {
		 test=new Palindroom();
		 assertThrows(IllegalArgumentException.class, ()-> {test.isPalindroom(tekst);}, "Tekst moet langer zijn dan 1 karakter");
	 }
	 
	 
	 @ParameterizedTest
	 @ValueSource(strings = {"","    "})
	 public void throwsExceptionBijLeegofBlanco(String tekst) {
		 test=new Palindroom();
		 assertThrows(IllegalArgumentException.class, ()-> {test.isPalindroom(tekst);}, "Ongeldige tekst");
	 }


}
