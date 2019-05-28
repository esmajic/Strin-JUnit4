
public class Strings {

	public int wordLength(String word) {
		int stringLength = word.length();

		return stringLength;

	}

	public int numberOfUpperCaseLetters(String word) {
		int counter1 = 0;
		for (int i = 0; i < word.length(); i++) {
			if (Character.isUpperCase(word.charAt(i))) {
				counter1++;
			}
		}
		return counter1;

	}

	public int numberOfLowerCaseLetters(String word) {
		int counter2 = 0;
		for (int i = 0; i < word.length(); i++) {
			if (Character.isLowerCase(word.charAt(i))) {
				counter2++;
			}
		}
		return counter2;

	}

}
