/*
 
WAP to Find max repeating word with its freq.
input : Hi Hello Hi Techno Hello Hi
output : Hi -> 3

*/
package yogita;

class MaxRepeatingWord {
	int max = 0;
	String maxStr = null;

	void countFre(String[] name) {

		for (int i = 0; i < name.length; i++) {
			int cnt = 1;
			String str = name[i];

			if (!str.equals("")) {
				for (int j = i + 1; j < name.length; j++) {
					if (name[i].equals(name[j]))
						cnt++;
				}
			}

			if (max < cnt) {
				max = cnt;
				maxStr = name[i];
			}
		}

		System.out.println("Max repeating Word is:" + maxStr);
		System.out.println("Frequency is:" + max + " times");

	}

	public static void main(String[] args) {
		MaxRepeatingWord repeatingWord = new MaxRepeatingWord();
		String[] arr = { "hi", "hello", "gd", "hi", "hi", "hi", "gn", "hi" };
		repeatingWord.countFre(arr);
	}

}
