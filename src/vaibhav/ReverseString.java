package vaibhav;
/*Assignment-19 : 

Program : 1 
WAP to print Reverse a given String.
input : This is technocredits
output : stiderconhcet si sihT  */

public class ReverseString {
		
	public static void reverse(String given) {
		String reverse = "";
		for (int index = given.length()-1; index >= 0; index--) {
			reverse +=given.charAt(index);		
		}	
		System.out.println("Reversed word is : "+reverse);
	}

	public static void main(String[] args) {
		String given="This is technocredits";
		ReverseString.reverse(given);
	}
}
