package mrunal;
/*Program 1: return true if UpperCase characters count are more
 * than lowercase else return false.
input : TechnoCrediTS
output : false */

public class prog1 {

	boolean caseCount(String input) {
		int upCount = 0;
		int lowCount = 0;
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (Character.isUpperCase(ch))
			upCount++;
		else if (Character.isLowerCase(ch))
			lowCount++;
		}
		if (upCount > lowCount)
			return true;
		else
			return false;
}
public static void main(String[] args) {
		String input = "TechNoCrediTS";
		prog1 program1 = new prog1();
		System.out.println("Input is: " + input);
		System.out.println("return true if UpperCase characters count are more"
				+ "than lowercase else return false.? -> " 
				+ program1.caseCount(input));
				}
			}


