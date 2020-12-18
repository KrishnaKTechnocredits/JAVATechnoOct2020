package rohan;

/*
 * Program 1: 
Convert UpperCase into a LowerCase using ASCII 
Given String = "TechnoCreditS"
Expected String = "technocredits"
 */

public class UpperToLowerAscii {
	
	public static void main(String[] args) {
		UpperToLowerAscii upperToLowerAscii = new UpperToLowerAscii();
		String s = "Tec+hno_Cre&ditS";
		System.out.println("Original String: "+s);
		upperToLowerAscii.convertLowerToUpper(s);
	}
	
	void convertLowerToUpper(String s) {
		String tmpStr="";
		int ascii;
		for(int index=0;index<s.length();index++) {
			if(Character.isLetter(s.charAt(index))) {
				ascii = s.charAt(index);
				if(ascii>=65 && ascii<=90) {
					ascii+=32;
					tmpStr += (char)ascii; 
				}
				else {
					ascii-=32;
					tmpStr += (char)ascii;
				}
			}
			else
				tmpStr += s.charAt(index);
		}
		System.out.println("Converted String: "+tmpStr);
	}
}
