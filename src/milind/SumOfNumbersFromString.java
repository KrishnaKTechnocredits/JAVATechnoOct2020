package milind;

public class SumOfNumbersFromString {
	
	void stringNumberSum(String input) {
		String[] inputArray = input.split(" ");
		String str = "";
		int sum = 0;
		for(int index = 0; index < inputArray.length; index++) {
			char ch = inputArray[index].charAt(0);
			if(Character.isDigit(ch)) {
				for(int innerIndex = 0; innerIndex < inputArray[index].length(); innerIndex++) {
					char ch1 = inputArray[index].charAt(innerIndex);
					if(Character.isDigit(ch1)) {
						str = str + ch1;
					}
				}
			}else if(Character.isLetter(ch)) {
				if(str.length() > 0) {
					sum = sum + Integer.parseInt(str);
					str = "";
				}
			}
			if(str.length() > 0) {
				sum = sum + Integer.parseInt(str);
				str = "";
			}
		}
		System.out.println(sum);
		
	}
	
	public static void main(String[] args) {
		String input = "I have 15 years and 2 months of experience and total experience in month is 182";		
		SumOfNumbersFromString sumOfNumbersFromString = new SumOfNumbersFromString();
		sumOfNumbersFromString.stringNumberSum(input);
	}

}
