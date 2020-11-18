package deepak;

public class CoadingExam2 {

	int letterCount, upperCaseLetterCount, lowerCaseLetterCount, digitCount, specialCharCount;
	
	void lettersCount(String word) {
		for(int index=0; index < word.length(); index++) {
			char ch = word.charAt(index);	
			if(Character.isLetter(ch))
				letterCount++;
		}
		System.out.println("Letters Count is :"+ letterCount);
	}
		
	void upperCaseLetterCount(String word) {
		for(int index=0; index < word.length(); index++) {
			char ch = word.charAt(index);	
			if(Character.isUpperCase(ch))
				upperCaseLetterCount++;
		}
		
		System.out.println("Upper Case Count is :"+ upperCaseLetterCount);
	}
	
	void lowerCaseLetterCount(String word) {
		for(int index=0; index < word.length(); index++) {
			char ch = word.charAt(index);	
			if(Character.isLowerCase(ch))
				lowerCaseLetterCount++;
		}
		System.out.println("Lower Case Count is :"+ lowerCaseLetterCount);
	}
	
	void digitCount(String word) {
		for(int index=0; index < word.length(); index++) {
			char ch = word.charAt(index);	
			if(Character.isDigit(ch))
				digitCount++;
		}
		System.out.println("Lower Case Count is :"+ digitCount);
	}
	
	void specialCharCount(String word) {
		for(int index=0; index < word.length(); index++) {
			char ch = word.charAt(index);	
			if(!Character.isLetter(ch) && !Character.isDigit(ch))
				specialCharCount++;
		}
		System.out.println("Lower Case Count is :"+ specialCharCount);
	}
	
	public static void main(String[] args) {

		String word = "teCh@N12JCR#iT8s_B";
		
		CoadingExam2 refVar = new CoadingExam2();
		refVar.lettersCount(word);
		refVar.upperCaseLetterCount(word);
		refVar.lowerCaseLetterCount(word);
		refVar.specialCharCount(word);

	}

}
