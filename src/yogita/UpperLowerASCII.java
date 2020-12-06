/*
 Assignment 31 :  2nd Dec 2020
Program 1: 
Convert UpperCase into a LowerCase using ASCII 
Given String = "TechnoCreditS"
Expected String = "technocredits"
 
*/

package yogita;

public class UpperLowerASCII {

	void convertUpperLowerUsingASCII(String name) {
		String temp = "";
		char ch1;
		for (int i = 0; i < name.length(); i++) {
			char ch = name.charAt(i);
			int ascii = ch;
			if (ascii >= 65 && ascii <= 90) {
				ch1 = (char) (ch + 32);
				temp += ch1;
			}
			if (ascii >= 97 && ascii <= 122) {
				ch1 = (char) (ch - 32);
				temp += ch1;
			}
		}
		System.out.println("After Conversion String is:" + temp);
	}

	public static void main(String[] args) {
		String input = "TECHNOcreditsTECHNO";
		System.out.println("String is:" + input);
		new UpperLowerASCII().convertUpperLowerUsingASCII(input);
	}
}
