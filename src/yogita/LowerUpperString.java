/*
Convert all capital letters to small and small to capitial.

 String msg = "tE1GfrEsT";
 output : Te1gFReSt

Hint : isUpperCase(), isLowerCase(), toUpperCase(), toLowerCase()

 */
package yogita;

public class LowerUpperString {

	void LowerUpperCaseConversion(String name) {
		System.out.println("String is:" + name);
		String temp = "";
		for (int i = 0; i < name.length(); i++) {
			char ch = name.charAt(i);
			if (Character.isLowerCase(ch)) {
				temp += Character.toUpperCase(ch);
			} else if (Character.isUpperCase(ch)) {
				temp += Character.toLowerCase(ch);
			}
		}

		System.out.println("After Conversion String is:" + temp);
	}

	public static void main(String[] args) {
		LowerUpperString lowerUpper = new LowerUpperString();
		String str = "technoCREDITS";
		lowerUpper.LowerUpperCaseConversion(str);

	}
}
