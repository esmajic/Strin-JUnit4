import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class StringsTest {
	
	Strings word;
	
	@Before
	public void setUp() {
		word = new Strings();
	}
	
	@After
	public void tearDown() {
		
	}

	@Test
	public void shouldBeGreenWhenStringLengthIsCorrect() {
		int result = word.wordLength("Ervin");
		assertEquals(5, result);
	}
	
	@Test
	public void shouldBeGreenWhenNumberOfUpperCaseLettersMatch() {
		int result = word.numberOfUpperCaseLetters("Ervin");
		assertEquals(1, result);
	}
	
	@Test
	public void shouldBeGreenWhenNumberOfLowerCaseLettersMatch() {
		int result = word.numberOfLowerCaseLetters("Ervin");
		assertEquals(4, result);
	}

}
