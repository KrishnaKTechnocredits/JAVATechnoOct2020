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
			if (Character.isDigit(word.charAt(i))  ) {
				number += word.charAt(i);	

			}else{
				sum+=Integer.parseInt(number);
				number = "0";
			}
		}
		sum+=Integer.parseInt(number);
		System.out.println("Sum of all Numbers in a given string "+word+" : "+sum);
	}

	public static void main(String[] args) {
		StringSumOfNumbers object = new StringSumOfNumbers();
		String userInput = "te123ch9kj8";
		object.getSumOfNumbers(userInput);
	}
}
