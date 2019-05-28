
public class Strings {

	public int wordLength(String word) {
		int stringLength = word.length();

		return stringLength;

	}
	
	public int numberOfUppercaseLetters(String word) {
		int counter1 = 0;
		for (int i = 0; i < word.length(); i++) {
			if (Character.isUpperCase(word.charAt(i))) {
				counter1++;
			}
		}
		return counter1;

	}
	
}
