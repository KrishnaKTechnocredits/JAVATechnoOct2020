package ritika.Assignments;
/*Assignment - 24 : 22nd Nov'2020
 
program 1: sum of all digits from a given string
input: te1ch9kj8
output:= 18
*/
public class Asgmt_24_Pg1 {
	
	void sumOfDigitsFromString(String input) {
		int sum=0;
		for (int i=0; i<input.length(); i++) {
			char ch = input.charAt(i);
			if (Character.isDigit(ch)) {
				int num = Character.getNumericValue(ch);
				sum =sum+num;
			}
		}
		System.out.println("Sum of all digits in given string is: " +sum);
	}
	public static void main(String[] args) {
		String input = "te1ch9kj8";
		Asgmt_24_Pg1 stringOperations = new Asgmt_24_Pg1();
		stringOperations.sumOfDigitsFromString(input);
	}
}
