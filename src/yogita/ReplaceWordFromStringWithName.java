/*
 Assignment - 47 : 27th Dec'2020
Replace second last occurance of "Hi" with your name.
String msg = "Hi globant Hello Hi Hi globant Hi Hello Hello globant Hi Techno Credits Techno";
output : Hi globant Hello Hi Hi globant Maulik Hello Hello globant Hi Techno Credits Techno  

 */

package yogita;

public class ReplaceWordFromStringWithName {
	String replaceWord(String str, String wordReplace) {
		System.out.println("String is:" + str);
		String input[] = str.split(" ");
		int cnt = 0;
		for (int i = input.length - 1; i >= 0; i--) {
			if (input[i].equals(wordReplace)) {
				cnt++;
				if (cnt == 2)
					input[i] = "Yogita";
			}
		}
		System.out.println("\nAfter Replaced String is:");
		String output = "";
		for (String string : input) {
			output = output + " " + string;
		}
		output = output.trim();
		return output;
	}

	public static void main(String[] args) {
		ReplaceWordFromStringWithName replaceWithName = new ReplaceWordFromStringWithName();
		String input = "Hi globant Hello Hi Hi globant Hi Hello Hello globant Hi Techno Credits Techno";
		System.out.println(replaceWithName.replaceWord(input, "Hi"));
	}
}
