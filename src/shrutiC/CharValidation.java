package shrutiC;

public class CharValidation {

	boolean isUpperCase(char ch) {

		if (Character.isUpperCase(ch))
			return true;
		else
			return false;
	}

	boolean isLowerCase(char ch) {

		if (Character.isLowerCase(ch))
			return true;
		else
			return false;
	}

	boolean isDigit(char ch) {

		if (Character.isDigit(ch))
			return true;
		else
			return false;
	}

	boolean isLetter(char ch) {

		if (Character.isLetter(ch))
			return true;
		else
			return false;
	}

	public static void main(String[] args) {

		CharValidation charValidation = new CharValidation();
		String input = "teCh@N12JCR#iT8s_B";
		int upperCaseCnt = 0;
		int lowerCaseCnt = 0;
		int digitCnt = 0;
		int letterCnt = 0;
		int specialCharCnt = 0;

		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (charValidation.isLetter(ch)) {
				letterCnt++;
				if (charValidation.isUpperCase(ch))
					upperCaseCnt++;
				else if (charValidation.isLowerCase(ch))
					lowerCaseCnt++;
			} else if (charValidation.isDigit(ch))
				digitCnt++;
			else
				specialCharCnt++;
		}
		
		System.out.println("Letters : " + letterCnt);
		System.out.println("Uppercase : " + upperCaseCnt);
		System.out.println("Lowercase : " + lowerCaseCnt);
		System.out.println("Digits : " + digitCnt);
		System.out.println("Special characters : " + specialCharCnt);
	}

}
