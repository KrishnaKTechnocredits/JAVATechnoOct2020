/*Assignment-19 : 
Program : 1 
WAP to print Reverse a given String.
input : This is technocredits
output : stiderconhcet si sihT  

*/
package poojap;

public class reverseString {

	String reverse(String word) {
		String reverse = "";
		for (int i = word.length() - 1; i >= 0; i--) {
			reverse = reverse + word.charAt(i);
		}
		return reverse;
	}

	public static void main(String[] args) {
		reverseString reverseString = new reverseString();
		String string = reverseString.reverse("This is Technocredits ");
		System.out.println("Reverse String is :" + string);
	}
}
