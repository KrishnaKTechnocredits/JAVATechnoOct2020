//Program : 1 : WAP to print Reverse a given String.
//input : This is technocredits
//output : stiderconhcet si sihT  

package priya;

public class ReverseString {

	void reverseWord(String word) {
		for (int index = word.length() - 1; index >= 0; index--) {
			System.out.print(word.charAt(index));
		}
	}

	public static void main(String[] args) {
		ReverseString reversestring = new ReverseString();
		reversestring.reverseWord("This is technocredits");
	}
}
