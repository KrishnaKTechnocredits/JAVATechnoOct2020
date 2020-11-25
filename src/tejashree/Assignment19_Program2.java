package tejashree;

//Reverse every word in an array and reverse array
public class Assignment19_Program2 {
	void wordReverse(String[] str1) {
		String str = str1[0];
		for (int index = str1.length - 1; index >= 0; index--) {
			str = str1[index];
			for (int i = str.length() - 1; i >= 0; i--) {
				char ch=str.charAt(i);
				System.out.print(ch);
			}
		}

	}

	public static void main(String args[]) {
		Assignment19_Program2 reverseword = new Assignment19_Program2();
		String str[] = { "Rama", "Nishad","Rawade"};
		reverseword.wordReverse(str);
	}
}
