package nagendra.logicalPrograms;

/*
Program 1:  return true if UpperCase characters count are more than lowercase else return false.
input : TechnoCrediTS
output : false
*/

public class UpperCaseCharacterCount {

	void getCoutOfCharacters(String input) {
		int countUpper = 0;
		int countLower = 0;
		boolean flag = false;
		for (int i = 0; i < input.length(); i++) {
			int number = input.charAt(i);
			if (number >= 65 && number <= 90) {
				countUpper++;
			} else if (number >= 97 && number <= 122) {
				countLower++;
			}}
		if (countUpper > countLower)
			flag = true;
		System.out.println("Output:"+flag);
	}

	public static void main(String[] args) {
		UpperCaseCharacterCount object = new UpperCaseCharacterCount();
		String input = "TechnoCrediTS";
		object.getCoutOfCharacters(input);
	}
}
