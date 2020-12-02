/*program 1: sum of all digits from a given string  
input: te1ch9kj8 
output:= 18*/

package poojap;

public class Assignment24 {

	void stringDigit() {
		String string = "te1ch9kj8";
		String digit = "";
		int sum = 0;
		for (int i = 0; i < string.length(); i++) {
			char ch = string.charAt(i);
			if (Character.isDigit(ch)) {
				digit = digit + ch;
				System.out.print(" " + digit);
				sum = sum + Integer.parseInt(digit);
				digit = "";
			}
		}
		System.out.println("\nSum of Digit is : " + sum);
	}

	public static void main(String[] args) {
		Assignment24 assignment24 = new Assignment24();
		System.out.println("Digit In the String is : ");
		assignment24.stringDigit();
	}
}
