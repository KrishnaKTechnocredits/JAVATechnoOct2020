
//Find the frequency of character from a given String array.
package poojap;

class Assignment15 {
	void charOccurance(String[] string, char ch) {
		int cnt = 0;
		for (int index = 0; index < string.length; index++) {
			for (int i = 0; i < string[index].length(); i++)
				if (string[index].charAt(i) == ch)
					cnt++;
			System.out.print(string[index] + "\t");
		}
		System.out.println("\nOccurance of Character " + ch + " is:" + cnt);
	}

	public static void main(String[] args) {
		Assignment15 assignment15 = new Assignment15();
		String[] arr = { "Yogita", "pooja", "Monika", "Nutan" };
		assignment15.charOccurance(arr, 'o');
	}
}