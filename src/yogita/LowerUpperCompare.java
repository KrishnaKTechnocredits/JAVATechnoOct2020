/*
 Program 1:  return true if UpperCase characters count are more than lowercase else return false.
 input : TechnoCrediTS
 output : false
*/
package yogita;

import java.util.Scanner;

public class LowerUpperCompare {
	int lowerCnt, upperCnt = 0;

	boolean findLowerUpperCount(String name) {
		System.out.println("String is:" + name);
		for (int i = 0; i < name.length(); i++) {
			char ch = name.charAt(i);
			if (Character.isUpperCase(ch))
				upperCnt++;
			else if (Character.isLowerCase(ch))
				lowerCnt++;
		}
		if (upperCnt > lowerCnt)
			return true;
		return false;
	}

	public static void main(String[] args) {
		LowerUpperCompare lowerUpper = new LowerUpperCompare();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String:");
		String input=sc.next();
		System.out.println("Result is:"+lowerUpper.findLowerUpperCount(input) );
		Scanner sc1 = new Scanner(System.in);
		System.out.println("\nEnter String:");
		String input1=sc1.next();
		System.out.println("Result is:"+lowerUpper.findLowerUpperCount(input1) );
		
	/*
		Boolean flag = lowerUpper.findLowerUpperCount(input);
		if (flag)
			System.out.println("True:Upper Case Characters Are more in String");
		else
			System.out.println("False:Lower Case Characters Are more in String");
			
	*/
		
		
	}

}
