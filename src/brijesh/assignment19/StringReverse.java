package brijesh.assignment19;

import java.util.Scanner;

public class StringReverse {
	
	public String reverseString(String string) {
		String strReverse="";
		for(int index=string.length()-1; index>= 0; index--)
		{
			strReverse+= string.charAt(index);
		}
		return strReverse;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter string: ");
		String string = scanner.nextLine();
		System.out.println("Reverse String: "+new StringReverse().reverseString(string));
		scanner.close();
	}
}
