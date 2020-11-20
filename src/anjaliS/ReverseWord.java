package anjaliS;

public class ReverseWord {
	void wordReverse(String str) {
		for (int index = str.length() - 1; index >= 0; index--) {
			System.out.print(str.charAt(index));
		}
	}

	public static void main(String args[]) {
		ReverseWord reverseword = new ReverseWord();
		reverseword.wordReverse("This is life");
	}
}
