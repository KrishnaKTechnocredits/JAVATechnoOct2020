//Assignment - 26: 23rd Nov'2020 //// Note : Should be completed by 24th Nov EOD
//convert all capital letters to small and small to capitial.
//String msg = "tE1GfrEsT";////output : Te1gFReSt

package priya;

public class ConvertCaptialToSmallandSmallToCapital {

	void processData(String input) {
		String str = "";
		for (int index = 0; index < input.length(); index++) {

			char ch = input.charAt(index);
			if (Character.isUpperCase(ch)) {
				str = str + Character.toLowerCase(ch);
			} else if (Character.isLowerCase(ch)) {
				str = str + Character.toUpperCase(ch);
			}
		}
		System.out.println("Output : " + str);
	}

	public static void main(String[] args) {
		ConvertCaptialToSmallandSmallToCapital upperCaseToLowerAndLowerCaseToUpper = new ConvertCaptialToSmallandSmallToCapital();
		String str = "tE1GfrEsT";
		upperCaseToLowerAndLowerCaseToUpper.processData(str);
	}
}
