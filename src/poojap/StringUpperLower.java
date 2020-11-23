/* Assignment - 26: 23rd Nov'2020  
convert all capital letters to small and small to capitial.
String msg = "tE1GfrEsT";
output : Te1gFReSt*/

package poojap;

public class StringUpperLower {

	void ConvertString(String string) {
		String result = "";
		for (int i = 0; i < string.length(); i++) {
			char ch = string.charAt(i);
			if (Character.isUpperCase(ch)) {
				result = result + Character.toLowerCase(ch);
			} else if (Character.isLowerCase(ch)) {
				result = result + Character.toUpperCase(ch);
			}
		}
		System.out.println(result);
	}

	public static void main(String[] args) {
		StringUpperLower stringUpperLower = new StringUpperLower();
		stringUpperLower.ConvertString("tE1GfrEsT");
	}
}
