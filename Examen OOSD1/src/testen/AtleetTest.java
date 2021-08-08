package testen;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import domein.Atleet;

public class AtleetTest {
	Atleet test;
	
	@BeforeEach
	public void reset() {
		test = new Atleet("Bob");
	}
	
	 @ParameterizedTest
     @ValueSource(strings = {"a"})

}
