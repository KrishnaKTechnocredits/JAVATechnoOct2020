/*
 WAP to print Reverse a given String.
 
 input : This is technocredits
 output : stiderconhcet si sihT  

 */

package yogita;

class ReverseString {
	void reverseString(String name) {
		System.out.println("String is: " + name);
		System.out.print("Reverse String is :");
		for (int i = name.length() - 1; i >= 0; i--) {
			System.out.print(name.charAt(i));
		}
	}

	public static void main(String[] args) {
		ReverseString reverse = new ReverseString();
        reverse.reverseString("technocredits");

	}
}