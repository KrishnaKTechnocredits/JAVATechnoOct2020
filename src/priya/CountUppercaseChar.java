//Program 1:  Return true if UpperCase characters count are more than lowercase else return false.
//input : TechnoCrediTS///output : false  

package priya;

public class CountUppercaseChar {

	boolean countUpperToLowercase(String input) {
		int upperCount = 0;
		int lowerCount = 0;
		for(int index =0; index < input.length(); index++) {
			if(Character.isUpperCase(input.charAt(index)))
				upperCount++;
			if(Character.isLowerCase(input.charAt(index)))
				lowerCount++;
		}
		if(upperCount > lowerCount)
			return true;
		return false;
	}
	public static void main(String args[]) {
		String str = "TechnoCrediTS";
		boolean flag = new CountUppercaseChar().countUpperToLowercase(str);
		System.out.println(flag);
	}
	
}
