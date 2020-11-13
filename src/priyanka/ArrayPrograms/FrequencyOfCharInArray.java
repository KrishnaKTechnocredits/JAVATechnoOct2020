package priyanka.ArrayPrograms;

/*Program 1  :  [ Compulsory ]
Find the frequency of character from a given String array. [Estimated time: 15-20 mins]
sample input array : { "technocredits","elephant","earthear"} and char is 'e'
output : technocredits -> 2
              elephant -> 2
              earth -> 1
              
              Total occurrence of e -> 5 */
import java.util.Scanner;

public class FrequencyOfCharInArray {
	void frequencyOfCharInArr(String[] string, char character) {
		int totalCount = 0;
		for (int i = 0; i < string.length; i++) {
			int Count = 0;
			for (int index = 0; index < string[i].length(); index++) {
				if (string[i].charAt(index) == character) {
					Count++;
					totalCount++;
				}
			}
			System.out.println("Charater " + character + " Occured in " + string[i] + ": " + Count);
		}
		System.out.println("Charater " + character + " Occured in all strings: " + totalCount);
	}

	public static void main(String[] args) {
		FrequencyOfCharInArray frequencyOfCharInArray = new FrequencyOfCharInArray();
		System.out.println("Enter number of strings you want to enter: ");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		String[] string = new String[number];
		for (int index = 0; index < number; index++) {
			System.out.println("Please enter name" + (index + 1) + ": ");
			string[index] = scanner.next();
		}
		System.out.println("Please enter character you want to search in string: ");
		frequencyOfCharInArray.frequencyOfCharInArr(string, scanner.next().charAt(0));
		scanner.close();
	}

}
