package shrutiC;

import java.util.Scanner;

/*
 * Program 1:  return true if UpperCase characters count are more than lowercase else return false.
	input : TechnoCrediTS
	output : false
*/

public class Program1 {

	boolean isUppercaseCntHigher(String string) {

		int upperCaseCnt = 0, lowerCaseCnt = 0;

		for (int i = 0; i < string.length(); i++) {
			char ch = string.charAt(i);
			if (Character.isUpperCase(ch)) {
				upperCaseCnt++;

			} else if (Character.isLowerCase(ch)) {
				lowerCaseCnt++;
			}
		}

		if(upperCaseCnt>lowerCaseCnt)
			return true;	
		else
			return false;
	}

	public static void main(String[] args) {
		Program1 object = new Program1();
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a string :");
		String input = sc.next();
		if(object.isUppercaseCntHigher(input))
			System.out.println("Output : "+true+" (Upper case char count is more)");
		else
			System.out.println("Output : "+false+" (Lower case char count is more)");

	}

}