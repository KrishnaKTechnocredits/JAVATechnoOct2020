package anjaliS;

public class CharacterCount {
	void allCharcount(String word) {
		int digitCount = 0, letterCount = 0, upperCharCount = 0, lowerCharCount = 0, specialCharCount = 0;
		for (int index = 0; index < word.length(); index++) {
			char ch = word.charAt(index);
			if (Character.isDigit(ch))
				digitCount++;
			else if (Character.isLetter(ch))
				letterCount++;
			else if (Character.isUpperCase(ch))
				upperCharCount++;
			else if (Character.isLowerCase(ch))
				lowerCharCount++;
			else
				specialCharCount++;
		}

		System.out.println("Digits are " + digitCount);
		System.out.println("Letter are  " + letterCount);
		System.out.println("UpperCase letters are  " + upperCharCount);
		System.out.println("Lowercase letters are  " + lowerCharCount);
		System.out.println("Special characters are  " + specialCharCount);
	}

	public static void main(String[] arg) {
		CharacterCount charactercount = new CharacterCount();
		String str = "teCh@N12JCR#iT8s_B";
		charactercount.allCharcount(str);

	}

}