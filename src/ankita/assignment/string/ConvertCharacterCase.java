/*Assignment - 26: 23rd Nov'2020  
convert all capital letters to small and small to capitial.

String msg = "tE1GfrEsT";
output : Te1gFReSt

Hint : isUpperCase(), isLowerCase(), toUpperCase(), toLowerCase()
*/
package ankita.assignment.string;

public class ConvertCharacterCase {

	void convertCharCase(String str) {
		System.out.println("Input : " + str);
		String temp = "";
		for (int i = 0; i < str.length(); i++) {
			if (Character.isUpperCase(str.charAt(i)))
				temp = temp + Character.toLowerCase(str.charAt(i));
			else if (Character.isLowerCase(str.charAt(i)))
				temp = temp + Character.toUpperCase(str.charAt(i));
			else
				temp = temp + str.charAt(i);
		}
		System.out.println("Output : " + temp);
	}

	public static void main(String[] args) {
		new ConvertCharacterCase().convertCharCase("tE1GfrEsT");
	}
}