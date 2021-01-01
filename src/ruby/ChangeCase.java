package ruby;

/*Assignment - 26: 23rd Nov'2020  
convert all capital letters to small and small to capitial.

String msg = "tE1GfrEsT";
output : Te1gFReSt

Hint : isUpperCase(), isLowerCase(), toUpperCase(), toLowerCase()

 Note : Should be completed by 24th Nov EOD */

public class ChangeCase {

	void caseChange(String input) {
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isLowerCase(ch)) {
				ch = Character.toUpperCase(ch);
			} else if (Character.isUpperCase(ch)) {
				ch = Character.toLowerCase(ch);
			}
			System.out.print(ch);
		}
	}

	public static void main(String[] args) {
		ChangeCase changeCase = new ChangeCase();
		changeCase.caseChange("tE1GfrEsT");
	}

}
