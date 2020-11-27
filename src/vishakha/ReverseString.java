/*Program : 1 
WAP to print Reverse a given String.
input : This is technocredits
output : stiderconhcet si sihT*/

package vishakha;

import java.util.Scanner;

public class ReverseString {
	
	private void reverseString(String str) {
		String newStr = "";
		for(int index=str.length()-1; index>=0; index--){
			newStr += str.charAt(index);
		}
		System.out.println(newStr);		
	}
	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a string");
	String str = sc.nextLine();
	new ReverseString().reverseString(str);
	}
}
