/*
return true if UpperCase characters count are more than lowercase else return false.
input : TechnoCrediTS
output : false
*/

package vishakha;

public class Asgnmt32_CheckCountOfCharCase {
	
	public void countCase(String string) {
		int upperCaseCount=0;
		int lowerCaseCount=0;
		for(int index=0; index<string.length(); index++) {
			if(Character.isUpperCase(string.charAt(index)))
				upperCaseCount++;
			else if(Character.isLowerCase(string.charAt(index)))
				lowerCaseCount++;
		}
		System.out.println("Is uppercase count is greater than lowercase count: "+(upperCaseCount>lowerCaseCount));
	}

	public static void main(String[] args) {
		new Asgnmt32_CheckCountOfCharCase().countCase("TechnoCrediTS");
	}
}