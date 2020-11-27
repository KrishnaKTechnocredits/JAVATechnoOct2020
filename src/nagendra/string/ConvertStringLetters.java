package nagendra.string;

/*convert all capital letters to small and small to capitial.
String msg = "tE1GfrEsT";
output : Te1gFReSt
*/

public class ConvertStringLetters {

	void getConvertedString(String word) {
		String output = "";
		String systemOutput = "";
		for (int i = 0; i < word.length(); i++) {
			output = "";
			if (Character.isUpperCase(word.charAt(i))) {
				output += word.charAt(i);
				systemOutput += output.toLowerCase();
			} else {
				output += word.charAt(i);
				systemOutput += output.toUpperCase();
			}
		}
		System.out.println("After Converting word " + word + " -> " + systemOutput);
	}

	public static void main(String[] args) {
		ConvertStringLetters letters = new ConvertStringLetters();
		String msg = "tE1GfrEsT";
		letters.getConvertedString(msg);
	}
}
