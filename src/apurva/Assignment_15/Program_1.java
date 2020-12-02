package apurva.Assignment_15;

/*Find the frequency of character from a given String array. [Estimated time: 15-20 mins]
sample input array : { "technocredits","elephant","earthear"} and char is 'e'
output : technocredits -> 2
              elephant -> 2
              earth -> 1
              Total occurrence of e -> 5*/
import java.util.Scanner;

public class Program_1 {
	void findFreqOfEachCharFromWord(String[] word, char ch) {
		int totalCount = 0;
		for (int index = 0; index < word.length; index++) {
			int individualCount = 0;
			for (int j = 0; j < word[index].length(); j++) {
				if (word[j].charAt(index) == ch) {
					individualCount++;
					totalCount++;
				}
			}
			System.out.println("Occurance of " + ch + "' in " + word[index] + ": " + individualCount);
		}
		System.out.println("Occurance of " + ch + "' in given string: " + totalCount);
	}

	public static void main(String[] args) {
		System.out.println("Please enter the string: ");
		Scanner scanner = new Scanner(System.in);
		int temp = scanner.nextInt();
		String[] word = new String[temp];
		for (int index = 0; index < temp; index++) {
			System.out.println("Please enter name" + (index + 1) + ": ");
			word[index] = scanner.next();
		}
		System.out.println("Please enter character you want to search in string: ");
		new Program_1().findFreqOfEachCharFromWord(word, scanner.next().charAt(0));
		scanner.close();
	}
}