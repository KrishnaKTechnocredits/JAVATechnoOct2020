package ritika.Assignments;

/*Program 5 : [ Compulsory ]
Java Program to Count the Number of Vowels in user defined string.

Input : technocredits
output : vowels are e , o, i
*/

public class Asgmt_15_Pg_5 {

	void findVowelsInWord(String word) {
		System.out.println("vowels in " + word + " are: ");
		for (int i = 0; i < word.length(); i++) {
			if (word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o'
					|| word.charAt(i) == 'u') {
				char ch = word.charAt(i);
				if (word.indexOf(ch) == i) {
					System.out.print(word.charAt(i) + " ");
				}
			}
		}
	}

	public static void main(String[] args) {
		String word = "technocredits";
		Asgmt_15_Pg_5 program5 = new Asgmt_15_Pg_5();
		program5.findVowelsInWord(word);
	}
}