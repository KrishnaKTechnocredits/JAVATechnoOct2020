//Program 1: Convert UpperCase into a LowerCase using ASCII 
//Given String = "TechnoCreditS"///Expected String = "technocredits"

package priya;

public class UppercaseToLowercaseASCII {

	void convertUpperToLower(String word) {
		int total = 0;
		String s = "";
		for (int index = 0; index < word.length(); index++) {
			char ch = word.charAt(index);
			if (ch >= 65 && ch <= 90) {
				total = ch + 32;
				ch = (char) total;
			}
			s = s + ch;
		}
		System.out.println("Conversion of string is : " + s);
	}

	public static void main(String[] args) {
		UppercaseToLowercaseASCII uppercasetolowercase = new UppercaseToLowercaseASCII();
		uppercasetolowercase.convertUpperToLower("TECHNOCREDITS");
	}
}
