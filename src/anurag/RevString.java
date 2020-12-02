package anurag;

//Assignment 19

/*WAP to Reverse a given string
 *input : This is Technocredits
 *ouitput :stiderconhcet si siht
 */

public class RevString {

	void displayString(String str) {

		for (int index = str.length() - 1; index >= 0; index--) {

			System.out.print(str.charAt(index));

		}
	}

	public static void main(String args[]) {

		RevString revstring = new RevString();
		revstring.displayString("This is Technocredits");
	}

}
