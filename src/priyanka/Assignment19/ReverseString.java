package priyanka.Assignment19;

/*Program : 1 
WAP to print Reverse a given String.
input : This is technocredits
output : stiderconhcet si sihT  
*/
public class ReverseString {

	void reverseStr(String str) {
		String temp = "";
		for (int index = str.length() - 1; index >= 0; index--) {
			temp = temp + str.charAt(index);
		}
		System.out.println("The reverse string is: " + temp);
	}

	public static void main(String[] a) {
		ReverseString reverseString = new ReverseString();
		String str = "This is technocredits";
		System.out.println("The string is: " + str);
		reverseString.reverseStr(str);
	}
}
