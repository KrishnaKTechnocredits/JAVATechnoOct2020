package milind;

public class PrintReverseString {
	
	void reverseString(String input) {
		String reverseStringOfInput = "";
		for(int index = input.length()-1; index >= 0; index--) {
			reverseStringOfInput = reverseStringOfInput + input.charAt(index);
		}
		System.out.println(reverseStringOfInput);
	}
	
	public static void main(String[] args) {
		String input = "This is technocredits";
		PrintReverseString printReverseString = new PrintReverseString();
		printReverseString.reverseString(input);
	}

}
