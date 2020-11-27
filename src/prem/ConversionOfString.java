package prem;

public class ConversionOfString {
	void caseConversionOfString(String word) {
		System.out.println("Given String is ::"+word);
		System.out.print("String Coversion from Lower to Upper case and viceversa :: ");
		for(int index=0;index<word.length();index++) {
			char ch= word.charAt(index);
			if(Character.isUpperCase(ch))
				ch=Character.toLowerCase(ch);
			else if(Character.isLowerCase(ch)) {
				ch=Character.toUpperCase(ch);
			}
			System.out.print(ch);
		}
	}
	public static void main(String[] args) {
		new ConversionOfString().caseConversionOfString("tE1GfrEsT");
	}
}