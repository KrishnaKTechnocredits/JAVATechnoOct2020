	package raghvendra;

public class StringFunctions {
	int digitCount;
	int letterCount;
	int upperCharCount;
	int lowerCharCount;
	int specialCharCount;
	void returnStringCharType(String rr) {
		for(int index=0;index<rr.length();index++) {
			char ch=rr.charAt(index);
			if(Character.isDigit(ch)==true)
				digitCount++;
			else if (Character.isLetter(ch)==true) 
				{
				letterCount++;
				if (Character.isUpperCase(ch)==true) 
					upperCharCount++;
					else if(Character.isLowerCase(ch)==true) 
					   lowerCharCount++;
				}
			else specialCharCount++;
		}
		System.out.println("letters count: "+letterCount);
		System.out.println("Digits count: "+digitCount);
		System.out.println("Uppercase letters count: "+upperCharCount);
		System.out.println("Lowercase letters count: "+lowerCharCount);
		System.out.println("Spcial Characters count: "+specialCharCount);
		System.out.println("--------------------");
}

	public static void main(String[] args) {
		StringFunctions stringFunctions=new StringFunctions();
		stringFunctions.returnStringCharType("teCh@N12JCR#iT8s_B");
		StringFunctions stringFunctions1=new StringFunctions();
		stringFunctions1.returnStringCharType("ragh@N12JCR####iT8s_B");
	}

}
