package sadhana;
import java.util.Scanner;

/*Assignment 15 : 11th Oct 2020 

Program 1  :  [ Compulsory ]
Find the frequency of character from a given String array. [Estimated time: 15-20 mins]
sample input array : { "technocredits","elephant","earthear"} and char is 'e'
output : technocredits -> 2
              elephant -> 2
              earth -> 1
              Total occurrence of e -> 5*/

public class CharInArray {

	public void freqOfCharacter(String[] arr, char ch) {
		int totalCount = 0;
		for (int i = 0; i < arr.length; i++) {
			String temp = arr[i];
			for (int j = 0; j < temp.length(); j++) {
				if (temp.charAt(j) == ch) {
					totalCount++;
				}
			}

		}
		System.out.println(" Total occurrence of " + ch + "-->" + totalCount);

	}

	public static void main(String[] args) {

		CharInArray freq = new CharInArray();

		String array[] = new String[2];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array: ");
		for (int i = 0; i < array.length; i++) {

			array[i] = sc.next();
		}

		System.out.println("Enter the character: ");

		char ch = sc.next().charAt(0);
		freq.freqOfCharacter(array, ch);

	}

}
