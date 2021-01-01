/*Assignment  32:
Program 1:  return true if UpperCase characters count are more than lowercase else return false.
input : TechnoCrediTS
output : false*/

package shrutiS.assignment32;

public class AsciiCountBoolean {
	
	boolean compareUpperLowerCase(String input) {
		int countUpper=0,countLower =0;
		for(int index=0; index<input.length(); index++) {
			char ch = input.charAt(index);
			if(ch>=65 && ch<=90)
				countUpper++;
			else if(ch>=97 && ch<=122)
				countLower++;
		}
		if(countUpper > countLower) 
			return true;
		return false;
	}
	
	public static void main(String[] args) {
		AsciiCountBoolean asciiCount = new AsciiCountBoolean();
		String input ="TechnoCrediTS";
		System.out.println("Input = "+input);
		Boolean output = asciiCount.compareUpperLowerCase(input);
		System.out.println("Output= "+output);
	}

}
