/*Assignment-19 : 

Program : 1 
WAP to print Reverse a given String.
input : This is technocredits
output : stiderconhcet si sihT  */

package kajol.String.Array.Programs;

import java.util.Scanner;

public class ReverseString {
	
	String reverseUserDefinedString(String inputString) {
		String reverseString="";
		for(int index=inputString.length()-1;index>=0;index--) {
			reverseString+=inputString.charAt(index);
		}
		return reverseString;
		
	}
	
	public static void main(String[] args) {
		System.out.println("Please Enter a String to reverse:");
		Scanner scanner=new Scanner(System.in);
		String reverseString=new ReverseString().reverseUserDefinedString(scanner.nextLine());
		System.out.println("Reverse String is : "+reverseString);
	}
}
