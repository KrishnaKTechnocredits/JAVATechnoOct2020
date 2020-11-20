package rohan;

import java.util.Scanner;

/*Program : 1 
WAP to print Reverse a given String.
input : This is technocredits
output : stiderconhcet si sihT  */

public class ReverseString {
	
	public void stringReverse(String str) {
		String revStr="";
		for(int index=str.length()-1;index>=0;index--) {
			revStr += str.charAt(index);
		}
		System.out.println("-------Outpu-------");
		System.out.println(revStr);
	}
	
	public static void main(String[] args) {
		ReverseString reverseString = new ReverseString();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str = sc.nextLine();
		reverseString.stringReverse(str);
	}
}
