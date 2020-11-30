package sadhana;

/*Assignment - 25 : 22nd Nov'2020 

Program 1: sum of all numbers from give string.  

String msg = I have 15 years and 2 months of experience.

hint : Integer.parseInt(String input) will help to convert string to int.
you may need spilt, charAt method as well. 

 Raise PR before tuesday EOD */

// Java program to calculate sum of all numbers present 
// in a string containing alphanumeric characters 
class SumOfNumInString {

	int printData(String msg) {
		String temp = "0";
		int sum = 0;
		for (int i = 0; i < msg.length(); i++) {
			char ch = msg.charAt(i);
			if (Character.isDigit(ch))
				temp += ch;
			else {

				sum += Integer.parseInt(temp);
				temp = "0";
			}
		}
		return sum + Integer.parseInt(temp);
	}

	public static void main(String[] args) {
		SumOfNumInString sumOfNumInString = new SumOfNumInString();

		System.out.println("Sum of numbers in given string is: "
				+ sumOfNumInString.printData("I have 15 years and 2 months of experience."));
	}
}
