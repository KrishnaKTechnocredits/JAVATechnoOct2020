package nandini.stringPrograms;

public class StringPropg9 {
	
	boolean countUpperLowerCase(String input) {
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
		boolean flag = new StringPropg9().countUpperLowerCase(str);
		System.out.println(flag);
		
	}
}
