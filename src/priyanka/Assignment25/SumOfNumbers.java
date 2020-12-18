package priyanka.Assignment25;

/*Assignment - 25 : 22nd Nov'2020 

Program 1: sum of all numbers from give string.  

String msg = I have 15 years and 2 months of experience.

hint : Integer.parseInt(String input) will help to convert string to int.
you may need spilt, charAt method as well. 
*/

public class SumOfNumbers {

	void sumAllNumberString(String str) {
		String[] arr = str.split(" ");
		String word = "";
		String temp = "";
		int sum = 0;
		for (int index = 0; index < arr.length; index++) {
			word = arr[index];
			for (int innerIndex = 0; innerIndex < word.length(); innerIndex++) {
				char ch = word.charAt(innerIndex);
				if (Character.isDigit(ch))
					temp = temp + ch;
				else if (temp != "") {
					sum = sum + Integer.parseInt(temp);
					temp = "";
				}
			}
		}
		System.out.println("Sum of all numbers:" + sum);
	}

	public static void main(String[] args) {
		SumOfNumbers SumOfNumbers = new SumOfNumbers();
		String str = "I have 15 years and 2 months of experience";
		System.out.println("The Given string is:" + str);
		SumOfNumbers.sumAllNumberString(str);
	}

}
