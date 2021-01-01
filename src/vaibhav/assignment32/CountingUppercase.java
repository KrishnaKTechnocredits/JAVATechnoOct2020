package vaibhav.assignment32;

/*Program 1:  return true if UpperCase characters count are more than lowercase else return false.
input : TechnoCrediTS
output : false*/

public class CountingUppercase {
	
	private static boolean isUppercaseMax(String inputString) {
		int uCount = 0;
		int lCount = 0;
		for (int i = 0 ; i < inputString.length();i++) {
			char temp = inputString.charAt(i);
			if (Character.isUpperCase(temp))
				uCount++;
			else if (Character.isLowerCase(temp))
				lCount++;		
		}
		if (uCount > lCount)
			return true;
		else
			return false;			
	}

	public static void main(String[] args) {
		String inputString = "TechnoCrediTS";
		boolean flag=CountingUppercase.isUppercaseMax(inputString);
		System.out.println(flag);
	}
}
