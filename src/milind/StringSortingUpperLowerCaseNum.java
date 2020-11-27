package milind;

public class StringSortingUpperLowerCaseNum {
	
	void totalLengthOfString(String input) {
		System.out.println(input + " : Total Length : " + input.length());
	}
	
	void lowerCaseLetterFromString(String input) {
		int count = 0;
		for(int index = 0; index < input.length(); index++) {
			char singleCharFromString = input.charAt(index);
			if(Character.isLowerCase(singleCharFromString)) {
				count++;
			}
		}
		System.out.println("Lower case letter's count in string : " +count);
	}
	
	void upperCaseLetterFromString(String input) {
		int count = 0;
		for(int index = 0; index < input.length(); index++) {
			char singleCharFromString = input.charAt(index);
			if(Character.isUpperCase(singleCharFromString)) {
				count++;
			}
		}
		System.out.println("Upper case letter's count in string : " +count);
	}
	
	void specialCharCountInString(String input) {
		int count = 0;
		for(int index = 0; index < input.length(); index++) {
			char singleCharFromString = input.charAt(index);
			if(!Character.isDigit(singleCharFromString) && !Character.isAlphabetic(singleCharFromString) && !Character.isSpaceChar(singleCharFromString)) {
				count++;
			}
		}
		System.out.println("Special character's count in string : " +count );
	}
	
	void digitCountFromString(String input) {
		int count = 0;
		for(int index = 0; index < input.length(); index++) {
			char singleCharFromString = input.charAt(index);
			if(Character.isDigit(singleCharFromString)) {
				count++;
			}
		}
		System.out.println("Number's count in string : " + count);
	}
	
	public static void main(String[] args) {
		String input = "teCh@N12JCR#iT8s_B";
		StringSortingUpperLowerCaseNum stringSortingUpperLowerCaseNum = new StringSortingUpperLowerCaseNum();
		stringSortingUpperLowerCaseNum.totalLengthOfString(input);
		stringSortingUpperLowerCaseNum.lowerCaseLetterFromString(input);
		stringSortingUpperLowerCaseNum.upperCaseLetterFromString(input);
		stringSortingUpperLowerCaseNum.digitCountFromString(input);
		stringSortingUpperLowerCaseNum.specialCharCountInString(input);
	}

}
