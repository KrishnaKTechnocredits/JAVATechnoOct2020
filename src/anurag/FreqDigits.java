package anurag;

/*Assignment 17 : 13th Nov'2020 

Same as Assignment 16 but each frequency should be printed single time.
input : aakanksha
output :      a -> 4
              k -> 2
              n -> 1
              s -> 1
              h -> 1 */

public class FreqDigits {

	void display() {

		String str = "aakanksha";
		int count = 0;

		for (int index = 0; index < str.length(); index++) {

			char ch = str.charAt(index);
			count = 0;
			for (int j = index; j < str.length(); j++) {

				if (str.charAt(j) == ch) {

					count++;

				}

			}
			if (str.charAt(index) != '-')
				System.out.println("Occurence of " + str.charAt(index) + " is :" + count);

			str = str.replace(str.charAt(index), '-');

		}

	}

	public static void main(String[] args) {

		FreqDigits freqdigits = new FreqDigits();

		freqdigits.display();

	}
}
