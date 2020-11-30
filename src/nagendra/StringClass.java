package nagendra;

public class StringClass {

	void findCount(String input) {
		int letterCount = 0;
		int upperCaseCount = 0;
		int lowerCaseCount = 0;
		int digitCount = 0;
		int specialCharcter = 0;
		for (int i = 0; i < input.length(); i++) {
			if (Character.isDigit(input.charAt(i))) {
				digitCount++;
			} else if (Character.isLetter(input.charAt(i))) {
				letterCount++;
				if(Character.isUpperCase(input.charAt(i)))
					upperCaseCount++;
					else
						lowerCaseCount++;
			}
			else
				specialCharcter++;
		}		 
		System.out.println("Total Letters :" + letterCount);
		System.out.println("Digit  count :" + digitCount);
		System.out.println("Upper Case  count :" + upperCaseCount);
		System.out.println("Lower Case  count :" + lowerCaseCount);
		System.out.println("Special Character  count :" + specialCharcter);
	}
	public static void main(String[] args) {
		
		StringClass t=new StringClass();
		String userInput = "T2est@T@dit1";
		t.findCount(userInput);
	}
}
