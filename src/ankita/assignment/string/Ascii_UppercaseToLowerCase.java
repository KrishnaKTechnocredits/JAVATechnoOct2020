/*Assignment 31 :  2nd Dec 2020
Program 1: 
Convert UpperCase into a LowerCase using ASCII 
Given String = "TechnoCreditS"
Expected String = "technocredits"*/
package ankita.assignment.string;

public class Ascii_UppercaseToLowerCase {

	void convertUppercaseToLowerCase(String str) {
		int num = 0;
		String temp = "";
		System.out.println("Input : " + str);
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= 65 && str.charAt(i) <= 90)
				temp = temp + (char) (str.charAt(i) + 32);
			else
				temp = temp + str.charAt(i);
		}
		System.out.println("Output : " + temp);
	}

	public static void main(String[] args) {
		System.out.println("==Convert UpperCase into a LowerCase using ASCII==\n");
		String str = "TechnoCreditS";
		new Ascii_UppercaseToLowerCase().convertUppercaseToLowerCase(str);
	}
}