import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StringTest {
	
	String word;
	
	@Before
	public void setUp() {
		word = new String();
	}

	@Test
	public void shouldBeGreenWhenStringLengthIsCorrect() {
		int result = word.stringLength("Ervin");
		assertEquals(5, result);
	}

}
