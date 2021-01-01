//Find the frequency of character from a given String array.

package yogita;

class StringOccurance {
	void charOccurance(String[] name, char ch) {
		int cnt = 0;

		for (int index = 0; index < name.length; index++) {
			for (int i = 0; i < name[index].length(); i++)
				if (name[index].charAt(i) == ch)
					cnt++;
			System.out.print(name[index] + "\t");
		}
		System.out.println("\nOccurance of Character " + ch + " is:" + cnt);
	}

	public static void main(String[] args) {
		StringOccurance string = new StringOccurance();
		String[] arr = { "Yogita", "pooja", "Shivani", "Madhuri" };
		string.charOccurance(arr, 'o');
	}
}