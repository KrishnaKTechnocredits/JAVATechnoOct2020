package ritika.Assignments;

import java.util.Arrays;

/* Assignment - 25 : 22nd Nov'2020

Program 1: sum of all numbers from give string.
String msg = I have 15 years and 2 months of experience.

hint : Integer.parseInt(String input) will help to convert string to int.
you may need spilt, charAt method as well.
*/
public class Asgmt_25 {

	int NumbersOutOfString(String input) {
		String[] inputArray = input.split(" ");
		System.out.println(Arrays.toString(inputArray));
		int sumOfNumbers = 0;
		for (int index = 0; index < inputArray.length; index++) {
			String word = inputArray[index];
			String temp = "";
			for (int i = 0; i < word.length(); i++) {
				char ch = word.charAt(i);
				if (Character.isDigit(ch))
					temp = temp + ch;
				else if (Character.isLetter(ch)) {
					temp = "";
					break;
				}
			}
			if (temp.length() > 0) 
				sumOfNumbers = sumOfNumbers + Integer.parseInt(temp);
		}
		return sumOfNumbers;
	}
	public static void main(String[] args) {
		String msg = "I have 15 years and 2 months of experience";
		Asgmt_25 stringtoNumber = new Asgmt_25();
		System.out.println("Sum of all numbers from given message is: " +stringtoNumber.NumbersOutOfString(msg));
	}
}
