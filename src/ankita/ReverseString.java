/*WAP to print Reverse a given String.
input : This is technocredits
output : stiderconhcet si sihT  
7.20-7.27
*/
package ankita;

public class ReverseString {
	String getReverseString(String input) {
		String output = "";
		for (int i = input.length() - 1; i >= 0; i--) {
			output = output + input.charAt(i);
		}
		return output;
	}

	public static void main(String[] args) {
		String input = "This is technocredits";
		System.out.println("Reversed String :" + new ReverseString().getReverseString(input));
	}
}
