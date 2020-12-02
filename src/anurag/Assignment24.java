/*program 1: sum of all digits from a given string  
input: te1ch9kj8 
output:= 18*/

package anurag;

public class Assignment24 {

	void display() {
		int sum = 0;
		char ch;
		int n;
		String number = "te1ch9kj8";

		for (int i = 0; i < number.length(); i++) {

			ch = number.charAt(i);

			if (Character.isDigit(ch)) {
				n = Character.getNumericValue(ch);
				System.out.println(n);
				sum = sum+n;
			}
		}
		System.out.println("Sum of digits in the String is :  " +sum );
	}

	public static void main(String[] args) {

		Assignment24 assignment24 = new Assignment24();
		assignment24.display();

	}

}
