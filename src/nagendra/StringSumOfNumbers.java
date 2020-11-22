package nagendra;

/*
program 2 : sum of all numbers in a give string 
input: te123ch9kj8 
output : 123 + 9 + 8 = 140
*/

public class StringSumOfNumbers {

	void getSumOfNumbers(String word) {
		String number = "0";
		int sum = 0;
		for (int i = 0; i < word.length(); i++) {
			if (Character.isDigit(word.charAt(i))) {
				if (Character.isDigit(word.charAt(i)) && (i != word.length() - 1) && Character.isDigit(word.charAt(i + 1))) {
					for(int j=i;j<word.length();j++){
						if(Character.isDigit(word.charAt(j))){
						number += word.charAt(j);
						i++;
						}
						else{
							break;
						}
					}
					sum+=Integer.parseInt(number);
					number="0";
				} else {
					sum += Character.getNumericValue(word.charAt(i));
				}
			}
		}
		System.out.println("sum of all numbers in String " + word + " is -> " +sum);
	}

	public static void main(String[] args) {
		StringSumOfNumbers object = new StringSumOfNumbers();
		String userInput = "te123ch9kj8";
		object.getSumOfNumbers(userInput);
	}
}
