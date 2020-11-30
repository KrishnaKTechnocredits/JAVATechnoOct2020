package anjaliS;

public class CharCountSingleTime {
	void charOccurance(String name, char ch) {
		int count = 0;
		for (int index = 0; index < name.length(); index++) {
			if (name.charAt(index) == ch)
				count++;
		}
		System.out.println("Count of Character " + ch + " is " + count);
	}

	public static void main(String args[]) {
		CharCountSingleTime charsingletime = new CharCountSingleTime();
		charsingletime.charOccurance("Anjali", 'a');
		charsingletime.charOccurance("Khushboo", 'o');

	}
}