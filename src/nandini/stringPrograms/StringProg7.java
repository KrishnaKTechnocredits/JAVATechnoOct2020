package nandini.stringPrograms;

public class StringProg7 {
  
	void convertToLowerUsingASCII(String str) {
		String temp = "";
		char ch = str.charAt(0);
		for (int index = 0; index < str.length(); index++) {
			ch = str.charAt(index);
			int asciiCode = ch;
			if (asciiCode >= 65 && asciiCode <= 90) {
				char ch1 = (char) (ch + 32);
				temp += ch1;
			}if(asciiCode>=97 && asciiCode<=122) {
				temp+=ch;
			}
		}
		System.out.print("Converted string is: "+temp);
	}
	public static void main(String args[]) {
		String input = "TechnoCreditS";
		new StringProg7().convertToLowerUsingASCII(input);
	}
}
