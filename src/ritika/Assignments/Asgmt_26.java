package ritika.Assignments;

/* Assignment - 26: 23rd Nov'2020
convert all capital letters to small and small to capitial.

String msg = "tE1GfrEsT";
output : Te1gFReSt

Hint : isUpperCase(), isLowerCase(), toUpperCase(), toLowerCase()
*/
public class Asgmt_26 {

	String convertStringCase(String input) {
		String changedInput = "";
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isLowerCase(ch)) {
				changedInput += Character.toUpperCase(ch);
			} else if (Character.isUpperCase(ch))
				changedInput += Character.toLowerCase(ch);
			else
				changedInput += ch;
		}
		return changedInput;
	}

	public static void main(String[] args) {
		String input = "tE1GfrEsT";
		Asgmt_26 convertCase = new Asgmt_26();
		System.out.println("Converted String is: " + convertCase.convertStringCase(input));
	}
}
