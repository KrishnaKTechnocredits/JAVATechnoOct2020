package anurag;

//Assignment 15

/*Find the frequency of character from a given String array. 
sample input array : { "technocredits","elephant","earth"} and char is 'e'
output : technocredits -> 2
              elephant -> 2
              earth -> 1
              Total occurrence of e -> 5 */

public class FreqOfChar {

	void display(String arr[]) {

		int count2 = 0; // overall count

		for (int index = 0; index < arr.length; index++) {

			int count = 0; // individual count
			for (int j = 0; j < arr[index].length(); j++) {

				if (arr[index].charAt(j) == 'e') {
					count++;
					count2++;
				}
			}

			System.out.println("Count value for e in " + arr[index] + " -> " + count);
		}

		System.out.println("Total occurrance of e -> " + count2);
	}

	public static void main(String[] args) {

		FreqOfChar freqofchar = new FreqOfChar();

		String str[] = { "technocredits", "elepahnt", "earth" };

		freqofchar.display(str);

	}
}